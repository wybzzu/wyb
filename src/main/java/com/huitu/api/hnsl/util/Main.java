package com.huitu.api.hnsl.util;

public class Main {  
	  
    public static void main(String[] args) throws InterruptedException {  
    	LockObj A=new LockObj("objA");
    	LockObj B=new LockObj("objB");
        Thread1 mTh1=new Thread1("A",A);  
        Thread1 mTh2=new Thread1("B",A);  
        Thread1 mTh3=new Thread1("C",A);  
        //mTh1.setPriority(Thread.MAX_PRIORITY);
        //mTh2.setPriority(Thread.MIN_PRIORITY);
        mTh1.start();  
        //Thread.sleep(100);
        mTh2.start();  
        
        mTh3.start();
       
        //System.out.println("main end!");
  
    }  
  
}  
