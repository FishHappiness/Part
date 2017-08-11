package com.cvte.part.dao;

import com.cvte.part.bean.SpecificationDesDetail;
import com.cvte.part.bean.SpecificationDesDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationDesDetailMapper {
    long countByExample(SpecificationDesDetailExample example);

    int deleteByExample(SpecificationDesDetailExample example);

    int deleteByPrimaryKey(String specDesDetailId);

    int insert(SpecificationDesDetail record);

    int insertSelective(SpecificationDesDetail record);

    List<SpecificationDesDetail> selectByExample(SpecificationDesDetailExample example);

    SpecificationDesDetail selectByPrimaryKey(String specDesDetailId);

    int updateByExampleSelective(@Param("record") SpecificationDesDetail record, @Param("example") SpecificationDesDetailExample example);

    int updateByExample(@Param("record") SpecificationDesDetail record, @Param("example") SpecificationDesDetailExample example);

    int updateByPrimaryKeySelective(SpecificationDesDetail record);

    int updateByPrimaryKey(SpecificationDesDetail record);
}