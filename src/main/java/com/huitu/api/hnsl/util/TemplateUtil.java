package com.huitu.api.hnsl.util;

import java.io.File;  
import java.io.FileOutputStream;  
import java.io.OutputStreamWriter;  
import java.io.Writer;  
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;  
import java.util.HashMap;  
import java.util.List;
import java.util.Map;  
import freemarker.template.Configuration;  
import freemarker.template.Template;  
  
public class TemplateUtil {  
  
    private Configuration cfg;  
    
    static String projectPath = "F://api-hnfbapp//";
    //String projectPath="C://Users//Administrator//.jenkins//workspace//cms//";
  
    public void init() throws Exception {  
        // 初始化FreeMarker配置  
        // 创建一个Configuration实例  
        cfg = new Configuration();  
        // 设置FreeMarker的模版文件位置  
        cfg.setDirectoryForTemplateLoading(new File(  
        		projectPath+"src//main//templates"));  
    }  
  
    public void process(TemplateUtil hf) throws Exception {  
  
        
        Date date = new Date();  
  
        String saveServicePath = "src//main//java//com//huitu//api//hnsl//service//"; 
        
        String saveBeanPath = "src//main//resources//spring//"; 
        
        String saveServiceImplPath = "src//main//java//com//huitu//api//hnsl//service//impl//"; 
        
        String saveResourcePath = "src//main//java//com//huitu//api//hnsl//resource//"; 
        
        String basePath="src//main//java//com//huitu//api//hnsl//dao//";
        File dir=new File(projectPath+basePath);
        List<String>  itemList=new ArrayList<String>();
        if(dir.isDirectory()){
        	for(String file : dir.list()){
        		System.out.println(file);
        		if(file!=null&&file.contains("Mapper.java")){
        			int isComposite=isCompositeKey("com.huitu.api.hnsl.dao."+file.replace(".java", ""));
        			Map root = new HashMap();  
        	        String model_name =file.replace("Mapper.java", "");  
        	        String fileName =model_name + "Service.java";  
        	        String fileNameImpl =model_name + "ServiceImpl.java"; 
        	        String fileNameResource =model_name + "Resource.java";
        	        System.out.println(model_name);
        	        root.put("model_name", model_name);  
        	        root.put("author", "wyb");
        	        root.put("date", date);  
        	        root.put("isMul", isComposite);
        	        itemList.add(model_name);
        	        
        	        Template template = cfg.getTemplate("service.ftl");  
        	        hf.buildTemplate(root, projectPath, saveServicePath, fileName, template);  
        	        
        	        Template templateImpl = cfg.getTemplate("serviceImpl.ftl");  
        	        hf.buildTemplate(root, projectPath, saveServiceImplPath, fileNameImpl, templateImpl);
        	        
        	        Template templateResource = cfg.getTemplate("resource.ftl");  
        	        hf.buildTemplate(root, projectPath, saveResourcePath, fileNameResource, templateResource);
        		}
        	}
        }
        
        
        Map root = new HashMap();  
        String fileName ="datasource-services.xml";  
        root.put("itemList",itemList);  
        Template template = cfg.getTemplate("beans.ftl");  
        hf.buildTemplate(root, projectPath, saveBeanPath+"beans//", fileName, template);  
  
        
  
  
    }  
  
    public void buildTemplate(Map root, String projectPath, String savePath,  
            String fileName, Template template) {  
        String realFileName = projectPath + savePath + fileName;  
  
        String realSavePath = projectPath + "/" + savePath;  
        System.out.println(realFileName);
  
        File newsDir = new File(realSavePath);  
        if (!newsDir.exists()) {  
            newsDir.mkdirs();  
        }  
  
        try {  
            // SYSTEM_ENCODING = "UTF-8";  
            Writer out = new OutputStreamWriter(new FileOutputStream(  
                    realFileName), "UTF-8");  
  
            template.process(root, out);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
    }  
    
    public int isCompositeKey(String path) throws ClassNotFoundException{
    	System.out.println("path="+path);
    	Class c=Class.forName(path);
    	Method[] met=c.getDeclaredMethods();
    	for(Method method :met){
    		if(method.getName().equals("selectByPrimaryKey")){
    			Class[] pars=method.getParameterTypes();
    			for(Class cl:pars){
    				if(cl.getSimpleName().equals("String")){
    					return 0;
    				}else{
    					return 1;
    				}
    			}
    			
    		}
    	}
    	return -1;
    }
    
  
    public static void main(String[] args) throws Exception {  
    	if(args.length!=0){
    		projectPath=args[0];
    	}
    	
        TemplateUtil hf = new TemplateUtil();  
        hf.init();  
        hf.process(hf);  
    }  
  
}  
