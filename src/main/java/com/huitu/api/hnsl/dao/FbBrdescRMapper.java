package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbBrdescR;
import com.huitu.api.hnsl.entity.FbBrdescRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbBrdescRMapper {
    long countByExample(FbBrdescRExample example);

    int deleteByExample(FbBrdescRExample example);

    int deleteByPrimaryKey(String brtp);

    int insert(FbBrdescR record);

    int insertSelective(FbBrdescR record);

    List<FbBrdescR> selectByExample(FbBrdescRExample example);

    FbBrdescR selectByPrimaryKey(String brtp);

    int updateByExampleSelective(@Param("record") FbBrdescR record, @Param("example") FbBrdescRExample example);

    int updateByExample(@Param("record") FbBrdescR record, @Param("example") FbBrdescRExample example);

    int updateByPrimaryKeySelective(FbBrdescR record);

    int updateByPrimaryKey(FbBrdescR record);
}