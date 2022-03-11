package com.exception.Assignment;

public class MyThreadMAin {

	public static void main(String[] args) Throws InterruptedException{
		// TODO Auto-generated method stub 
		Thread t1=new Thread(new MyThread1("This is the message1"));
		Thread t2=new Thread(new MyThread1("This is the message2"));
		Thread t3=new Thread(new MyThread1("This is the message3"));
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
	}

	


}