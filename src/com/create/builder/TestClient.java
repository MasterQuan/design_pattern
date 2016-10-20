package com.create.builder;

public class TestClient {
	public static void main(String[] args) {
		Product pdc = Director.prodceProduct();
		System.out.println(pdc.getPart1());
		System.out.println(pdc.getPart2());
	}
}
