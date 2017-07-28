package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.StStcntS;  
import com.huitu.api.hnsl.entity.StStcntSExample;

  
/** 
 * StStcntS服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface StStcntSService{  
      
     public int deleteByExample(StStcntS record);
    
    public int deleteByPrimaryKey(String id);
    
    public int insert(StStcntS record);

    public int insertSelective(StStcntS record);

    public List<StStcntS> selectByExample(StStcntS record);
    
    public StStcntS selectByPrimaryKey(String id);
   
    public int updateByPrimaryKeySelective(StStcntS record);

    public int updateByPrimaryKey(StStcntS record);
  
  
}  