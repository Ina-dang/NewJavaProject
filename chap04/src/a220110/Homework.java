package a220110;

import java.util.Scanner;

public class Homework {//������ ��������
	public static void main(String[] args) {
		
//	�����̷� ����
//	0000 : �� 1/16
//	0111 : 
//	1000 : �� 4/16
//	1100 : �� 6/16
//	1110 : �� 4/16 = 1/4
//	1111 : �� 1/16
		
		/*
		 * 16���� ������ ���������� ���´�
		 * FlowEx7 ���� Ȯ��
		 */
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("�������� �ƹ� �ܾ �Է��Ͻÿ� >> ");
//	String input = scanner.nextLine(); �̰ž����� �ٷ� ��������
	
	int num = (int)(Math.random() * 16) + 1;
	if (num <= 4) {
		System.out.println("��");
	} else if (num <= 10) {
		System.out.println("��");
	} else if (num <= 14 ) {
		System.out.println("��");
	} else if (num <= 15) {
		System.out.println("��");
	} else
		System.out.println("��");
	

	scanner.close();
	}
}
