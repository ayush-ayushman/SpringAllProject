package com.ty;

public class Main {
	public static void main(String[] args) {
		MyInterface my=new MyInterface() {
			
			@Override
			public void hello() {
				System.out.println("WELCOME AND HELP");
				
			}
		};
		my.hello();
		
	
	MyInterface m=new MyInterface() {
		
		@Override
		public void hello() {
			System.out.println("HOW ARE YOU");
			
		}
	};
	m.hello(); 
		SumInfer l=( a, b)->  a+b;
		
		System.out.println(l.sum(2,8));
		
		Length h=(it)-> it.length();
		System.out.println(h.wel("Ayush Ayushman New Delhi"));

	}
	
}
