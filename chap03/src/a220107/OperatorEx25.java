package a220107;

// C��� ���� #include <studio.h> c���� �̰Ծ����� ����̾ȵ�
//import java.lang*;//�ڹٴ� �ʿ�������� �����Ϸ��� �ڵ��������

import java.util.Scanner; 

public class OperatorEx25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
									//ǥ���Է�
		char ch = ' ';
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���. >>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		//charAt(0) �� "abcde"�� �Է��ϸ� 0��° ������ġ a�� ��� �ؼ��Ѵٴ� ��
		//�������� �Է��ص� ù��°�� �ν�
		
		
		if('0'<= ch && ch <= '9') { //if���� ���ǽ��� ���� - boolean Ÿ��
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�. %n");
		}	//ǥ�����
		
		if(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�. %n");
		}
		
		
		///////////////////////////////////////////////////////////////////
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���. >>");
		String input1 = scanner.nextLine();
		ch = input1.charAt(0);
		
				if('0'<= ch && ch <= '9') {
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�. %n");
		}
		
		if(('a'<= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�. %n");
		}
		scanner.close();
	}
}
