package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbPersonBMapper;
import com.huitu.api.hnsl.entity.FbPersonB;  
import com.huitu.api.hnsl.entity.FbPersonBExample;
import com.huitu.api.hnsl.service.FbPersonBService; 
import com.huitu.api.hnsl.entity.FbPersonBKey;  
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbPersonB服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbPersonBServiceImpl implements FbPersonBService{  

	//@Autowired
	private FbPersonBMapper mapper;
	
	public void setMapper(FbPersonBMapper mapper){
		this.mapper=mapper;
	}
	
	public FbPersonBMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbPersonB record){
        FbPersonBExample example=new FbPersonBExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(FbPersonBKey key){
    	return mapper.deleteByPrimaryKey(key);
    } 
    public int insert(FbPersonB record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbPersonB record){
    	return mapper.insertSelective(record);
    }

    public List<FbPersonB> selectByExample(FbPersonB record){
    	FbPersonBExample example=new FbPersonBExample();
    	
    	//必须设置
        example.setOrderByClause("personcd asc");
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
    
    public FbPersonB selectByPrimaryKey(FbPersonBKey key){
    	return mapper.selectByPrimaryKey(key);
    }
   

    public int updateByPrimaryKeySelective(FbPersonB record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(FbPersonB record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  