package com.behaviour.observer;

public interface ISubject {
	/*增加观察者*/  
    public void add(IObserver ob);  
 
    /*删除观察者*/  
    public void delete(IObserver ob);  
 
    /*通知所有的观察者*/  
    public void notifyObservers();  
 
    /*自身的更新*/ 
    public void update();  
}
