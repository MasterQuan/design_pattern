package com.create.singleton;
//饿汉模式
public class HungrySinleton {
	//类加载时就初始化
	private static final HungrySinleton instance = new HungrySinleton();
	
	private HungrySinleton(){}
	
	public static HungrySinleton getInstance(){
		return instance;
	}
}
