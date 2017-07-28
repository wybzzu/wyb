package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.FbWarncntdtlRMapper;
import com.huitu.api.hnsl.entity.FbWarncntdtlR;  
import com.huitu.api.hnsl.entity.FbWarncntdtlRExample;
import com.huitu.api.hnsl.service.FbWarncntdtlRService; 
import com.huitu.api.hnsl.entity.FbWarncntdtlRKey;  
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * FbWarncntdtlR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class FbWarncntdtlRServiceImpl implements FbWarncntdtlRService{  

	//@Autowired
	private FbWarncntdtlRMapper mapper;
	
	public void setMapper(FbWarncntdtlRMapper mapper){
		this.mapper=mapper;
	}
	
	public FbWarncntdtlRMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(FbWarncntdtlR record){
        FbWarncntdtlRExample example=new FbWarncntdtlRExample();
        
       
        
        if(record!=null){
        	/**
        	*用户逻辑
        	*/
        }
    	return mapper.deleteByExample(example);
    }
    
    public int deleteByPrimaryKey(FbWarncntdtlRKey key){
    	return mapper.deleteByPrimaryKey(key);
    } 
    public int insert(FbWarncntdtlR record){
    	return mapper.insert(record);
    }

    public int insertSelective(FbWarncntdtlR record){
    	return mapper.insertSelective(record);
    }

    public List<FbWarncntdtlR> selectByExample(FbWarncntdtlR record){
    	FbWarncntdtlRExample example=new FbWarncntdtlRExample();
    	
    	//必须设置
        example.setOrderByClause("adcd asc,warnstm desc");
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
    
    public FbWarncntdtlR selectByPrimaryKey(FbWarncntdtlRKey key){
    	return mapper.selectByPrimaryKey(key);
    }
   

    public int updateByPrimaryKeySelective(FbWarncntdtlR record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(FbWarncntdtlR record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  