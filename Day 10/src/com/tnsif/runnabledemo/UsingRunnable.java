package com.tnsif.runnabledemo;

public class UsingRunnable implements Runnable{
	Thread thread;
	int high,low;
	String msg;
	
	

	public UsingRunnable(int high, int low, String msg) {
		thread=new Thread(this,"Child Thread");
		this.high = high;
		this.low = low;
		this.msg = msg;
		
	}


	@Override
	public void run() {
		for(int i=low;i<=high;i++)
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
