package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbSeecardB;  
import com.huitu.api.hnsl.entity.FbSeecardBExample;

  
/** 
 * FbSeecardB服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbSeecardBService{  
      
     public int deleteByExample(FbSeecardB record);
    
    
    public int insert(FbSeecardB record);

    public int insertSelective(FbSeecardB record);

    public List<FbSeecardB> selectByExample(FbSeecardB record);
    
   
    public int updateByPrimaryKeySelective(FbSeecardB record);

    public int updateByPrimaryKey(FbSeecardB record);
  
  
}  