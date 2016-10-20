package com.create.singleton;

public class TestClient {
	public static void main(String[] args) {
		
		DCSingleton singleton1 = DCSingleton.getDCSingleton();
		DCSingleton singleton2 = DCSingleton.getDCSingleton();
		DCSingleton singleton3 = DCSingleton.getDCSingleton();
		DCSingleton singleton4 = DCSingleton.getDCSingleton();
		
		System.out.println("singleton1-->"+singleton1.hashCode());
		System.out.println("singleton2-->"+singleton2.hashCode());
		System.out.println("singleton3-->"+singleton3.hashCode());
		System.out.println("singleton4-->"+singleton4.hashCode());
	}
}
