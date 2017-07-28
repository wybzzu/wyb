package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbWthfrRMapper;
import com.huitu.api.hnsl.entity.FbWthfrR;  
import com.huitu.api.hnsl.entity.FbWthfrRExample;
import com.huitu.api.hnsl.service.FbWthfrRService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbWthfrR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbWthfrRServiceImpl implements FbWthfrRService{  

	//@Autowired
	private FbWthfrRMapper mapper;
	
	public void setMapper(FbWthfrRMapper mapper){
		this.mapper=mapper;
	}
	
	public FbWthfrRMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbWthfrR record){
        FbWthfrRExample example=new FbWthfrRExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int insert(FbWthfrR record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbWthfrR record){
    	return mapper.insertSelective(record);
    }

    public List<FbWthfrR> selectByExample(FbWthfrR record){
    	FbWthfrRExample example=new FbWthfrRExample();
    	
    	//必须设置

       example.setOrderByClause("whtcity");
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
    
   

    public int updateByPrimaryKeySelective(FbWthfrR record){
    	return 0;
    }

    public int updateByPrimaryKey(FbWthfrR record){
    	return 0;
    }
  
}  