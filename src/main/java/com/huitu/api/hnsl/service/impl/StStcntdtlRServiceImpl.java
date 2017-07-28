package com.huitu.api.hnsl.service.impl;  

import java.util.List;
import com.huitu.api.hnsl.dao.StStcntdtlRMapper;
import com.huitu.api.hnsl.entity.StStcntdtlR;  
import com.huitu.api.hnsl.entity.StStcntdtlRExample;
import com.huitu.api.hnsl.service.StStcntdtlRService; 
import org.apache.ibatis.annotations.Param; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
/** 
 * StStcntdtlR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
//@Service
public class StStcntdtlRServiceImpl implements StStcntdtlRService{  

	//@Autowired
	private StStcntdtlRMapper mapper;
	
	public void setMapper(StStcntdtlRMapper mapper){
		this.mapper=mapper;
	}
	
	public StStcntdtlRMapper getMapper(){
		return this.mapper;
	}
      
    
    public int deleteByExample(StStcntdtlR record){
        StStcntdtlRExample example=new StStcntdtlRExample();
        
       
        
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
    public int insert(StStcntdtlR record){
    	return mapper.insert(record);
    }

    public int insertSelective(StStcntdtlR record){
    	return mapper.insertSelective(record);
    }

    public List<StStcntdtlR> selectByExample(StStcntdtlR record){
    	StStcntdtlRExample example=new StStcntdtlRExample();
    	
    	//必须设置
        example.setOrderByClause("adcd");
        if(record!=null){
            if(record.getAdcd()!=null&&!record.getAdcd().isEmpty()){
                example.or().andAdcdLike(record.getAdcd().trim()+"%");
            }
        }
    	return mapper.selectByExample(example);
    }
    
    public StStcntdtlR selectByPrimaryKey(String id){
    	return mapper.selectByPrimaryKey(id);
    }
   

    public int updateByPrimaryKeySelective(StStcntdtlR record){
    	return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(StStcntdtlR record){
    	return mapper.updateByPrimaryKey(record);
    }
  
}  