package a220120;

public class ConstTest { //super() ���� Ŭ���� ������ ����
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.x);
		
		A a = new B(); //--> polymorphism
		System.out.println(a); 
		System.out.println(a.x);
		System.out.println(a.y);
//		System.out.println(a.z); //B �ν��Ͻ��ε� ������ �ȵ� ==> �����Ϸ��� ' �ʼ����� A���ؼ� ����'��� ������
								 //�����Ϸ��� ���� ��������
//		System.out.println((B)a.z); //. �� �� �켱������ �� ���� ����ȯ�� �ȵ�
		System.out.println(((B)a).z); //��ȣ �ļ� �켱���� ���������
	
	}
}

class A {
	int x;
	int y;
	
	A() {
		this(3, 1);
	}
	
//	A(){ super(); }
	A(int x, int y){
//		super(); // �������� ù�ٿ� this()�� super();�� ������ �����Ϸ��� �⺻�����ڸ� ���鷯����
		this.x = x;
		this.y = y;
		System.out.println(x + ", " + y + "�� �ʱ�ȭ��");
	}
}

class B extends A {
	int z = 10;
	B() {
		this(1); 
	}
	B(int x) {
		super(1, 3);
	}
	B(int x, int y) {
//		super();
//		this.x = x;
//		this.y = y;
	}
}
