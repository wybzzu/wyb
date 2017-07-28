package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbWarncntSMapper;
import com.huitu.api.hnsl.entity.FbWarncntS;  
import com.huitu.api.hnsl.entity.FbWarncntSExample;
import com.huitu.api.hnsl.service.FbWarncntSService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbWarncntS服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbWarncntSServiceImpl implements FbWarncntSService{  

	//@Autowired
	private FbWarncntSMapper mapper;
	
	public void setMapper(FbWarncntSMapper mapper){
		this.mapper=mapper;
	}
	
	public FbWarncntSMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbWarncntS record){
        FbWarncntSExample example=new FbWarncntSExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(String id){
    	return mapper.deleteByPrimaryKey(id);
    } 
    public int insert(FbWarncntS record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbWarncntS record){
    	return mapper.insertSelective(record);
    }

    public List<FbWarncntS> selectByExample(FbWarncntS record){
    	FbWarncntSExample example=new FbWarncntSExample();
    	
    	//必须设置

        example.setOrderByClause("adcd asc");
       /* if(record!=null){
        	if(record.getAdcd()!=null&&!record.getAdcd().isEmpty()){
        		example.or().andAdcdEqualTo(record.getAdcd());
        	}
        	if(record.getAdnm()!=null&&!record.getAdnm().isEmpty()){
        		example.or().andAdnmLike(record.getAdnm()+"%");
        	}
        	
        }*/
    	return mapper.selectByExample(example);
    }
    
    public FbWarncntS selectByPrimaryKey(String id){
    	return mapper.selectByPrimaryKey(id);
    }
   

    public int updateByPrimaryKeySelective(FbWarncntS record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(FbWarncntS record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  