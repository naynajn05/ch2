package com.tnsif.runnabledemo;

public class RunnableDemo {

	public static void main(String[] args) {
		//UsingRunnable r=new UsingRunnable(5,1,"Hello");
	   // new Thread(r).start();
	    
	    Runnable r1=()-> {
	    	for(int i=1;i<=3;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+ " "+
			Thread.currentThread().getName());

		}
	    	};
	    new Thread(r1).start();
		
	}

}
