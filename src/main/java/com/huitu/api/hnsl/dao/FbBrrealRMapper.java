package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbBrrealR;
import com.huitu.api.hnsl.entity.FbBrrealRExample;
import com.huitu.api.hnsl.entity.FbBrrealRKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbBrrealRMapper {
    long countByExample(FbBrrealRExample example);

    int deleteByExample(FbBrrealRExample example);

    int deleteByPrimaryKey(FbBrrealRKey key);

    int insert(FbBrrealR record);

    int insertSelective(FbBrrealR record);

    List<FbBrrealR> selectByExample(FbBrrealRExample example);

    FbBrrealR selectByPrimaryKey(FbBrrealRKey key);

    int updateByExampleSelective(@Param("record") FbBrrealR record, @Param("example") FbBrrealRExample example);

    int updateByExample(@Param("record") FbBrrealR record, @Param("example") FbBrrealRExample example);

    int updateByPrimaryKeySelective(FbBrrealR record);

    int updateByPrimaryKey(FbBrrealR record);
}