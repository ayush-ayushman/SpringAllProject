package com.ty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		Stream<Object> emp=Stream.empty();
		String n[]= {"ad","bc","cd","pk"};
		Stream<String> nk=Stream.of(n);
		nk.forEach(l->{System.out.println(l);
		});
		
	 IntStream stream=Arrays.stream(new int[]{45,10,20,30});
	 stream.forEach(p->{System.out.println(p);
	 });
	 List<Integer> p=new ArrayList<Integer>();
	 p.add(10);
	 p.add(20);
	 p.add(30);
	 p.add(40);
	 p.add(50);
	Stream<Integer> m=p.stream();
	m.forEach(e->{System.out.println(e);});
			
	
	}
}
