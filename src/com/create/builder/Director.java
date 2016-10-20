package com.create.builder;

public class Director {
	private static IBuilder bd = new Builder();
	public static Product prodceProduct(){
		bd.build_part1();
		bd.build_part2();
		return bd.build();
	}
}
