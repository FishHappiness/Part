package com.cvte.part.dao;

import com.cvte.part.bean.PartItem;
import com.cvte.part.bean.PartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartItemMapper {
    long countByExample(PartItemExample example);

    int deleteByExample(PartItemExample example);

    int deleteByPrimaryKey(String partItemId);

    int insert(PartItem record);

    int insertSelective(PartItem record);

    List<PartItem> selectByExample(PartItemExample example);

    PartItem selectByPrimaryKey(String partItemId);

    int updateByExampleSelective(@Param("record") PartItem record, @Param("example") PartItemExample example);

    int updateByExample(@Param("record") PartItem record, @Param("example") PartItemExample example);

    int updateByPrimaryKeySelective(PartItem record);

    int updateByPrimaryKey(PartItem record);
}