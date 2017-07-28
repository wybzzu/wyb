package com.huitu.api.hnsl.resource;  

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import com.huitu.api.hnsl.entity.StStcntdtlR;  
import com.huitu.api.hnsl.service.StStcntdtlRService; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huitu.api.rest.AbstractApiResource;
import com.huitu.api.rest.ApiResult;
import com.huitu.api.rest.SuccessResult;

import com.huitu.api.hnsl.util.ErrorFactory;
import com.huitu.api.hnsl.util.FailureResult;
import com.huitu.api.hnsl.util.Page;
import com.huitu.api.hnsl.util.PageUtil;
import com.huitu.api.hnsl.util.Paging;
import com.huitu.api.hnsl.util.PagingResult;
import com.huitu.api.hnsl.util.ResultMessageCode;
import com.github.pagehelper.PageHelper;

import com.huitu.api.rest.AbstractApiResource;
import com.huitu.api.rest.ApiResult;
import com.huitu.api.rest.SuccessResult;
import com.huitu.redis.Expirable;

import com.huitu.api.hnsl.util.NeverExpirable;
import com.huitu.api.UUIDFactory;

import com.huitu.redis.RedisClient;

//import com.ht.api.common.AbstractApiResource;  
//import com.ht.api.common.ApiResult;
//import com.ht.api.common.FailureResult;
//import com.ht.api.common.SuccessResult;

//import com.ht.api.util.ErrorFactory;
//import com.ht.api.util.Page;
//import com.ht.api.util.PageUtil;
//import com.ht.api.util.Paging;
//import com.ht.api.util.ResultMessageCode;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
//import com.ht.api.common.PagingResult;
//import com.ht.api.redis.NeverExpirable;
//import com.ht.api.redis.RedisClient;
/** 
 * StStcntdtlR服务接口实现类  
 *  
 * @author wyb 
 * 
 *  
 * @version $Revision: 1.00 $ $Date: 2017-05-05 14:58:22 
 */  
@Component
//使用相对地址，可以在web.xml中配置前缀地址
@Path("stStcntdtlR") 
public class StStcntdtlRResource extends AbstractApiResource{  

	//@Autowired
	private StStcntdtlRService service;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	public void setService(StStcntdtlRService service){
		this.service=service;
	}
	
	public StStcntdtlRService getService(){
		return this.service;
	}
	
	public void setRedisTemplate(RedisTemplate redisTemplate){
		this.redisTemplate=redisTemplate;
	}
	
	public RedisTemplate getRedisTemplate(){
		return this.redisTemplate;
	}
	
	ApiResult sr = null;
    Response response = null;
    Map< String, Object > map=new HashMap<String,Object>();
    
    
    
