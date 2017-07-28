package com.huitu.api.hnsl.util;

import java.util.UUID;

/**
 * Created by zhw on 2015/8/25.
 */
public class UUIDFactory {

    public static void main(String[] args) {
       System.out.println(createUUID());
    }

    public static String createUUID(){
        return UUID.randomUUID().toString();
    }

    public static String hashUUID(String str){
        int h = 0;
        int off = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            h = 31 * h + str.charAt(off++);
        }
        return h+"";
    }
}
