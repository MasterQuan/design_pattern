package com.singleton;

public class DCSingleton {
	private static volatile DCSingleton singleton;
	
	private DCSingleton(){}
	
	public static DCSingleton getDCSingleton(){
		if(singleton == null){
			synchronized (DCSingleton.class) {
				if(singleton == null){
					singleton = new DCSingleton();
				}
			}
		}
		return singleton;
	}
}
