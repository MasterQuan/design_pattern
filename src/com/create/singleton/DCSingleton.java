package com.create.singleton;

/**
 * 使用双检锁的单例模式，线程安全，且高并发环境下吞吐量好
 * @author zhaoshiquan
 *
 */
public class DCSingleton {
	//私有静态属性
	private static volatile DCSingleton singleton;
	
	//私有构造方法
	private DCSingleton(){}
	
	//公有静态返回方法
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
