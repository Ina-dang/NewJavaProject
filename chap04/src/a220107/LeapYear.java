package a220107;

import java.util.Scanner;

public class LeapYear { //������ 2���� 29��
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);	
			
	System.out.print("���ڸ� �Է��ϼ���");
	int year = Integer.parseInt(scanner.nextLine());
	String result = ((year%4==0 && year%100!=0) || year%400==0) ? "����" : "���" ;
	System.out.printf("�Է��Ͻ� ���ڴ� %s�Դϴ�", result); 
	/*
	 * ���׿����� ����.
	 * booleanŸ�� ������
	 */
	
	//���� ���ϴ´�
	int year1 = 400;
//1
	System.out.println( year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400==0 ? "����" : "���");
//2
	if(year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400==0) {
		System.out.println("����");
	}
	else {
		System.out.println("���");
	}
	
	
	//4�⸶�� ���� 100�⸶�� �ƴϰ� 400�⸶�� ����
//	System.out.println( year = (year%4==0) && (year%100!=0) || (year%400==0) ? 1 : 0);
	
	
//	if ( year%4==0 ) {
//		System.out.print( year + " �� �����Դϴ�");
//	} else if ( year%400==0) {
//		System.out.print( year + " �� ���� �Դϴ�");
//	} else if ( year%100==0 ) {
//		System.out.print( year + " �� ������ �ƴմϴ�");
//	} else {
//		System.out.println(year + " �� ������ �ƴմϴ�");
//	}
	
	
	
	

	
	
	scanner.close();
	}
}
