package com.huitu.api.hnsl.dao;

import com.huitu.api.hnsl.entity.FbSeecardB;
import com.huitu.api.hnsl.entity.FbSeecardBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FbSeecardBMapper {
    long countByExample(FbSeecardBExample example);

    int deleteByExample(FbSeecardBExample example);

    int insert(FbSeecardB record);

    int insertSelective(FbSeecardB record);

    List<FbSeecardB> selectByExample(FbSeecardBExample example);

    int updateByExampleSelective(@Param("record") FbSeecardB record, @Param("example") FbSeecardBExample example);

    int updateByExample(@Param("record") FbSeecardB record, @Param("example") FbSeecardBExample example);
}