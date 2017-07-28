package com.huitu.api.hnsl.util;



import java.io.Serializable;

import com.huitu.api.rest.ApiResource;
import com.huitu.api.rest.ApiResult;


/**
 * Created by 3119 on 2015/11/23.
 */
public class PagingResult <T> extends ApiResult implements Serializable {
    private T result;
    private Paging paging;

    public PagingResult(ApiResource resource, T result,Paging paging) {
        super(resource.getRequest().getServletPath(),resource.getUUID(),resource.getVersion());
        this.result = result;
        this.paging = paging;
    }
    public PagingResult(String url,String uuid,String version, T result,Paging paging) {
        super(url,uuid,version);
        this.setResult( result);
        this.paging = paging;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = DataHelper.sort( result );;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }
}

