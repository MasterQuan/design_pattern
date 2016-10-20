package com.structure.proxy;

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
