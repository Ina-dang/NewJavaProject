package a211231;

public class VarEx1 {
	public static void main(String[] args) {
		int year = 2022; //2022�� int year�� ���� �� ����
		int age = 30; // 30�� int(������) age�� ���� �� �Ҵ�
		
		System.out.println(age);
		System.out.println(year);
		
		/*
		 * �������� �켱����
		 * *+-/ '��Ģ������'��� �Ҹ��� �켱���� �߰�
		 * = '���Կ�����' ��� �Ҹ��� �켱���� ����
		 */
		
		year = age + 2000; //���� age�� ���� 2000�� ���ؼ� ���� year�� ����
		age = age + 1; //���� age�� ����� ���� 1������Ų��.
				
		System.out.println(year);
		System.out.println(age);
		
		age = year + 3000;
		
		System.out.println(age);
		
		int a = 0;
		a = a + 3 * 2;
		System.out.println(a);		
	}
}
