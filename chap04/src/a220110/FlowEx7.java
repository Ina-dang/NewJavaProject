package a220110;

import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���. >");
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3 ) + 1;
		//Math.random = ���� ������
		// 0.0 <= Math.random() < 1.0 -> 0�̻� 1�̸��� ������ ���´�
		// Math.random()   : 0 ~ 0.999999999999999 (double type) 
		// Math.random()*3 : 0 ~ 2.999999999999999
		// (int)(Math.random() * 3)    : 0, 1, 2
		// (int)(Math.random() * 3) +1 : 1, 2, 3
		
		System.out.println("����� " + user + "�Դϴ�.");
		System.out.println("����� " + com + "�Դϴ�.");
		
//		int com = (int) (Math.random() * 3 ) + 1;
//		7~13
//		7 8 9 10 11 12 13
//		(int)(Math.random() * 7) + 7 : 0 1 2 3 4 5 6 7
		
		switch (user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
//			break; ������ �����̹Ƿ� break�� ����� �ʿ䰡 ����.
			
			//6��ü�� �ֻ��� 2�� ������ �� �� (���� 2~12)
//			int com = (int)(Math.random() * 11 ) + 2;
			//�̷����ϸ� 2�� 12�� �ι��� ���� Ȯ���� �ִ� �׷��� ������
//			int com = (int)(Math.random() * 6 ) + 1 + (int)(Math.random() * 6 ) + 1
					  // �̷��� �ֻ��� �� �� ó�� �� �� �������Ѵ�
			
//			�����̷� ����
//			0000 : �� 1/16
//			0111 : 
//			1000 : �� 4/16
//			1100 : �� 6/16
//			1110 : �� 4/16 = 1/4
//			1111 : �� 1/16
			
//			������ �������� ��
		}
		scanner.close();
	}
}
