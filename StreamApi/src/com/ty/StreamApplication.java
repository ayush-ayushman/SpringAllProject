package com.ty;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {
	public static void main(String[] args) {
		List<Integer> list1 = List.of(45, 85, 32, 42, 90, 20);
		Stream<Integer> stream = list1.stream();
		List<Integer> nw = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(nw);
		Stream<Integer> stream2 = list1.stream();
		List<Integer> n = stream2.filter(i -> i > 10).collect(Collectors.toList());
		System.out.println(n);

	}

}
