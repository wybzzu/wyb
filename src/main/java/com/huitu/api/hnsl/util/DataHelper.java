package com.huitu.api.hnsl.util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by kc on 2016/4/11.
 */
public class DataHelper {

    public static<T> T sort(T result){

        T value = result;
        //进行排序
        if(result!=null&&result instanceof Map&&((Map) result).size()>1 && !( result instanceof LinkedHashMap)){//不是LinkedHashMap
            List<Map.Entry<String, Object>> list = new ArrayList<Map.Entry<String, Object>>();
            Map mapObj =(Map)result;
            Map.Entry en = null;
            Object val = null;
            if(mapObj != null&&mapObj.entrySet()!=null&&mapObj.entrySet().iterator()!=null&&mapObj.entrySet().iterator().hasNext()&&(mapObj.entrySet().iterator().next()) instanceof  Map.Entry) {
                en = (Map.Entry) mapObj.entrySet().iterator().next();
                val = en.getValue();
                list = new ArrayList<Map.Entry<String, Object>>(((Map) result).entrySet());

                if (val!=null&&val instanceof Map&&((Map) val).containsKey("__index")) {

                    Collections.sort(list, new Comparator<Map.Entry<String, Object>>() {
                        @Override
                        public int compare(Map.Entry<String, Object> o1, Map.Entry<String, Object> o2) {
                            if (o1.getValue() instanceof Map && o2.getValue() instanceof Map) {
                                try {
                                    Integer oo1 = Integer.parseInt(((Map) o1.getValue()).get("__index") + "");
                                    Integer oo2 = Integer.parseInt(((Map) o2.getValue()).get("__index") + "");
                                    return oo1.compareTo(oo2);
                                } catch (Exception e) {
                                    return 0;
                                }
                            }
                            return 0;
                        }
                    });
                }
                LinkedHashMap<String,Object> linked = new LinkedHashMap<String,Object>( list.size() );
                for (Map.Entry<String, Object> item:list) {
                    linked.put(item.getKey(),item.getValue());
                }
                value = (T) linked;
            }
        }
        return value;
    }

    public static <K, V> Map<K, V> Bean2Map(Object javaBean) {
        Map<K, V> ret = new HashMap<K, V>();
        try {
            Method[] methods = javaBean.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().startsWith("get")) {
                    String field = method.getName();
                    field = field.substring(field.indexOf("get") + 3);
                    field = field.toLowerCase().charAt(0) + field.substring(1);
                    Object value = method.invoke(javaBean, (Object[]) null);
                    ret.put((K) field, (V) value);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
