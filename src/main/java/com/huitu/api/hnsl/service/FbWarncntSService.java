package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbWarncntS;  
import com.huitu.api.hnsl.entity.FbWarncntSExample;

  
/** 
 * FbWarncntS服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbWarncntSService{  
      
     public int deleteByExample(FbWarncntS record);
    
    public int deleteByPrimaryKey(String id);
    
    public int insert(FbWarncntS record);

    public int insertSelective(FbWarncntS record);

    public List<FbWarncntS> selectByExample(FbWarncntS record);
    
    public FbWarncntS selectByPrimaryKey(String id);
   
    public int updateByPrimaryKeySelective(FbWarncntS record);

    public int updateByPrimaryKey(FbWarncntS record);
  
  
}  