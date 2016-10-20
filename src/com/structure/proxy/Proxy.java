package com.structure.proxy;

/**
 * 代理模式就是多一个代理类出来，替原对象进行一些操作。
 * 代理类就像中介，它比我们掌握着更多的信息。
 * @author zhaoshiquan
 *
 */
public class Proxy implements Souceable{
	
	private Souceable source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	private void before(){
		System.out.println("Before method");
	}
	
	private void after(){
		System.out.println("After method");
	}

}
