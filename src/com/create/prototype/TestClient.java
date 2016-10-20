package com.create.prototype;

import java.io.IOException;

public class TestClient {
	public static void main(String[] args) throws CloneNotSupportedException,
	ClassNotFoundException, IOException {
		Prototype prototype = new Prototype();
		prototype.setBase(1);
		prototype.setObj(new Integer(2));
		/* «≥∏¥÷∆ */ 
		Prototype prototype1 = (Prototype) prototype.clone();
		/* …Ó∏¥÷∆ */
		Prototype prototype2 = (Prototype) prototype.deepClone();
		System.out.println(prototype1.getObj()==prototype1.getObj());
		System.out.println(prototype1.getObj()==prototype2.getObj());
	}
}
