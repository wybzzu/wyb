package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.StStcntS;
import com.huitu.api.hnsl.entity.StStcntSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStcntSMapper {
    long countByExample(StStcntSExample example);

    int deleteByExample(StStcntSExample example);

    int deleteByPrimaryKey(String adcd);

    int insert(StStcntS record);

    int insertSelective(StStcntS record);

    List<StStcntS> selectByExample(StStcntSExample example);

    StStcntS selectByPrimaryKey(String adcd);

    int updateByExampleSelective(@Param("record") StStcntS record, @Param("example") StStcntSExample example);

    int updateByExample(@Param("record") StStcntS record, @Param("example") StStcntSExample example);

    int updateByPrimaryKeySelective(StStcntS record);

    int updateByPrimaryKey(StStcntS record);
}