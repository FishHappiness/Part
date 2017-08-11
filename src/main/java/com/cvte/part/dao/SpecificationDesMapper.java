package com.cvte.part.dao;

import com.cvte.part.bean.SpecificationDes;
import com.cvte.part.bean.SpecificationDesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificationDesMapper {
    long countByExample(SpecificationDesExample example);

    int deleteByExample(SpecificationDesExample example);

    int deleteByPrimaryKey(String specDesId);

    int insert(SpecificationDes record);

    int insertSelective(SpecificationDes record);

    List<SpecificationDes> selectByExample(SpecificationDesExample example);

    SpecificationDes selectByPrimaryKey(String specDesId);

    int updateByExampleSelective(@Param("record") SpecificationDes record, @Param("example") SpecificationDesExample example);

    int updateByExample(@Param("record") SpecificationDes record, @Param("example") SpecificationDesExample example);

    int updateByPrimaryKeySelective(SpecificationDes record);

    int updateByPrimaryKey(SpecificationDes record);
}