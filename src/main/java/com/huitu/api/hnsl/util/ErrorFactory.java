package com.huitu.api.hnsl.util;



import com.huitu.usif.security.util.JsonHelper;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by zhw on 2015/8/26.
 */
public class ErrorFactory {

    private static Properties props = null;
    private static boolean init = false;
    private static ObjectMapper om = null;

    static{
        om = new ObjectMapper();
        load();
    }

    private  static void  load() {
        ClassLoader classLoader = ErrorFactory.class.getClassLoader();
        String file = "config/error.properties";

        InputStreamReader is = null;
        try {
            is = new InputStreamReader(classLoader.getResourceAsStream(file), "GBK");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try {
            if (props == null) {
                props = new Properties();
            }
            props.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                    is = null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static ErrorMessage Create(String key, Object ... args)  {
        if(null==props || !props.containsKey(key)){
            return ErrorMessage.Empty;
        }

        String json = props.getProperty(key);

        System.out.println("to entity "+json);

        return JsonHelper.toEntity(json, ErrorMessage.class, ErrorMessage.Empty, args);
    }
    public static ErrorMessage myException(String key, Object ... args)  {

        return JsonHelper.toEntity(key, ErrorMessage.class, ErrorMessage.Empty, args);
    }

    public static ErrorMessage handle(String json, Object ... args)  {
        return JsonHelper.toEntity(json, ErrorMessage.class, ErrorMessage.Empty, args);
    }
}
