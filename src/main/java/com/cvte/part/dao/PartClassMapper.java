package com.cvte.part.dao;

import com.cvte.part.bean.PartClass;
import com.cvte.part.bean.PartClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartClassMapper {
    long countByExample(PartClassExample example);

    int deleteByExample(PartClassExample example);

    int deleteByPrimaryKey(String partClassId);

    int insert(PartClass record);

    int insertSelective(PartClass record);

    List<PartClass> selectByExample(PartClassExample example);

    PartClass selectByPrimaryKey(String partClassId);

    int updateByExampleSelective(@Param("record") PartClass record, @Param("example") PartClassExample example);

    int updateByExample(@Param("record") PartClass record, @Param("example") PartClassExample example);

    int updateByPrimaryKeySelective(PartClass record);

    int updateByPrimaryKey(PartClass record);
}