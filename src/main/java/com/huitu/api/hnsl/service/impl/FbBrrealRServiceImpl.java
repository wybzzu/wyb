package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbBrrealRMapper;
import com.huitu.api.hnsl.entity.FbBrrealR;  
import com.huitu.api.hnsl.entity.FbBrrealRExample;
import com.huitu.api.hnsl.service.FbBrrealRService; 
import com.huitu.api.hnsl.entity.FbBrrealRKey;  
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbBrrealR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbBrrealRServiceImpl implements FbBrrealRService{  

	//@Autowired
	private FbBrrealRMapper mapper;
	
	public void setMapper(FbBrrealRMapper mapper){
		this.mapper=mapper;
	}
	
	public FbBrrealRMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbBrrealR record){
        FbBrrealRExample example=new FbBrrealRExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(FbBrrealRKey key){
    	return mapper.deleteByPrimaryKey(key);
    } 
    public int insert(FbBrrealR record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbBrrealR record){
    	return mapper.insertSelective(record);
    }

    public List<FbBrrealR> selectByExample(FbBrrealR record){
    	FbBrrealRExample example=new FbBrrealRExample();
    	
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
    
    public FbBrrealR selectByPrimaryKey(FbBrrealRKey key){
    	return mapper.selectByPrimaryKey(key);
    }
   

    public int updateByPrimaryKeySelective(FbBrrealR record){
    	return 0;

    }

    public int updateByPrimaryKey(FbBrrealR record){
    	return 0;
    }
  
}  