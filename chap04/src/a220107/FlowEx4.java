package a220107;

import java.util.Scanner;

public class FlowEx4 {// if else if else
	public static void main(String[] args) {
		/*
		 * 하나가 수행되는 구조인데 처리해야할 경우의 수가 셋이상인경우
		 */
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요. >> ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("당신의 학점은 " + grade + " 입니다.");

		scanner.close();
	}
}
