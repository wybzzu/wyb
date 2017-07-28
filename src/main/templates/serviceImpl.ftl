package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.${model_name}Mapper;
import com.huitu.api.hnsl.entity.${model_name};  
import com.huitu.api.hnsl.entity.${model_name}Example;
import com.huitu.api.hnsl.service.${model_name}Service; 
<#if isMul==1>
import com.huitu.api.hnsl.entity.${model_name}Key;  
</#if> 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * ${model_name}服务接口实现类  
 *  
 * @author ${author} 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: ${date?string("yyyy-MM-dd HH:mm:ss")} 
 */  
//@Service
public class ${model_name}ServiceImpl implements ${model_name}Service{  

	//@Autowired
	private ${model_name}Mapper mapper;
	
	public void setMapper(${model_name}Mapper mapper){
		this.mapper=mapper;
	}
	
	public ${model_name}Mapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(${model_name} record){
        ${model_name}Example example=new ${model_name}Example();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    <#if isMul==0>
    public int deleteByPrimaryKey(String id){
    	return mapper.deleteByPrimaryKey(id);
    } 
    <#elseif isMul=1> 
    public int deleteByPrimaryKey(${model_name}Key key){
    	return mapper.deleteByPrimaryKey(key);
    } 
    </#if>
    public int insert(${model_name} record){
    	return mapper.insert(record);
    }

    public int insertSelective(${model_name} record){
    	return mapper.insertSelective(record);
    }

    public List<${model_name}> selectByExample(${model_name} record){
    	${model_name}Example example=new ${model_name}Example();
    	
    	//必须设置
        /*
        example.setOrderByClause("adcd");
        if(record!=null){
        	if(record.getAdcd()!=null&&!record.getAdcd().isEmpty()){
        		example.or().andAdcdEqualTo(record.getAdcd());
        	}
        	if(record.getAdnm()!=null&&!record.getAdnm().isEmpty()){
        		example.or().andAdnmLike(record.getAdnm()+"%");
        	}
        	
        }*/
    	return mapper.selectByExample(example);
    }
    
    <#if isMul==0>
    public ${model_name} selectByPrimaryKey(String id){
    	return mapper.selectByPrimaryKey(id);
    }
    <#elseif isMul=1> 
    public ${model_name} selectByPrimaryKey(${model_name}Key key){
    	return mapper.selectByPrimaryKey(key);
    }
    </#if>
   

    public int updateByPrimaryKeySelective(${model_name} record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(${model_name} record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  