package Interphase;

import java.util.Scanner;

import service.UserService2;

public class userInterface { // 유저 인터페이스
	Scanner sc = new Scanner(System.in);
	UserService2 us = new UserService2();
	
	public void user_main() { // 어드민 화면

		System.out.println("1. 메뉴선택 \t 2. 장바구니 \t 3. 주문확인 \t 4. 종업원호출 ");
		
		System.out.println("번호를 입력해주세요.");
		int select = sc.nextInt();
		
		switch(select) {
			case 1:
				us.menuChoice();
				break;
			case 2:
				us.cart();
				break;
			case 3:
				us.cartHistory();
				break;
			case 4:
				us.customers();
				break;

			default: System.out.println("올바른 번호를 입력해주세요");
				break;
		}
	}

 // admin_main 끝
}
