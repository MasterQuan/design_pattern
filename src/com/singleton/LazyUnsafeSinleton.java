package com.singleton;

//Lazy mode,Unsafe;
public class LazyUnsafeSinleton {
	private static LazyUnsafeSinleton singleton;
	
	private LazyUnsafeSinleton(){}
	
	public static LazyUnsafeSinleton getSinleton(){
		if(singleton == null){
			singleton = new LazyUnsafeSinleton();
		}
		return singleton;
	}
}
