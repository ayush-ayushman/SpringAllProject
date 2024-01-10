package com.ty;

public class MainT {
	public static void main(String[] args) {
		MyThr t=new MyThr();
		t.start();
		System.out.println(Thread.currentThread().getName());
	}

}
