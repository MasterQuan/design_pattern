package com.create.factory;

/**
 * ��ͨ����ģʽ���ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ�����
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
		System.out.println("û�и����Ͳ�Ʒ��");
		return null;
	}
	
	public static Product produce1(){
		return new Product1();
	}
	
	public static Product produce2(){
		return new Product2();
	}
}
