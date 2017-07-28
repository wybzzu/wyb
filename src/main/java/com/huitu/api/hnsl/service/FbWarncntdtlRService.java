package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.FbWarncntdtlR;  
import com.huitu.api.hnsl.entity.FbWarncntdtlRExample;
import com.huitu.api.hnsl.entity.FbWarncntdtlRKey;  

  
/** 
 * FbWarncntdtlR服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface FbWarncntdtlRService{  
      
     public int deleteByExample(FbWarncntdtlR record);
    
    public int deleteByPrimaryKey(FbWarncntdtlRKey key);
    
    public int insert(FbWarncntdtlR record);

    public int insertSelective(FbWarncntdtlR record);

    public List<FbWarncntdtlR> selectByExample(FbWarncntdtlR record);
    
    public FbWarncntdtlR selectByPrimaryKey(FbWarncntdtlRKey key);
   
    public int updateByPrimaryKeySelective(FbWarncntdtlR record);

    public int updateByPrimaryKey(FbWarncntdtlR record);
  
  
}  