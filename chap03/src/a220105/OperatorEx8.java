package a220105;

public class OperatorEx8 {
	public static void main(String[] args) {
		int a = 1_000_000;		// 1,000,000	1�鸸
		int b = 2_000_000;		// 2,000,000	2�鸸
		
		long c = a * b; 		// a * b = 2,000,000,000,000 2�� ���;��ϴµ�
		
		System.out.println(c);  //-1454759936 ������ ������ a * b�� ���� ����ǰ� �� �Ŀ� �º� long Ÿ�� c�� ����Ǳ⶧��
		
		//long ����� �˰������
		
		long c1 = (long)a * b;
		
		System.out.println(c1);
		
		//==========������� ���� ����==========================================
		int result1 = a * a / a; //100�� * 100�� ���� �̹� �����÷ο�(-72379968) / 100�� 
		int result2 = a / a * a; //100�� / 100�� = 1 ���� * 100��
		System.out.println(result1);
		System.out.println(result2);
		
		char ch = 91;
		System.out.println(ch++); //91 ����� ��� | ++ch�� 91���� ������ ch92�� ���
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		System.out.println(ch++);
		
		//char ch3 = ' ';
		int ch3 = ' ';
		System.out.println(ch3);
	}
}
