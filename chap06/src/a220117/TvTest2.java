package a220117;

class Tv {
	// Tv�� �Ӽ�(�������)
	String color;			// ����
	boolean power;			// ��������(on/off)
	int channel; 			// ä��
	
	// Tv�� ���(�޼���) ==> �Է� ��ȯ�� �ƹ��͵� ����
	void power()		{ power = !power; }  // TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp()	{ ++channel; }		 // TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown()	{ --channel; }		 // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
	
}

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	// Tv t1; �� t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();	
		// t1�� t2�� ���� �ٸ� �ּҸ� �������ִ�. 
		
		// int Ÿ���� �⺻ Ÿ���� 0 �׷��� ������ �Ѵ� ó�� �� 0���� ����
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2 = t1; //t1�� ���� t2�� ���� -> t1�� �ּҸ� �����Ѵ�
		
		t1.channel = 7 ; // channel�� ���� 7�� �Ѵ�
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		
		//t1�� ä�ΰ��� �ٲ�
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t2.channel = 10 ; // t2�� �������� �̹� t1�� t2�� ���� �ּҸ� �������̹Ƿ� t1,t2�� �� ��� �ٲ��
		
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}
