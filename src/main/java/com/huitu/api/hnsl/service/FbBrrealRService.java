package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbBrrealR;  
import com.huitu.api.hnsl.entity.FbBrrealRExample;
import com.huitu.api.hnsl.entity.FbBrrealRKey;  

  
/** 
 * FbBrrealR服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbBrrealRService{  
      
     public int deleteByExample(FbBrrealR record);
    
    public int deleteByPrimaryKey(FbBrrealRKey key);
    
    public int insert(FbBrrealR record);

    public int insertSelective(FbBrrealR record);

    public List<FbBrrealR> selectByExample(FbBrrealR record);
    
    public FbBrrealR selectByPrimaryKey(FbBrrealRKey key);
   
    public int updateByPrimaryKeySelective(FbBrrealR record);

    public int updateByPrimaryKey(FbBrrealR record);
  
  
}  