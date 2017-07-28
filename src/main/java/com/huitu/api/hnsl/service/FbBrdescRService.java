package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbBrdescR;  
import com.huitu.api.hnsl.entity.FbBrdescRExample;

  
/** 
 * FbBrdescR服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbBrdescRService{  
      
     public int deleteByExample(FbBrdescR record);
    
    public int deleteByPrimaryKey(String id);
    
    public int insert(FbBrdescR record);

    public int insertSelective(FbBrdescR record);

    public List<FbBrdescR> selectByExample(FbBrdescR record);
    
    public FbBrdescR selectByPrimaryKey(String id);
   
    public int updateByPrimaryKeySelective(FbBrdescR record);

    public int updateByPrimaryKey(FbBrdescR record);
  
  
}  