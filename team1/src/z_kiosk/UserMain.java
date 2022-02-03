package z_kiosk;

import java.util.Scanner;

import z_service.UserService;

public class UserMain { // 유저 인터페이스
	Scanner sc = new Scanner(System.in);
	UserService us = new UserService();
	
	public void user_main() { // 어드민 화면
		while (true) {
			System.out.println("1. 메뉴선택 \t 2. 장바구니 \t 3. 주문확인 \t 4. 종업원호출 ");
			
			System.out.println("번호를 입력해주세요.");
			int select = sc.nextInt();
			
			switch(select) {//1. 메뉴선택 2. 장바구니 3. 주문확인 4. 종업원호출 이동
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
	}

 // admin_main 끝
}