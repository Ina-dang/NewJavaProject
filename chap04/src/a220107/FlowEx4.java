package a220107;

import java.util.Scanner;

public class FlowEx4 {// if else if else
	public static void main(String[] args) {
		/*
		 * �ϳ��� ����Ǵ� �����ε� ó���ؾ��� ����� ���� ���̻��ΰ��
		 */
		int score = 0;
		char grade = ' ';

		System.out.print("������ �Է��ϼ���. >> ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // ȭ���� ���� �Է¹��� ���ڸ� score�� ����

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("����� ������ " + grade + " �Դϴ�.");

		scanner.close();
	}
}
