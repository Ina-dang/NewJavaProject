package a220110;

import java.util.Scanner;

public class FlowEx6 {
	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���. >>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month/3) {
		case 1:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 2:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 3:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		default : 
			System.out.println("������ ������ �ܿ��Դϴ�.");	
		
			scanner.close();
			/*
			 * /3
			 * 3 4 5   ..1
			 * 6 7 8   ..2
			 * 9 10 11 ..3
			 */
		}
	}    
}
