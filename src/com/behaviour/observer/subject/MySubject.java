package com.behaviour.observer.subject;

public class MySubject extends Subject{

	@Override
	public void update() {
		System.out.println("Subject update!");
		this.notifyObservers();
	}
}
