//package z_kiosk;
//
//import java.util.Scanner;
//
//public class Client2 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		UserMain table = new UserMain(); // 테이블 서비스
//		AdminMain admin = new AdminMain(); // 어드민 서비스
//		
//		System.out.println("*******************");
//		System.out.println("**     휴 밤     **");
//		System.out.println("*******************");
//		
//		try {
//			Thread.sleep(1000); //1초 대기
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} // try 종료
//		
//		System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");
//		
//		System.out.println("번호를 입력해주세요.");
//		int i = sc.nextInt();
//		
//		switch(i) {//키오스크 메인
//			case 1: //테이블(손님)
//				while (true) {
//					System.out.println("1. 메뉴선택 \t 2. 장바구니 \t 3. 주문확인 \t 4. 종업원호출 ");
//					
//					System.out.println("번호를 입력해주세요.");
//					int select = sc.nextInt();
//					
//					switch(select) {//1. 메뉴선택 2. 장바구니 3. 주문확인 4. 종업원호출 이동
//						case 1://메뉴선택 
//							System.out.println("몇번째 테이블 입니까?");
//							final int tableIndex = sc.nextInt() - 1;
//							
//							boolean close = true;
//							
//							while(close) {
//							
//								
//							}
//							break;
//						case 2:
//							
//							break;
//						case 3:
//							
//							break;
//						case 4:
//							
//							break;
//			
//						default: System.out.println("올바른 번호를 입력해주세요");
//							break;
//					}
//				}
//				
//			case 2://직원,관리자
//				int admin_password = 1111; // 직원 비밀번호 초기값
//				
//				System.out.print("비밀번호를 입력해주세요 > ");
//				int tmp_pw = sc.nextInt();
//				if(tmp_pw == admin_password) {
//					System.out.println("직원 확인 했습니다.");
//					System.out.println("1. 테이블 관리 \t 2. 영업 관리 \t 3. 매출 현황 \t 4. 환경설정 \t 5. 종료");
//					
//					System.out.println("번호를 입력해주세요.");
//					int select = sc.nextInt();
//					
//					switch(select) {
//					case 1://테이블관리
//
//						break;
//					case 2://영업관리
//	
//						break;
//					case 3://매출현황
//
//						break;
//					case 4://환경설정
//
//						break;
//					case 5://종료
//
//						break;
//					}
//				}
//				else {
//					System.out.println("올바른 비밀번호가 아닙니다.");
//				}
//				// 직원
//				break;
//				
//			case 3:
//				// 종료용
//				break;
//		}
//	}
//	
//}
//
// // Client 종료
