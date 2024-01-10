package com.ty;
public class MyThread implements Runnable {

	@Override
	public void run() {
		for(int k=0;k<10;k++)
		{
			System.out.println(k);
		}
		
	}



}
