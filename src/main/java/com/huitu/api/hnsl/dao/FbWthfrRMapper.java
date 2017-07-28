package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbWthfrR;
import com.huitu.api.hnsl.entity.FbWthfrRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbWthfrRMapper {
    long countByExample(FbWthfrRExample example);

    int deleteByExample(FbWthfrRExample example);

    int insert(FbWthfrR record);

    int insertSelective(FbWthfrR record);

    List<FbWthfrR> selectByExample(FbWthfrRExample example);

    int updateByExampleSelective(@Param("record") FbWthfrR record, @Param("example") FbWthfrRExample example);

    int updateByExample(@Param("record") FbWthfrR record, @Param("example") FbWthfrRExample example);
}