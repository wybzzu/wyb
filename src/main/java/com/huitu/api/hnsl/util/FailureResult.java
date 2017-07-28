package com.huitu.api.hnsl.util;

import java.io.Serializable;

import com.huitu.api.rest.ApiResource;
import com.huitu.api.rest.ApiResult;


/**
 * Created by zhw on 2015/8/25.
 */
public class FailureResult extends ApiResult implements Serializable {
    private ErrorMessage error;

    public FailureResult(ApiResource resource, ErrorMessage error) {
        super(resource.getRequest().getServletPath(),resource.getUUID(),resource.getVersion());
        this.error = error;
    }

    public Object getError() {
        return error;
    }

    public void setError(ErrorMessage error) {
        this.error = error;
    }
}