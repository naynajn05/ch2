package com.tnsif.multithreadingdemo;

public class ThreadLifeCycleDemo {

	public static void main(String[] args) {
		MyChild thread1=new MyChild(3," Hello");
		System.out.println("In new stage, is thread alive?" +thread1.isAlive());
		
		thread1.start();//runnable
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("end of the program");
		System.out.println("After execution,is thread alive? "+thread1.isAlive());
	}

}
