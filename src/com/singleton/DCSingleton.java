package com.singleton;

//double check mode,Thread safe;
public class DCSingleton {
	//˽�о�̬����
	private static volatile DCSingleton singleton;
	
	//˽�й��췽��
	private DCSingleton(){}
	
	//���о�̬���ط���
	public static DCSingleton getDCSingleton(){
		if(singleton == null){                      //Single Checked
			synchronized (DCSingleton.class) {
				if(singleton == null){              //Double Checked
					singleton = new DCSingleton();  
				}
			}
		}
		return singleton;
	}
}
