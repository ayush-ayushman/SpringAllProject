package com.ty;

public class MyThr extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

}
