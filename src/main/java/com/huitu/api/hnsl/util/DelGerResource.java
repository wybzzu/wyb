package com.huitu.api.hnsl.util;

import java.io.File;
/**
 * 删除所有动态生成的java
 * 删除后文件不可恢复，慎用！！！！！！！！！！
 * @author Administrator
 *
 */

public class DelGerResource {
	
	private static String workPath="F://api-hnfbapp//";//工程路径

	public static void main(String[] agrs){
		String pathJave=workPath+"src//main//java//com//huitu//api//hnsl";
		String pathXml=workPath+"src//main//resources//mappers//hnsl";
		File dirJave=new File(pathJave);
		File dirXml=new File(pathXml);
		del(dirJave);
		del(dirXml);
        
	}
	
	public static void del(File file){
		File[] files=file.listFiles();
		for(File fil : files){
			
			if(!(fil.getName().contains("util")||fil.getName().contains("rest")||fil.getName().contains("filter")||fil.getName().contains("common")||fil.getName().contains("exception"))&&fil.isDirectory()){
				System.out.print(fil.listFiles().length);
				if(fil.listFiles().length==0){
					return;
				}else{
					del(fil);
				}
			}else{
				if(fil.exists()){
					fil.delete();
				}
			}
		}
		
	}
}
