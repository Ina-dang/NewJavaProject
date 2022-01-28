package interphase;

import java.util.Scanner;

import service.AdminService;

public class AdminMain { // 직원 메뉴 인터페이스
	Scanner sc = new Scanner(System.in);
	
	AdminService admin = new AdminService();
	
	private static int admin_password = 1111; // 직원 비밀번호 초기값
	
	public void admin_main() { // 어드민 화면
			System.out.print("비밀번호를 입력해주세요 > ");
			int tmp_pw = sc.nextInt();
			if(tmp_pw == admin_password) {
				System.out.println("로그인 성공");
			
			System.out.println("1. 테이블 관리 \t 2. 영업 관리 \t 3. 매출 현황 \t 4. 환경설정 \t 5. 종료");
				
			System.out.print("번호를 입력해주세요. >> ");
			int select = sc.nextInt();
			
			switch(select) {
				case 1:
					admin.table_service();
					break;
				case 2:
					admin.sales_management();
					break;
				case 3:
					admin.sales_currentState();
					break;
				case 4:
					admin.settings();
					break;
				case 5:
					admin.ending();
					break;
				default:
					System.out.print("올바른 번호를 입력하세요 >> ");
					break;
			} 
		}//if문 끝
		else {
			System.out.println("올바른 비밀번호가 아닙니다.");
		}
	} // admin_main 끝
}