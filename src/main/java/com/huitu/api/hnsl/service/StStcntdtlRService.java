package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.StStcntdtlR;  
import com.huitu.api.hnsl.entity.StStcntdtlRExample;

  
/** 
 * StStcntdtlR服务接口  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
public interface StStcntdtlRService{  
      
     public int deleteByExample(StStcntdtlR record);
    
    public int deleteByPrimaryKey(String id);
    
    public int insert(StStcntdtlR record);

    public int insertSelective(StStcntdtlR record);

    public List<StStcntdtlR> selectByExample(StStcntdtlR record);
    
    public StStcntdtlR selectByPrimaryKey(String id);
   
    public int updateByPrimaryKeySelective(StStcntdtlR record);

    public int updateByPrimaryKey(StStcntdtlR record);
  
  
}  