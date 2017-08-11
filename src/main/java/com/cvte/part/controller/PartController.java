package com.cvte.part.controller;

import com.cvte.part.bean.*;
import com.cvte.part.dao.PartItemMapper;
import com.cvte.part.service.PartService;
import com.cvte.part.service.PropertyService;
import com.cvte.part.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class PartController {

   @Autowired
   private PartService partService;
   @Autowired
    private PropertyService propertyService;
    @Autowired
    private SpecificationService specificationService;


    /**
     * 判断物料是否存在规则
     * @param partClassName
     * @return Msg
     */
    @RequestMapping(value = "/part",method = RequestMethod.GET)
    @ResponseBody
    public Msg isPartClassWithRuleByName(@RequestParam("partClassName") String partClassName){
        if(partService.isPartClassWithRuleByName(partClassName)){
            return Msg.success().add("info",true);
        }
        return  Msg.success().add("info",false);
    }

    /**
     * 根据物料分类名称获得规则描述
     * @param partClassName
     * @return Msg
     */
    @RequestMapping(value = "/part_rule",method=RequestMethod.GET)
    @ResponseBody
    public Msg getRuleDesByPartClassName(@RequestParam("partClassName") String partClassName){
        List<String> propertyList = partService.getRuleDesByPartClassName(partClassName);
        return  Msg.success().add("propertyList",propertyList);
    }

    /**
     * 根据物料分类Id获得规则描述
     * @param partClassId
     * @return Msg
     */
    @RequestMapping(value = "/part_class_id_rule",method=RequestMethod.GET)
    @ResponseBody
    public Msg getRuleDesByPartClassId(@RequestParam("partClassId") String partClassId){
        List<String> propertyList = partService.getRuleDesByPartClassId(partClassId);
        return  Msg.success().add("propertyList",propertyList);
    }

    /**
     * 根据规格描述获得物料列表
     * @param specificationDesDetails
     * @return Msg
     */
    @RequestMapping(value = "/partSpec",method= RequestMethod.POST)
    @ResponseBody
    public Msg getPartItemsBySpec(@RequestBody List<SpecificationDesDetail> specificationDesDetails){
        Set<String> speDesIds = new HashSet<String>(specificationDesDetails.size());
        Set<String> speDesIdsMore = new HashSet<String>(specificationDesDetails.size());
        List<PartItem> partItems = null;//用于存储查询结果
        for(int i=0 ;i<specificationDesDetails.size();i++){
            String propertyName = specificationDesDetails.get(i).getPropertyName();
            String propertyValue = specificationDesDetails.get(i).getPropertyValue();
            if("颜色".equals(propertyName)){
               propertyValue = propertyValue.substring(0,1);
            }
            if("".equals(propertyValue)){
                continue;
            }
            //颜色：红，长度：10
            List<SpecificationDesDetail> specificationDesDetailList=specificationService.getSpecificatonDesByPropertyName(propertyName,propertyValue);
            if(specificationDesDetailList.size() == 1){
                speDesIds.add(specificationDesDetailList.get(0).getSpecDesId());
                partItems = partService.getPartItem(specificationDesDetailList.get(0).getSpecDesId());//匹配查询
            }else {
                System.out.println(specificationDesDetailList.size() == 1);
               /* for (int j = 0; j < specificationDesDetailList.size(); j++) {
                    speDesIdsMore.add(specificationDesDetailList.get(j).getSpecDesId());//模糊查询
                }
                Iterator<String> iteratorSet = speDesIdsMore.iterator();
                while (iteratorSet.hasNext()) {
                    String specDesId = iteratorSet.next();
                    partItems.addAll(partService.getPartItem(specDesId));
                }*/
            }
        }
        return Msg.success().add("partItems",partItems);
    }

    /**
     * 查询非关联物料列表
     * @param
     * @return Msg
     */
    @RequestMapping(value = "/partNoSpec",method= RequestMethod.GET)
    @ResponseBody
    public Msg getPartItemWithoutSpec(){
        List<PartItem> partItems_no_desc = partService.getPartItemWithoutSpec();
        return Msg.success().add("partItems_no_desc",partItems_no_desc);
    }

    /**
     * 关联还未关联的物料
     * @param
     * @return Msg
     */
    @RequestMapping(value = "/conPartWithSpec",method= RequestMethod.POST)
    @ResponseBody
    public Msg connectPartItemWithSpec(@RequestBody SpecificationDesDetailCustom specificationDesDetailCustom){
        PartItem partItem = partService.getPartClassIdByPartItemId(specificationDesDetailCustom.getPartItemId());
        PartClass partClass = partService.getPartClassById(partItem.getPartClassId());
        String specId;

        //根据规则Id 新建规格描述
        if(partClass.getRuleId() != null){
            specId = specificationService.saveSpecicationByRuleId(partClass.getRuleId());
        }else{
            return Msg.fail().add("fail_message","Fail to connect the part item,please set rule for part class first!");
        }
        //1.如果用户设置的规格描述已经存在，则直接关联
        Set<String> specDesIdSet = new HashSet<String>();
        List<String> specDesIdList = new ArrayList<String>();
        for(int i=0;i<specificationDesDetailCustom.getSpecList().size();i++){
            SpecificationDesDetail specificationDesDetail =specificationDesDetailCustom.getSpecList().get(i);
            List<SpecificationDesDetail> list = specificationService.getSpecificatonDesByPropertyName(specificationDesDetail.getPropertyName(),specificationDesDetail.getPropertyValue());
            for(int j=0;j<list.size();j++){
                specDesIdSet.add(list.get(i).getSpecDesId());
                specDesIdList.add(list.get(i).getSpecDesId());
            }
        }
        if(specDesIdSet.size() < specDesIdList.size()){//说明规格描述已经存在
            specDesIdList.removeAll(specDesIdSet);
            specId = specDesIdList.get(0);
        }else {
            //2.如果不存在，则先新建规格描述在进行关联
            for (int i = 0; i < specificationDesDetailCustom.getSpecList().size(); i++) {
                SpecificationDesDetail specificationDesDetail = specificationDesDetailCustom.getSpecList().get(i);
                specificationDesDetail.setSpecDesId(specId);
                specificationService.saveSpecificationDetail(specificationDesDetail);
            }
        }
        partItem.setSpecDesId(specId);
        partService.updatePartItem(partItem);
        System.out.println(specificationDesDetailCustom);
        return Msg.success();
    }
}
