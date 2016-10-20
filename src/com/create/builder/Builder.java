package com.create.builder;

public class Builder implements IBuilder{
	
	Product pdc = new Product();
	
	@Override
	public void build_part1() {
		pdc.setPart1("Part1 is ok!");
	}

	@Override
	public
	void build_part2() {
		pdc.setPart2("Part1 is ok!");
	}

	@Override
	public Product build() {
//		System.out.println("Product is ok!");
		return pdc;
	}
}
