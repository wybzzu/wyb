package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbBrdescRMapper;
import com.huitu.api.hnsl.entity.FbBrdescR;  
import com.huitu.api.hnsl.entity.FbBrdescRExample;
import com.huitu.api.hnsl.service.FbBrdescRService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbBrdescR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbBrdescRServiceImpl implements FbBrdescRService{  

	//@Autowired
	private FbBrdescRMapper mapper;
	
	public void setMapper(FbBrdescRMapper mapper){
		this.mapper=mapper;
	}
	
	public FbBrdescRMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbBrdescR record){
        FbBrdescRExample example=new FbBrdescRExample();
        
       
        
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
    public int insert(FbBrdescR record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbBrdescR record){
    	return mapper.insertSelective(record);
    }

    public List<FbBrdescR> selectByExample(FbBrdescR record){
    	FbBrdescRExample example=new FbBrdescRExample();
    	
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
    
    public FbBrdescR selectByPrimaryKey(String id){
    	return mapper.selectByPrimaryKey(id);
    }
   

    public int updateByPrimaryKeySelective(FbBrdescR record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(FbBrdescR record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  