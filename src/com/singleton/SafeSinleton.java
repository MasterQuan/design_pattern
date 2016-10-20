package com.singleton;

//Lazy mode,Thread safe;
public class SafeSinleton {
	private static SafeSinleton singleton;
	private SafeSinleton(){}
	
	public static synchronized SafeSinleton getSinleton(){
		if(singleton == null){
			singleton = new SafeSinleton();
		}
		return singleton;
	}
}
