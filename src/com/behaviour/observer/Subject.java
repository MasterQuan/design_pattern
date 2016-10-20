package com.behaviour.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class Subject implements ISubject {

	private Vector<IObserver> vector = new Vector<IObserver>();

	@Override
	public void add(IObserver ob) {
		vector.add(ob);
	}

	@Override
	public void delete(IObserver ob) {
		vector.remove(ob);
	}

	@Override
	public void notifyObservers() {
		Enumeration<IObserver> enumo = vector.elements();  
		while(enumo.hasMoreElements()){  
			enumo.nextElement().update();  
		}  
	}
}
