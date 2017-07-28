package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbSeecardBMapper;
import com.huitu.api.hnsl.entity.FbSeecardB;  
import com.huitu.api.hnsl.entity.FbSeecardBExample;
import com.huitu.api.hnsl.service.FbSeecardBService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbSeecardB服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbSeecardBServiceImpl implements FbSeecardBService{  

	//@Autowired
	private FbSeecardBMapper mapper;
	
	public void setMapper(FbSeecardBMapper mapper){
		this.mapper=mapper;
	}
	
	public FbSeecardBMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbSeecardB record){
        FbSeecardBExample example=new FbSeecardBExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int insert(FbSeecardB record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbSeecardB record){
    	return mapper.insertSelective(record);
    }

    public List<FbSeecardB> selectByExample(FbSeecardB record){
    	FbSeecardBExample example=new FbSeecardBExample();
    	
    	//必须设置

        example.setOrderByClause("adcd");
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
    
   

    public int updateByPrimaryKeySelective(FbSeecardB record){
    	return 0;
    }

    public int updateByPrimaryKey(FbSeecardB record){
    	return 0;
    }

}  