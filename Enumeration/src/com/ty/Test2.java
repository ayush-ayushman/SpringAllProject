package com.ty;

import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		Bear2 [] m=Bear2.values();
		for(Bear2 l:m)
		{
			System.out.println(l.getPrice());
		}
		PowerState [] s=PowerState.values();
		for(PowerState w:s)
		{
			System.out.println(w.getDescription());
		}
	}

}
