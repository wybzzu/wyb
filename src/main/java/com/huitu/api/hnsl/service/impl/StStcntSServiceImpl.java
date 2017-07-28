package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.StStcntSMapper;
import com.huitu.api.hnsl.entity.StStcntS;  
import com.huitu.api.hnsl.entity.StStcntSExample;
import com.huitu.api.hnsl.service.StStcntSService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * StStcntS服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class StStcntSServiceImpl implements StStcntSService{  

	//@Autowired
	private StStcntSMapper mapper;
	
	public void setMapper(StStcntSMapper mapper){
		this.mapper=mapper;
	}
	
	public StStcntSMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(StStcntS record){
        StStcntSExample example=new StStcntSExample();
        
       
        
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
    public int insert(StStcntS record){
    	return mapper.insert(record);
    }

    public int insertSelective(StStcntS record){
    	return mapper.insertSelective(record);
    }

    public List<StStcntS> selectByExample(StStcntS record){
    	StStcntSExample example=new StStcntSExample();
    	
    	//必须设置

        example.setOrderByClause("adcd");
        /*
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
    
    public StStcntS selectByPrimaryKey(String id){
    	return mapper.selectByPrimaryKey(id);
    }
   

    public int updateByPrimaryKeySelective(StStcntS record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(StStcntS record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  