package com.structure.facade;

/**
 * ���ģʽ��Ϊ�˽��������֮���������ϵ�ģ�
 * ��springһ�������Խ������֮��Ĺ�ϵ����
 * �������ļ��У������ģʽ���ǽ����ǵĹ�ϵ��
 * ��һ��Facade���У�����������֮�����϶�
 * ����ģʽ��û���漰���ӿڡ�
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
