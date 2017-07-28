package com.huitu.api.hnsl.service;  

import java.util.List;
import com.huitu.api.hnsl.entity.${model_name};  
import com.huitu.api.hnsl.entity.${model_name}Example;
<#if isMul==1>
import com.huitu.api.hnsl.entity.${model_name}Key;  
</#if> 

  
/** 
 * ${model_name}服务接口  
 *  
 * @author ${author} 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: ${date?string("yyyy-MM-dd HH:mm:ss")} 
 */  
public interface ${model_name}Service{  
      
     public int deleteByExample(${model_name} record);
    
    <#if isMul==0>
    public int deleteByPrimaryKey(String id);
    <#elseif isMul=1> 
    public int deleteByPrimaryKey(${model_name}Key key);
    </#if>
    
    public int insert(${model_name} record);

    public int insertSelective(${model_name} record);

    public List<${model_name}> selectByExample(${model_name} record);
    
    <#if isMul==0>
    public ${model_name} selectByPrimaryKey(String id);
    <#elseif isMul=1> 
    public ${model_name} selectByPrimaryKey(${model_name}Key key);
    </#if>
   
    public int updateByPrimaryKeySelective(${model_name} record);

    public int updateByPrimaryKey(${model_name} record);
  
  
}  