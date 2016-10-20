package com.create.singleton;

public class HungrySinleton {
	//�����ʱ�ͳ�ʼ��
	private static final HungrySinleton instance = new HungrySinleton();
	
	private HungrySinleton(){}
	
	public static HungrySinleton getInstance(){
		return instance;
	}
}
