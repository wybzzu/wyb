package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbWthfrR;  
import com.huitu.api.hnsl.entity.FbWthfrRExample;

  
/** 
 * FbWthfrR服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbWthfrRService{  
      
     public int deleteByExample(FbWthfrR record);
    
    
    public int insert(FbWthfrR record);

    public int insertSelective(FbWthfrR record);

    public List<FbWthfrR> selectByExample(FbWthfrR record);
    
   
    public int updateByPrimaryKeySelective(FbWthfrR record);

    public int updateByPrimaryKey(FbWthfrR record);
  
  
}  