package com.huitu.api.hnsl.exception;

import com.huitu.api.exception.ApiException;

/**
 * Created by zhw on 2016/12/16.
 */
public class InvalidKeyException extends ApiException {
    public InvalidKeyException(String message) {
        super(message);
    }

    public InvalidKeyException() {
    }
}
