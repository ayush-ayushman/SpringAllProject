package com.ty;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(45, 85, 32, 42, 90, 20);
		List<Integer> list2=new ArrayList<Integer>();
		for(Integer m:list1)
		{
			if(m%2==0)
			{
				list2.add(m);
			}
		}
		System.out.println(list2);
		
	}

}
