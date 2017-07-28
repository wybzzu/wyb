package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbPersonB;
import com.huitu.api.hnsl.entity.FbPersonBExample;
import com.huitu.api.hnsl.entity.FbPersonBKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbPersonBMapper {
    long countByExample(FbPersonBExample example);

    int deleteByExample(FbPersonBExample example);

    int deleteByPrimaryKey(FbPersonBKey key);

    int insert(FbPersonB record);

    int insertSelective(FbPersonB record);

    List<FbPersonB> selectByExample(FbPersonBExample example);

    FbPersonB selectByPrimaryKey(FbPersonBKey key);

    int updateByExampleSelective(@Param("record") FbPersonB record, @Param("example") FbPersonBExample example);

    int updateByExample(@Param("record") FbPersonB record, @Param("example") FbPersonBExample example);

    int updateByPrimaryKeySelective(FbPersonB record);

    int updateByPrimaryKey(FbPersonB record);
}