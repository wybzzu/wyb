package com.huitu.api.hnsl.util;

import java.io.Serializable;

/**
 * Created by zhw on 2015/8/25.
 */
public class ErrorMessage implements Serializable {
    public static  ErrorMessage Empty = new ErrorMessage(0,"");
    private int number = 0;
    private String message ;

    public  ErrorMessage(){

    }
    public ErrorMessage(int number, String message) {
        this.number = number;
        this.message = message;
    }
    public int getNumber() {
        return number;
    }
    public String getMessage() {
        return message;
    }
    public void setNumber(int number) {
        this.number= number;
    }
    public void setMessage(String message) {
        this.message= message;
    }

}
