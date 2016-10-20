package com.create.builder;
/**
 * 建造者模式：是将一个复杂的对象的构建与它的表示分离，
 * 使得同样的构建过程可以创建不同的表示。
 * @author zhaoshiquan
 *
 */
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
