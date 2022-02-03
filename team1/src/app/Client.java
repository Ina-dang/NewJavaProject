package app;

import java.util.Scanner;

import Domain.MenuItem;
import Service.*;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AdminImpl admin = new AdminImpl();
		MenuImpl menu = new MenuImpl();
		MenuItem menuItem = new MenuItem();
		OrderImpl custormer = new OrderImpl();
		
		
		admin.tableInit();
		
		System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");
		
		System.out.println("번호를 입력해주세요.");
		int i = sc.nextInt();
		
		switch(i) {
			case 1:
				System.out.println("몇번째 테이블 입니까?");
				final int tableIndex = sc.nextInt() - 1;
				
				boolean close = true;
				
				while(close) {
					System.out.println("*******************");
					System.out.println("**     휴 밤     **");
					System.out.println("*******************");
					
					try {
						Thread.sleep(1000); //1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // try 종료

					
					
					
					
				}
				
				
				
				break;
				
			case 2:
				int admin_password = 1111; // 직원 비밀번호 초기값
				
				System.out.print("비밀번호를 입력해주세요 > ");
				int tmp_pw = sc.nextInt();
				if(tmp_pw == admin_password) {
					System.out.println("직원 확인 했습니다.");
					System.out.println("1. 테이블 관리 \t 2. 영업 관리 \t 3. 매출 현황 \t 4. 환경설정 \t 5. 종료");
					
					System.out.println("번호를 입력해주세요.");
					int select = sc.nextInt();
					
					switch(select) {
					case 1:

						break;
					case 2:
	
						break;
					case 3:

						break;
					case 4:

						break;
					case 5:

						break;
					default:
						break;
					}
				}
				else {
					System.out.println("올바른 비밀번호가 아닙니다.");
				}
				// 직원
				break;
				
			case 3:
				// 종료용
				break;
		}
		
		sc.close();
	}
}		
		
		
		
		
		
		
//		MenuItem menuItem = new Product(101,"김치찌개",13000,20);
//	    Product product1 = new Product(102,"부대찌개",14000,20);
//	    Product product2 = new Product(103,"어묵탕",12000,20);
//	    Product product3 = new Product(104,"해물탕",17000,20);
//	    Product product4 = new Product(105,"번데기탕",8000,20);
//
//	    // 볶음류 
//	    Product product5 = new Product(201,"오돌뼈",13000,20);
//	    Product product6 = new Product(202,"닭똥집",12000,20);
//	    Product product7 = new Product(203,"찜닭",13000,20);
//	    Product product8 = new Product(204,"매운찜닭",14000,20);
//	    Product product9 = new Product(205,"계란말이",12000,20);
//	    Product product10 = new Product(206,"스팸계란",11000,20);
//
//
//	    Product product11 = new Product(301,"감자튀김",12000,20);
//	    Product product12 = new Product(302,"치킨",14000,20);
//	    Product product13 = new Product(303,"양념치킨",15000,20);
//	    Product product14 = new Product(304,"수제소세지",12000,20);
//	    Product product15 = new Product(305,"콘치즈",11000,20);
//
//	    // 주류
//	    Product product16 = new Product(401,"참이슬",4000,20);
//	    Product product17 = new Product(402,"진로",4000,20);
//	    Product product18 = new Product(403,"좋은데이",4000,20);
//	    Product product19 = new Product(404,"대선",4000,20);
//
//	    Product product20 = new Product(405,"카스",4000,20);
//	    Product product21 = new Product(406,"하이트",4000,20);
//	    Product product22 = new Product(407,"테라",4000,20);
//
//	    //음료
//	    Product product23 = new Product(501,"콜라",2000,20);
//	    Product product24 = new Product(502,"사이다",2000,20);
//	    Product product25 = new Product(503,"환타",2000,20);
//
//	    // 기타
//	    Product product26 = new Product(601,"날치주먹밥",3000,20);
//	    Product product27 = new Product(602,"볶음밥",2000,20);
//	    Product product28 = new Product(603,"치킨무",2000,20);