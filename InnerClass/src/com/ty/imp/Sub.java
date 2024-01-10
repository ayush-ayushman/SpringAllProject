package com.ty.imp;

public class Sub {

	public class Map {
		public void Subu() {
			System.out.println("Ayush Ayushman");
		}
	}

	public static void main(String[] args) {
		Sub op = new Sub();
		Sub.Map p = op.new Map();
		p.Subu();

	}

}
