package com.create.builder;
/**
 * ������ģʽ���ǽ�һ�����ӵĶ���Ĺ��������ı�ʾ���룬
 * ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
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
