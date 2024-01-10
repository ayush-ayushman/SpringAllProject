package com.ty;
public class ThreadDemo {
	public static void main(String[] args) {
		Runnable r=()->
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				
			}
		};
		Thread r1=new Thread(r);
		r1.setName("Ayush AYUSHMAN");
		r1.start();
		
	}

}
