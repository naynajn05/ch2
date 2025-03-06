package com.tnsif.multithreadingdemo;

public class ChildThread extends Thread{
	private int id;
	private String msg;
	
	public ChildThread(int id, String msg) {
		this.id = id;
		this.msg = msg;
	}
	
	public void run()
	{
		for(int i=1;i<=id;i++)
		{
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(msg+" "+i+ " "+
			Thread.currentThread().getName());

		}
	}
	

}
