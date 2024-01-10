package com.ty;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMethod {
 public static void main(String[] args) {
	 List<String> names=List.of("Ayush","Aman","Binod","Car");
	List<String> nmstr =names.stream().filter(e->e.startsWith("A")).collect(Collectors .toList());
	System.out.println(nmstr);
	List<Integer> st=List.of(12,32,78,20,70);
	List<Integer> s=st.stream().map(i->i*i).collect(Collectors.toList());
	System.out.println(s);
	s.stream().forEach(e->{System.out.println(e);});
	s.stream().forEach(System.out::println);//short-cut-method
	s.stream().sorted().forEach(System.out::println);
	Integer inr=st.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println(inr);
	Integer inr1=st.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println(inr1);
}
}
