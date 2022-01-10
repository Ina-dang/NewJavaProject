package a220110;

import java.util.Scanner;

public class Homework {//윷놀이 만들어오기
	public static void main(String[] args) {
		
//	윷놀이로 예시
//	0000 : 윷 1/16
//	0111 : 
//	1000 : 걸 4/16
//	1100 : 개 6/16
//	1110 : 도 4/16 = 1/4
//	1111 : 모 1/16
		
		/*
		 * 16분의 몇으로 도개걸윷모가 나온다
		 * FlowEx7 난수 확인
		 */
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("던지려면 아무 단어나 입력하시오 >> ");
	String input = scanner.nextLine();
	
	int num = (int)(Math.random() * 16) + 1;
	if (num <= 4) {
		System.out.println("도");
	} else if (num <= 10) {
		System.out.println("개");
	} else if (num <= 14 ) {
		System.out.println("걸");
	} else if (num <= 15) {
		System.out.println("윷");
	} else
		System.out.println("모");
	
	scanner.close();
	}
}
