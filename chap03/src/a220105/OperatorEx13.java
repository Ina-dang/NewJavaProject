package a220105;

import java.util.Calendar;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a';
//		final char c1 = 'a'; //������ ��� final�� �߰��� ��쿣 c1+1 ���� | �����Ϸ��� ���ؼ� �Ǵ� 
		
//		char c2 = c1  + 1; //Type mismatch - ������ ���ͷ����� ����
		char c2 = 'a' + 1; //���ͷ� ���� ����
//		char c2 = 97  + 1;//����
		
		System.out.println(c1);
		System.out.println(c2);
		
//		D-day ��� : ���� ��¥�κ��� ��� ��¥ ���̰��� ���� ���
		Calendar cal = Calendar.getInstance();
		cal.set(2022, 5, 18);
		System.out.println(cal);
		
//		�����ð� - ���� 
		//System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		
		long dDay = cal.getTimeInMillis();
		long now = System.currentTimeMillis();
		
		long result = dDay - now;
		System.out.println(result);
		System.out.println(result / 1000);
		System.out.println((result / 1000) / 60);
		System.out.println((result / 1000) / 60 / 60);
		System.out.println((result / 1000) / 60 / 60 / 24);
	}
}
