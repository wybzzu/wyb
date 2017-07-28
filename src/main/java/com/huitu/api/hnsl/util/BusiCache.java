package com.huitu.api.hnsl.util;

import java.util.HashMap;
import java.util.Map;

public class BusiCache {
	
	private static Map cache=new HashMap<String,Object>();
	
	public static void clearAll(){
		cache.clear();
	}
	
	public static void clear(String key){
		cache.remove(key);
	}
	
	public static <T> void setCache(String key,T t){
		if(key!=null&&t!=null){
			cache.put(key, t);
		}
	}
	
	public static <T>  T getCache(String key){
		Object obj=cache.get(key);
		if(obj!=null){
			return (T)obj;
		}else{
			return null;
		}
	}
	

}
