package com.ty;
public class Analyzers {
	public static void main(String[] args) {
		 StringAnalyzer k=(p,q)->
		 {
			  return p.contains(q);
			 
		 };
		 System.out.println(k.analyze("Ayush","Ayush"));
	
	}

}
