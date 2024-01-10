package com.ty;

public class Main1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1=new Thread(new A());
		t1.run();
		System.out.println(Thread.currentThread().getName());
		Thread t2=new Thread(new B());
		Thread.currentThread().setName("Ayush Ayushman");
		t2.run();
		System.out.println(Thread.currentThread().getName());
		A op=new A();
		op.start();
		B op1=new B();
		op1.start();
		
	}

}
