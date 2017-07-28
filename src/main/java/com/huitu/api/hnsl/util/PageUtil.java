package com.huitu.api.hnsl.util;

import org.apache.commons.lang3.StringUtils;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 3119 on 2016/1/13.
 */
public class PageUtil {
    public static Page getPage(String rang){
        Page page=new Page();
        String[] strings=rang.split(";");
        Map map =new HashMap();
        for(int i=0;i<strings.length;i++){
            String[] fileds=strings[i].split("=");
            map.put(fileds[0],fileds[1]);

        }
        if(StringUtils.isNoneBlank((String)map.get("field"))){
            page.setField((String) map.get("field"));
        }
        if(StringUtils.isNoneBlank((String)map.get("size"))){
           page.setSize(Integer.parseInt((String)map.get("size")));
        }
        if(StringUtils.isNoneBlank((String)map.get("pageNum"))){
            page.setPageNum(Integer.parseInt((String)map.get("pageNum")));
        }
        if(StringUtils.isNoneBlank((String)map.get("id"))){
            page.setId((String) map.get("id"));
        }
        if(StringUtils.isNoneBlank((String)map.get("tableName"))){
            page.setTableName((String) map.get("tableName"));
        }
        if(StringUtils.isNoneBlank((String)map.get("max"))){
            page.setMax(Integer.parseInt((String) map.get("max")));
        }
        page.setTotal(page.getMax() / page.getSize());
        page.setMin(page.getMax()-page.getSize());
        return page;
    }
    
    public static Page getPage(String rang,boolean cache){
        Page page=new Page();
        String[] strings=rang.split(";");
        Map map =new HashMap();
        for(int i=0;i<strings.length;i++){
            String[] fileds=strings[i].split("=");
            map.put(fileds[0],fileds[1]);

        }
        if(StringUtils.isNoneBlank((String)map.get("field"))){
            page.setField((String) map.get("field"));
        }
        if(StringUtils.isNoneBlank((String)map.get("size"))){
           page.setSize(Integer.parseInt((String)map.get("size")));
        }
        if(!cache&&StringUtils.isNoneBlank((String)map.get("pageNum"))){
            page.setPageNum(Integer.parseInt((String)map.get("pageNum")));
        }
        if(StringUtils.isNoneBlank((String)map.get("id"))){
            page.setId((String) map.get("id"));
        }
        if(StringUtils.isNoneBlank((String)map.get("tableName"))){
            page.setTableName((String) map.get("tableName"));
        }
        if(StringUtils.isNoneBlank((String)map.get("max"))){
            page.setMax(Integer.parseInt((String) map.get("max")));
        }
        return page;
    }
    
    public static Paging getPaging(long total,String id,String tableName,int size,int max){
        Paging paging=new Paging();
        paging.setId(id);
        paging.setTableName(tableName);
        paging.setTotal(total);
        long count=0;
        if(total%size==0){
            count=total/size;
        }else{
            count=total/size+1;
        }
        paging.setCount(count);
        if (max >=total) {
            paging.setFinale(true);
        }else{
            paging.setFinale(false);
        }
        return paging;
    }

    public static Paging getPaging(int pageNum,int pageSize,String id,String tableName,int size,int max){
        Paging paging=new Paging();
        paging.setId(id);
        paging.setTableName(tableName);
        paging.setTotal(max);
        paging.setCount((pageNum-1)*pageSize+size);
        paging.setIndex(pageNum);
        if (paging.getCount()==max) {
            paging.setFinale(true);
        }else{
            paging.setFinale(false);
        }
        return paging;
    }


    public static Paging getPaging(long total,String id,String tableName,int size,int pageNum,boolean cache){
        Paging paging=new Paging();
        paging.setId(id);
        paging.setTableName(tableName);
        paging.setTotal(total);
        long count=0;
        if(total%size==0){
            count=total/size;
        }else{
            count=total/size+1;
        }
        paging.setIndex(pageNum);
        paging.setCount(count);
        return paging;
    }
}
