package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbWarncntdtlR;
import com.huitu.api.hnsl.entity.FbWarncntdtlRExample;
import com.huitu.api.hnsl.entity.FbWarncntdtlRKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbWarncntdtlRMapper {
    long countByExample(FbWarncntdtlRExample example);

    int deleteByExample(FbWarncntdtlRExample example);

    int deleteByPrimaryKey(FbWarncntdtlRKey key);

    int insert(FbWarncntdtlR record);

    int insertSelective(FbWarncntdtlR record);

    List<FbWarncntdtlR> selectByExample(FbWarncntdtlRExample example);

    FbWarncntdtlR selectByPrimaryKey(FbWarncntdtlRKey key);

    int updateByExampleSelective(@Param("record") FbWarncntdtlR record, @Param("example") FbWarncntdtlRExample example);

    int updateByExample(@Param("record") FbWarncntdtlR record, @Param("example") FbWarncntdtlRExample example);

    int updateByPrimaryKeySelective(FbWarncntdtlR record);

    int updateByPrimaryKey(FbWarncntdtlR record);
}