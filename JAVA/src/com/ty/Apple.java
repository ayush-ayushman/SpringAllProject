package com.ty;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Vector;

public class Apple {
	public static void main(String[] args) {
		ArrayList<String> st=new ArrayList<String>();
		st.add("AB");
		st.add("BC");
		st.add("EF");
		System.out.println(st);
		LinkedList<String> op=new LinkedList<String>();
		op.add("AB");
		op.add("PC");
		op.add("EF");
		System.out.println(op);
		Vector<String> c=new Vector<String>();
		c.add("ram");
		c.add("shyam");
		c.add("mohan");
		System.out.println(c);
		Deque<String> p=new ArrayDeque<String>();
		p.push("Apple");
		p.push("Orange");
		p.push("Banana");
		int l=p.size()-1;
		while(l>=0)
		{ 
			System.out.println(p.pop());
			l--;
			
			
		}
		
	}

}
