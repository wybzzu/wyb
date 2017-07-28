package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.StStcntdtlR;
import com.huitu.api.hnsl.entity.StStcntdtlRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StStcntdtlRMapper {
    long countByExample(StStcntdtlRExample example);

    int deleteByExample(StStcntdtlRExample example);

    int deleteByPrimaryKey(String stcd);

    int insert(StStcntdtlR record);

    int insertSelective(StStcntdtlR record);

    List<StStcntdtlR> selectByExample(StStcntdtlRExample example);

    StStcntdtlR selectByPrimaryKey(String stcd);

    int updateByExampleSelective(@Param("record") StStcntdtlR record, @Param("example") StStcntdtlRExample example);

    int updateByExample(@Param("record") StStcntdtlR record, @Param("example") StStcntdtlRExample example);

    int updateByPrimaryKeySelective(StStcntdtlR record);

    int updateByPrimaryKey(StStcntdtlR record);
}