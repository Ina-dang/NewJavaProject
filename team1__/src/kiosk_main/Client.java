package kiosk_main;

import java.util.Scanner;

import interphase.AdminMain;
import interphase.UserMain;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserMain table = new UserMain(); // 테이블 서비스
		AdminMain admin = new AdminMain(); // 어드민 서비스
		
		System.out.println("*******************");
		System.out.println("**     휴 밤     **");
		System.out.println("*******************");
		
		try {
			Thread.sleep(1000); //1초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		} // try 종료
		
		System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");
		
		System.out.println("번호를 입력해주세요.");
		int i = sc.nextInt();
		
		switch(i) {
			case 1:
				table.user_main(); // 테이블 서비스
				break;
				
			case 2:
				admin.admin_main();
				break;
				
			case 3:
				// 종료용
				break;
				
			default:
				break;
		}
		
		sc.close();
	}

} // Client 종료
