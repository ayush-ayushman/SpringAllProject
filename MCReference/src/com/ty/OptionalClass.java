package com.ty;

import java.util.Optional;

public class OptionalClass {
	public static Optional<String> main(String[] args) {
		public static Optional<String> getName()
		{
			String name="Ayush";
			return Optional.ofNullable(name);
		}
		String st="Ayush Ayshman";
		if(null==st)
		{
			System.out.println("this is null object");
		}
		else
		{
			System.out.println(st.length());
		}
		Optional<String> optional=Optional.ofNullable(st);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse(st));
	}

}
