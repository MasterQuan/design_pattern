package com.behaviour.observer.observer;

public class Observer1 implements IObserver {

	@Override
	public void update() {
		System.out.println("Observer1 update while observe subject updates£¡");
	}
}
