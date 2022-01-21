package a220121;

import java.util.Calendar;

public class SingletonTest {
	//Singleton vs Prototype �ν��Ͻ� �����������
//	�������ּҸ� ������ ����ϳ�
//	���� �ٸ� �ּ��� �ν��Ͻ��� ������̳�
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(singleton2);
		singleton = null;
		Singleton singleton3 = Singleton.getInstance();
		System.out.println(singleton3);
		
		System.out.println(singleton == singleton3);
		System.out.println(singleton2 == singleton3);
		
		Prototype prototype = Prototype.getInstance();
		Prototype prototype2 = Prototype.getInstance();
		Prototype prototype3 = Prototype.getInstance();
		System.out.println(prototype);
		System.out.println(prototype2); 
		System.out.println(prototype3); //����� �� �ٸ��ּ� ������

		System.out.println(prototype == prototype2);
		
		//Ķ����
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		System.out.println(calendar == calendar2);
	}
}

class Singleton{ //��������� ���� �ּҸ� ��
	// Ŭ���� ����ó�� �۵��Ѵ�
		
	private static Singleton singleton = new Singleton();
	private Singleton() {}
		
	public static Singleton getInstance() {
		return singleton;
	}
}

class Prototype{
	private Prototype () {}
	
	public static Prototype getInstance() {
		return new Prototype();
	}
}
