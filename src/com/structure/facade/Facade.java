package com.structure.facade;

/**
 * 外观模式是为了解决类与类之间的依赖关系的，
 * 像spring一样，可以将类和类之间的关系配置
 * 到配置文件中，而外观模式就是将他们的关系放
 * 在一个Facade类中，降低了类类之间的耦合度
 * ，该模式中没有涉及到接口。
 * @author zhaoshiquan
 *
 */
public class Facade {
	private Inner1 inn1 = new Inner1();
	private Inner2 inn2 = new Inner2();
	private Inner3 inn3 = new Inner3();
	
	public void startup(){
		System.out.println("Facede startup!");
		inn1.startup();
		inn2.startup();
		inn3.startup();
	}
	public void shutdown(){
		inn1.shutdown();
		inn2.shutdown();
		inn3.shutdown();
		System.out.println("Facade shutdown!");
	}
}
