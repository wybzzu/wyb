package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbWarncntS;
import com.huitu.api.hnsl.entity.FbWarncntSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbWarncntSMapper {
    long countByExample(FbWarncntSExample example);

    int deleteByExample(FbWarncntSExample example);

    int deleteByPrimaryKey(String adcd);

    int insert(FbWarncntS record);

    int insertSelective(FbWarncntS record);

    List<FbWarncntS> selectByExample(FbWarncntSExample example);

    FbWarncntS selectByPrimaryKey(String adcd);

    int updateByExampleSelective(@Param("record") FbWarncntS record, @Param("example") FbWarncntSExample example);

    int updateByExample(@Param("record") FbWarncntS record, @Param("example") FbWarncntSExample example);

    int updateByPrimaryKeySelective(FbWarncntS record);

    int updateByPrimaryKey(FbWarncntS record);
}