package com.huitu.api.hnsl.util;

public class Thread1 extends Thread{  
    private String name;  
    private LockObj obj;
    public Thread1(String name,LockObj o) {  
       this.name=name;  
       this.obj=o;
      
    }  
    public void run() {  
        for (int i = 0; i < 5; i++) {  
            synchronized(obj){
            	//System.out.println(obj.getName());
            	System.out.println(this.name+":"+i);
            	obj.notify();
            	try {
					obj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }  
         
    }  
}  