    /**
     * Title: deleteByExample </BR>
     * Description: TODO(条件删除StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {delete} /%projectPath%/api/hnsl/v0.1/adCode/deleteByExample
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlRExample
     * @apiParam {string} StStcntdtlRExample.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/deleteByExample
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
    @DELETE
    @Path("/deleteByExample")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteByExample(StStcntdtlR record){
    	try{
	    	int i=service.deleteByExample(record);
	    	map.put("effective",i);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "deleteByExample"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
    
    /**
     * Title: deleteByPrimaryKey </BR>
     * Description: TODO(单主键删除StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {delete} /%projectPath%/api/hnsl/v0.1/adCode/deleteByPrimaryKey
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {String} id 主键
     * @apiParam {@@@} StStcntdtlRKey.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/deleteByPrimaryKey
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
    @DELETE
    @Path("/deleteByPrimaryKey/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response deleteByPrimaryKey(@PathParam("id") String id){
    	try{
	    	int i=service.deleteByPrimaryKey(id);
	    	map.put("effective",i);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "deleteByPrimaryKey"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    } 
    
    
    /**
     * Title: insert </BR>
     * Description: TODO(插入StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {post} /%projectPath%/api/hnsl/v0.1/adCode/insert
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlR
     * @apiParam {string} StStcntdtlR.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/insert
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
    @PUT
    @Path("/insert")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insert(StStcntdtlR record){
    	try{
	    	int i=service.insert(record);
	    	map.put("effective",i);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "insert"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
    
     /**
     * Title: insertSelective </BR>
     * Description: TODO(选择非空插入StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {post} /%projectPath%/api/hnsl/v0.1/adCode/insertSelective
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlR
     * @apiParam {string} StStcntdtlR.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/insertSelective
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
	@PUT
    @Path("/insertSelective")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response insertSelective(StStcntdtlR record){
    	try{
	    	int i=service.insert(record);
	    	map.put("effective",i);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "insertSelective"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
    
     /**
     * Title: selectByExample </BR>
     * Description: TODO(条件查询StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {post} /%projectPath%/api/hnsl/v0.1/adCode/selectByExample
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlRExample
     * @apiParam {string} StStcntdtlRExample.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/selectByExample
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
	@POST
    @Path("/selectByExample")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response selectByExample(StStcntdtlR record){
    	try{
	    	List<StStcntdtlR> list=service.selectByExample(record);
	    	map.put("result",list);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "selectByExample"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
    
     /**
     * Title: selectAll </BR>
     * Description: TODO(条件分页查询StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {post} /%projectPath%/api/hnsl/v0.1/adCode/selectAll
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlRExample
     * @apiParam {string} StStcntdtlRExample.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/selectAll
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
    @POST
    @Path("/selectAll")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response selectAll(StStcntdtlR record){
		
	    ApiResult sr = null;
        Response response = null;
        try {
            String rang = this.getRequest().getHeader("Rang");
            String cache =this.getRequest().getHeader("Cache");
            List<StStcntdtlR> list;
            if (StringUtils.isNoneBlank(rang)) {
                Page page=PageUtil.getPage(rang);
                String hash = UUIDFactory.hashUUID("stStcntdtlR");
                if(cache!=null&&Boolean.getBoolean(cache)){
            		 list=service.selectByExample(record);
                     RedisClient.setHashValue(redisTemplate, "stStcntdtlR", hash, list, NeverExpirable.Never);
                     Paging paging=PageUtil.getPaging(list.size(),hash,"be_adcd_b",page.getSize(),page.getMax());
                     int min = page.getMin();
                     int max = page.getMax();
                     if (max >=list.size()) {
                         max = list.size();
                     }
                     sr = new PagingResult<List<StStcntdtlR>>(this, list.subList(min, max), paging);
                     response = Response.ok(sr).status(Response.Status.OK).build();
            	}else{
                    PageHelper.startPage(page.getPageNum(), page.getSize());
                    list=service.selectByExample(record);
                    Paging paging=PageUtil.getPaging(list.size(),hash,"be_adcd_b",page.getSize(),page.getMax());
                    sr = new PagingResult<List<StStcntdtlR>>(this, list, paging);
                    response = Response.ok(sr).status(Response.Status.OK).build();
            	}
            } else {
            	list=service.selectByExample(record);
                sr = new SuccessResult<List<StStcntdtlR>>(this, list);
                response = Response.ok(sr).status(Response.Status.OK).build();
            }

        } catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "selectAll"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
		
    }
    
    
    /**
     * Title: selectByPrimaryKey </BR>
     * Description: TODO(主键查询StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {get} /%projectPath%/api/hnsl/v0.1/adCode/selectByPrimaryKey
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {String} id 主键
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/selectByPrimaryKey
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
    @GET
    @Path("/selectByPrimaryKey/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response selectByPrimaryKey(@PathParam("id") String id){
        try{
	    	StStcntdtlR obj=service.selectByPrimaryKey(id);
	    	map.put("obj",obj);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "selectByPrimaryKey"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
   
   /**
     * Title: updateByPrimaryKeySelective </BR>
     * Description: TODO(主键更新且地段非空StStcntdtlR ) </BR>
     * @return </BR>   
     * return Response </BR>   
     * throws </BR>
     * @api {put} /%projectPath%/api/hnsl/v0.1/adCode/updateByPrimaryKeySelective
     * @apiDescription 
     * @apiVersion 0.1
     * @apiName get StStcntdtlR 
     * @apiGroup @@@
     *
     * @apiParam {Object} StStcntdtlR
     * @apiParam {@@@} StStcntdtlR.@@@ @@@
     *
     * @apiSampleRequest /%projectPath%/api/hnsl/v0.1/adCode/updateByPrimaryKeySelective
     *
     * @apiSuccess {map} result
     * @apiSuccess {Object} result.@@@ @@@
     * ......
     * @apiSuccessExample 请求成功:
     *     HTTP/1.1 200 OK
     *     {
     *     @@@
     *     }
     *
     * @apiError NotFound 请求未发现
     *
     * @apiErrorExample 请求异常:
     *     HTTP/1.1 
     *     {
     *     @@@
     *     }
     */
	@PUT
    @Path("/updateByPrimaryKeySelective")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response updateByPrimaryKeySelective(StStcntdtlR record){
    	try{
	    	int i=service.updateByPrimaryKeySelective(record);
	    	map.put("effective",i);
	        sr = new SuccessResult<Map< String, Object >>(this,map);
	        response =Response.ok(sr).status(Response.Status.OK).build();
        }
        catch (Exception e) {
            e.printStackTrace();
            sr = new FailureResult(this, ErrorFactory.Create(ResultMessageCode.CONNECT_FAIL, "updateByPrimaryKeySelective"));
            response = Response.ok(sr).status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return response;
    }
    
    @Override
	public String getUUID() {
		return null;
	}
    
}  