package com.huitu.api.hnsl.util;

import org.springframework.data.redis.core.RedisTemplate;

import com.huitu.redis.Expirable;

/**
 * Created by zhw on 2015/8/19.
 */
public class NeverExpirable implements  Expirable {

    public static NeverExpirable Never;

    static {
        Never = new NeverExpirable();
    }

    public NeverExpirable(){
    }

    public void set(RedisTemplate template, Object key) {
        System.out.print(" 设置缓存");
        System.out.print(key);
        System.out.print(" 永不过期");
    }
}
