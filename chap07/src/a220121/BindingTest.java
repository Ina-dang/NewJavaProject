package a220121;

public class BindingTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		System.out.println(A.si);
		System.out.println(B.si);
		A.sm();
		B.sm();
		
		//����������
		
		a = b; //A a = new B;
		System.out.println(a.i);
		System.out.println(b.i);
		
		a.m();
		b.m();
		
		//�������ε�(Dynamic Binding)
		//��������� ���� �ڼ� Ŭ���� �ߺ� ���ǵȰ�� �� Ŭ������ ����� ������� ���
		//�ν��Ͻ� �޼���� �ߺ����� �� ���(�������̵�) ���� �ν��Ͻ��� ���(�޼���)�� ȣ��
		//�ν��Ͻ� �޼���� ����� �ν��Ͻ��� ���� ������
	}
}

class A { 
	int i = 10;
	static int si = 20;
	
	void m() {
		System.out.println("A.m()");  
	}
	
	static void sm() {
		System.out.println("A.sm()");  
	}
}

class B extends A {
	int i = 30;
	static int si = 40;
	
	void m() {
		System.out.println("B.m()");  
	}
	
	static void sm() {
		System.out.println("B.sm()");  
	}
}
