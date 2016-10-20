package com.behaviour.observer.subject;

import java.util.Enumeration;
import java.util.Vector;

import com.behaviour.observer.observer.IObserver;

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
