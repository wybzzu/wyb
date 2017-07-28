package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbPersonB;  
import com.huitu.api.hnsl.entity.FbPersonBExample;
import com.huitu.api.hnsl.entity.FbPersonBKey;  

  
/** 
 * FbPersonB服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbPersonBService{  
      
     public int deleteByExample(FbPersonB record);
    
    public int deleteByPrimaryKey(FbPersonBKey key);
    
    public int insert(FbPersonB record);

    public int insertSelective(FbPersonB record);

    public List<FbPersonB> selectByExample(FbPersonB record);
    
    public FbPersonB selectByPrimaryKey(FbPersonBKey key);
   
    public int updateByPrimaryKeySelective(FbPersonB record);

    public int updateByPrimaryKey(FbPersonB record);
  
  
}  