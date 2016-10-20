package com.create.factory;

public class TestClient {
	public static void main(String[] args) {
		Product pdc1 = Factory.produce("Product1");
		pdc1.print();
		
		Product pdc2 = Factory.produce2();
		pdc2.print();
		
	}
}
