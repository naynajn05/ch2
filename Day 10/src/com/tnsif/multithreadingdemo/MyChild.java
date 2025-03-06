package com.tnsif.multithreadingdemo;

public class MyChild extends Thread {
	private int n;
	private String msg;
	
	public MyChild(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	
	public void run()
	
	{
		System.out.println("Before the running stage,is thread alive? "+ this.isAlive());
		
		for(int i=1;i<=n;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(msg);
		}
	}
	

}
