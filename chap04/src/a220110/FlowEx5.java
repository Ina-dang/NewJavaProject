package a220110;

import java.util.Scanner;

public class FlowEx5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("������ �Է����ּ���. >>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ������ score �� ����
		
		System.out.printf("����� ������ %d�Դϴ�. %n", score);
		
//		if (score >= 90) {
//			grade = 'A';    // ������ 90�� �̻��̶�� 'A'����ϰ�
//			if (score >= 98) { //�� A�߿� 98�� �̻��ΰ� opt + ���
//				opt = '+';
//			} else if (score < 94) { //90���̻��ε� 94���̸��� - ���
//				opt = '-';
//			}
//		} else if (score >= 80) {
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84) {
//				opt = '-';
//			}
//		} else {
//			grade = 'C';
//		}
		
		//�̷��� ������ ���ְ� �ɼ��� �ϳ��� ���� �� �ִ�
		if (score >= 90) {
			grade = 'A';    // ������ 90�� �̻��̶�� 'A'����ϰ�
		} else if (score >= 80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		if (score>=80) {
			if ((score -1) %10 >= 7) {
				opt = '+';
			} else if (score %10 <=4) {
				opt = '-';
			}
		}
		System.out.printf("����� ������ %c%c�Դϴ�. %n", grade, opt);
	scanner.close();
	}	
}
