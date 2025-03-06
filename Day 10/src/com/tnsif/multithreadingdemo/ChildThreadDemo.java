package com.tnsif.multithreadingdemo;

public class ChildThreadDemo {

	public static void main(String[] args) {
		ChildThread thread1=new ChildThread(5,"Hello"); //stage 1
		//ChildThread thread2=new ChildThread(7,"Hi"); //stage 1
		
		thread1.start(); //runnable
		thread1.run();
		//thread1.start();
		
		System.out.println("End of the program");

	}

}
