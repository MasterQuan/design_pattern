package com.create.factory;

/**
 * 普通工厂模式就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * @author zhaoshiquan
 *
 */
public class Factory {
	public static Product produce(String name){
		if("Product1".equals(name)){
			return new Product1();
		}else if("Product2".equals(name)){
			return new Product2();
		}
		System.out.println("没有该类型产品！");
		return null;
	}
	
	public static Product produce1(){
		return new Product1();
	}
	
	public static Product produce2(){
		return new Product2();
	}
}
