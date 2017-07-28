package com.huitu.api.hnsl.util;

import java.util.Iterator;
import java.util.Map;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

public class ConfigEncryptUtils {
    public static void main(String[] args){
        //加密工具
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        //加密配置
        EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        //自己在用的时候更改此密码
        config.setPassword("HT_HNSL");
        
        System.out.println(System.getenv("DB_ENCR_PWD"));
        System.out.println(System.getProperty("TMP"));
        //应用配置
        encryptor.setConfig(config);
        //String ciphertext="azL9Cyp9H62r3eUgZ+TESw==";
        //解密
        //String plaintext=encryptor.decrypt(ciphertext);
        //System.out.println(ciphertext + " : " + plaintext);
        
        String plaintext1="sjzx@123";
        //加密
        String ciphertext1=encryptor.encrypt(plaintext1);
        System.out.println(plaintext1 + " : " + ciphertext1);
        
        Map<String, String> map = System.getenv();
        for(Iterator<String> itr = map.keySet().iterator();itr.hasNext();){
            String key = itr.next();
            System.out.println(key + "=" + map.get(key));
        }   
    }
}
