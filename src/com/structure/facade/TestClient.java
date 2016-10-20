package com.structure.facade;

public class TestClient {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.startup();
		System.out.println();
		facade.shutdown();
	}
}
