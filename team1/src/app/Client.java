package app;

import static util.ScannerUtil.nextInt;

import Service.OrderService;
import Service.ProductService;
import Service.SalesService;
import Service.TableService;
import Service.UserService;
import exception.RangeException;
import z_service.AdminService;

public class Client {
	public static void main(String[] args) {
		TableService tableService = TableService.getInstance();
		AdminService adminService = new AdminService(); // z_service내에 있는 클래스
		OrderService orderService = OrderService.getInstance();

		boolean mainCheck = true;

		while (mainCheck) {
			try {
				System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");

				int i ;				
				i = nextInt("번호를 입력해주세요. >> "); // int 자체를 숫자만 입력하게끔 만들면 좋을 것 같아요
				// 유틸에다가 바로 try catch 가 힘들 것 같긴함둥

				
				
				switch (i) {// 키오스크 메인
				case 1: // 테이블(손님)
					// 테이블 현황 조회
					tableService.displayTables(false);
					
					tableService.setTable(
							tableService.findBy(nextInt("몇번째 테이블인가요? >> "))
					);

					try {
						Thread.sleep(500); // .5초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("*******************************");
					try {
						Thread.sleep(300); // .3초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("**                           **");
					try {
						Thread.sleep(300); // .3초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}					
					System.out.println("**           휴 밤           **");
					try {
						Thread.sleep(300); // .3초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("**                           **");
					try {
						Thread.sleep(300); // .3초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("*******************************");
					try {
						Thread.sleep(300); // .3초 대기

					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					boolean customerCheck = true;

					while (customerCheck) {
						try {
							// order(), 
							System.out.println("1. 주문하기\t 2. 안주추천 \t 3. (계산전)주문내역확인 \t 4. 종료");

							int select1 = nextInt("번호를 입력해주세요.");

							switch (select1) {// 1. 주문하기 \t 2. (계산전)주문내역확인 \t 3. 종료
								case 1:// 메뉴선택
									orderService.order();
									break;
									
								case 2:// 메뉴선택
									ProductService.getInstance().menuRandom();
									break;
	
								case 3:// (계산전) 주문내역확인
									orderService.orderList();
									break;
	
								case 4:// 종료
									customerCheck = false;
									break;
	
								default:
									System.out.println("올바른 번호를 입력해주세요"); // 나중에 예외처리로 만들어야해요
									break;
							}
						} catch (NumberFormatException e) {
							System.out.println("숫자형식으로 입력해주세요");
						} catch (RangeException e) {
							System.out.println(e.getMessage());
						} // try-catch 끝
					} // while 끝
					break;
				// case 1 사용자 끝
				case 2:// 직원,관리자
					
					UserService.getInstance().login();

					boolean adminCheck = true;
					
					while (adminCheck) {
						try {
							System.out.println("1. 테이블 관리 \t 2. 매출 현황 \t 3. 환경설정 \t 4. 종료");

							switch (nextInt("번호를 입력해주세요.")) {
							case 1:// 테이블관리
								boolean tableCheck = true;

								while (tableCheck) {
									System.out.println("1. 테이블 현황 \t 2. 테이블 주문 취소 \t 3. 테이블 결제 \t 4. 테이블 이동 \t 5.테이블 초기화 6. 뒤로가기");

									switch (nextInt("번호를 입력해주세요. >> ")) {
										case 1: // 테이블 현황
											tableService.displayTables();
											break;
										case 2: // 테이블 주문 취소
											orderService.removeOrder();
											break;
										case 3: // 테이블 결제
											tableService.tablePay(nextInt("몇번째 테이블 입니까?") - 1);
											break;
										case 4: // 테이블 이동
											tableService.tableMove(nextInt("시작 테이블 > ") - 1, nextInt("이동 테이블 > ") - 1);
											break;
										case 5: // 테이블 초기화
											tableService.tableInit(nextInt("몇번째 테이블 입니까?") - 1);
											break;
										case 6: // 뒤로가기
											tableCheck = false;
											break;
										default:
											System.out.println("다른 번호를 입력해주세요.");
											break;
									} // switch end
								} // while end
								break;
							
							case 2:// 매출현황 ==> 나현
								SalesService.getInstance().salesCurrentState();
								break;
							case 3:// 환경설정
								UserService.getInstance().configuration();
								break;
							case 4:// 종료
								adminCheck = false;
								break;
							} // switch end
						} catch (NumberFormatException e) {
							System.out.println("숫자형식으로 입력해주세요");
						} // try-catch 끝
					} // while end
					break;
				// case 2 직원 관리자 끝
				case 3: // 키오스크 종료용
					mainCheck = false;
					break;

				default:
					System.out.println("올바른 번호를 입력해주세요"); // 나중에 예외처리로 만들어야해요
					break;
				} // 메인 키오스크 스위치 종료
			} catch (NumberFormatException e) {
				System.out.println("숫자형식으로 입력해주세요");
			} // catch종료
		} // 테이블,직원,종료 while문 종료
	} // main 종료
} // Client 종료

