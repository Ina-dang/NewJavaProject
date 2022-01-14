package a220114;

import java.util.Arrays;

public class StringArrayEx {
	public static void main(String[] args) {
		
		/*
		 * String str : �����ڷ��� class
		 * new String(); : ������(constructor)
		 */
		
//		String ��ü ���� ���
//		1. ū����ǥ ""
//		2. new������ ���
		String str1 = "abc";
		String str2 = new String("abc"); //new ==> heap�� ����°� ��Ģ
		String str3 = "abc";
		String str4 = new String("abc");
		
		System.out.println(str1 == str2); //false
		System.out.println(str2 == str3); //false
		System.out.println(str1 == str3); //true ==> String�� new�� �������� �ʰ� ""���ͷ��� ������ ���
										  //str1�� str3�� ������ �ν��Ͻ��� �����ϵ��� interned��
		System.out.println(str2 == str4); //false
		
		System.out.println(str1 == str2.intern()); //�̷��� �ϸ� true�� ����
		
		/*
		 * String literal ���� �� �ش� String ���� Heap ���� �� "String Constant Pool"�� ����Ǿ� ���������,
		 * new �����ڷ� �����ϸ� ���� �����̶� ���� ���� ��ü�� ���� Heap ������ �����ϱ� ����
		 * 
		 * ���ڿ� ���ͷ��� �����ϸ� ���Ǯ�� �����
		 * -> ������ ���ڿ��� �����ϸ� ����
		 */

		
//		//���� ���� Ŭ�������� ����� ���� ����
//		
//		int a = 10; //��Ʈ ���ͷ��� 10l�� �������� �������� �⺻�ڷ���� �ڽŸ��� ���� ���� ���ͷ��� �ֱ� ����
//		int[] arr = {1, 2, 3};
//
////		���� �ڷ����� ������ ���ͷ��� ���� ���� ����. 
////		��, �迭 & ���ڿ��� ����
//		
//		
//		StringEx ex = new StringEx(); // �����ڷ����� new�� �ڱ�� �Ȱ��� �̸��� 
//		Review result = new Review();
		
//		���� ���� ����
		String[] strs = new String[3]; // null�������
		//				{} ==> new�� �Ƚ��������� �׳� �����Ǿ����� �� �굵 new��
		//			  = new String[3] {1,2,3} �̶� �� �ٵ� ���� ������
		strs[0] = str1;
		strs[1] = str2;
		strs[2] = "abc"; //���� ���� ���������� �ᱹ ���� ����
		System.out.println(Arrays.toString(strs));
		System.out.println(strs[0] == strs[2]); //���� �ּҰ��Դϱ� ���
		System.out.println("abc" == "abc"); //�������� �̸��� �ᱹ
		
	}
}
