package com.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * ˵�����ƶ����ҽ���϶����ǳ���ƺ������˵һ�£�������Ҫ�˽�����ǳ���Ƶĸ��
 * ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�
 * ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�
 * ����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ����ס�
 * @author zhaoshiquan
 *
 */
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private int base;

	private Integer obj;

	/* ǳ���� */  
	public Object clone() throws CloneNotSupportedException {
		
		// super.clone()���õ���Object��clone()����.
		// ����Object���У�clone()��native�����ط�������
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/* ��� */
	public Object deepClone() throws IOException, ClassNotFoundException {

		/* д�뵱ǰ����Ķ������� */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/* �������������������¶��� */
		ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
		Object obj = ois.readObject();
		//�ر���Դ
		ois.close();
		oos.close();
		bos.close();
		return obj;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public Integer getObj() {
		return obj;
	}

	public void setObj(Integer obj) {
		this.obj = obj;
	}

}
