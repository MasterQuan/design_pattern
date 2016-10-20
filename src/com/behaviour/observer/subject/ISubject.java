package com.behaviour.observer.subject;

import com.behaviour.observer.observer.IObserver;

public interface ISubject {
	/*���ӹ۲���*/  
    public void add(IObserver ob);  
 
    /*ɾ���۲���*/  
    public void delete(IObserver ob);  
 
    /*֪ͨ���еĹ۲���*/  
    public void notifyObservers();  
 
    /*����ĸ���*/ 
    public void update();  
}
