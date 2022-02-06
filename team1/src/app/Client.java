package app;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import Service.OrderService;
import Service.TableService;

public class Client {
	public static void main(String[] args) {
//		AdminMain admin = new AdminMain(); // 어드민 서비스
//		UserMain table = new UserMain(); // 테이블 서비스
		TableService tableService = new TableService();
		OrderService orderService = new OrderService();

		String adminPassword = "1111"; // 직원 비밀번호 초기값
		
		tableService.tableInitAll(); // 6개 테이블 전부 null 값으로 변경
		
		boolean mainCheck = true;
		
		while(mainCheck) {
			try {
				System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");
				
				int i = nextInt("번호를 입력해주세요. >> ");
				
				switch(i) {//키오스크 메인
					case 1: //테이블(손님)
						System.out.println("*******************");
						System.out.println("**     휴 밤     **");
						System.out.println("*******************");
						
						try {
							Thread.sleep(1000); //1초 대기
						} catch (InterruptedException e) {
							e.printStackTrace();
						} // try 종료
						
						boolean customerCheck = true;
						
						while (customerCheck) {
							try {
								System.out.println("1. 메뉴선택 \t 2. 장바구니 \t 3. 주문확인 \t 4. 종업원호출 \t 5.종료");
								
								int num = nextInt("번호를 입력해주세요.");
								
								switch(num) {//1. 메뉴선택 2. 장바구니 3. 주문확인 4. 종업원호출로 이동
									case 1://메뉴선택 
										break;
										
									case 2://장바구니
										
										orderService.cart(); //주문확인 하려면 일단 담아야해서... order 테스트용으로 사용중(나현)
										break;
										
									case 3: //주문확인 ==> 나현쓰
										orderService.order(); 
										break;
										
									case 4://종업원호출
										// 이거를 메뉴선택으로 넣으면 좋을 것 같아요
										break;
										
									case 5://종료 만들어야할듭..?
										customerCheck = false;
										break;
										
									default: System.out.println("올바른 번호를 입력해주세요"); // 나중에 예외처리로 만들어야해요
									break;
								}
							} catch (NumberFormatException e) {
								System.out.println("숫자형식으로 입력해주세요");
							} //try-catch 끝
						}//while 끝
						break;
						//이거 하고 갑자기 비밀번호로 넘어가짐 
					//case 1 사용자 끝
					case 2://직원,관리자
						// 직원 비밀번호 초기값 1111
						
						String tmpPassword = nextLine("비밀번호를 입력해주세요 > ");
						
						boolean adminCheck = true;
						
						if(tmpPassword.equals(adminPassword)) {
							System.out.println("직원 확인 했습니다.");
							
							while(adminCheck) {
								try {
									System.out.println("1. 테이블 관리 \t 2. 영업 관리 \t 3. 매출 현황 \t 4. 환경설정 \t 5. 종료");
									int select1 = nextInt("번호를 입력해주세요.");
									
									switch(select1) {
										case 1://테이블관리				
											tableService.tableStatus(nextInt("몇번째 테이블 입니까?") - 1); // 아직 오류나요!!
											
											break;
										case 2://영업관리 ==> 나현쓰
											
											break;
										case 3://매출현황 ==> 나현
											
											break;
										case 4://환경설정
											
											break;
										case 5://종료
											adminCheck = false;
											break;
									} // switch end
								} catch (NumberFormatException e) {
									System.out.println("숫자형식으로 입력해주세요");
								} // try-catch 끝
							} // while end
						} // if end
					else {
						System.out.println("올바른 비밀번호가 아닙니다.");
					}
					break;
					//case 2 직원 관리자 끝 	
					case 3:	// 키오스크 종료용
						mainCheck = false;
						break;
					
					default: System.out.println("올바른 번호를 입력해주세요"); // 나중에 예외처리로 만들어야해요
					break;
				} //메인 키오스크 스위치 종료
			} catch (NumberFormatException e) {
				System.out.println("숫자형식으로 입력해주세요");
			} //catch종료
		} //테이블,직원,종료 while문 종료
	} //main 종료
} // Client 종료
	
		
		
		
		
		
		
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