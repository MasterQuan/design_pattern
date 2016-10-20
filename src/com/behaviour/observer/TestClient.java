package com.behaviour.observer;

import com.behaviour.observer.observer.Observer1;
import com.behaviour.observer.observer.Observer2;
import com.behaviour.observer.subject.ISubject;
import com.behaviour.observer.subject.MySubject;

public class TestClient {
	public static void main(String[] args) {
		ISubject sb = new MySubject();
		sb.add(new Observer1());
		sb.add(new Observer2());
		sb.update();
	}
	
}
