package com.behaviour.observer;

public class TestClient {
	public static void main(String[] args) {
		ISubject sb = new MySubject();
		sb.add(new Observer1());
		sb.add(new Observer2());
		sb.update();
	}
	
}
