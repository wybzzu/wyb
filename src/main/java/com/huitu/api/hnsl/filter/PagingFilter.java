package com.huitu.api.hnsl.filter;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import com.huitu.api.hnsl.util.Page;
import com.huitu.api.hnsl.util.PageUtil;
import com.huitu.api.hnsl.util.Paging;
import com.huitu.api.hnsl.util.PagingResult;
import com.huitu.api.rest.ApiResult;
import com.huitu.redis.RedisClient;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * Created by 3119 on 2015/11/24.
 */
public class PagingFilter implements ContainerRequestFilter{
    private static final Logger logger = LoggerFactory.getLogger(PagingFilter.class);
    @Context
    private HttpServletRequest request;
    @Context
    private HttpServletResponse response;

    @Autowired
    private RedisTemplate redisTemplate;
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        String rang = containerRequestContext.getHeaderString("Rang");
        ApiResult sr = null;
        Response response = null;
        String id="";
        Page page = null;
        if(StringUtils.isNoneBlank(rang)){
            page = PageUtil.getPage(rang);
            id= page.getId();
        }
        String url="";
        String uuid="";
        String version="";
        System.out.println(id);
        if (StringUtils.isNoneBlank(id)){
            String key=page.getTableName();
            if(RedisClient.hasKey(redisTemplate, key)){
                List<Object> list = RedisClient.getHashValue(redisTemplate, key, id);
                Paging paging=PageUtil.getPaging(list.size(), id, key, page.getSize(), page.getMax());
                int min = page.getMin();
                int max = page.getMax();
                if (max >=list.size()) {
                    max = list.size();
                }
                sr = new PagingResult<List<Object>>(url,uuid,version,list.subList(min,max),paging);
                response = Response.ok(sr).status(Response.Status.PARTIAL_CONTENT).build();
                containerRequestContext.abortWith(response);
            }

        }
    }
}
