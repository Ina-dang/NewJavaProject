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
//		AdminMain admin = new AdminMain(); // 어드민 서비스
//		UserMain table = new UserMain(); // 테이블 서비스
		TableService tableService = TableService.getInstance();
//		OrderService orderService = new OrderService();
//		UserService userService = new UserService();
//		ProductService productService = new ProductService();
//		UserService userService = new UserService();
//		ProductService productService = new ProductService();
		AdminService adminService = new AdminService(); // z_service내에 있는 클래스
		OrderService orderService = OrderService.getInstatnce();

//		String adminPassword = "1111"; // 직원 비밀번호 초기값

//		int tableIndex = 0;

//		tableService.tableInitAll(); // 6개 테이블 전부 null 값으로 변경

		boolean mainCheck = true;

		while (mainCheck) {
			try {
				System.out.println("1. 테이블 \t 2. 직원용 \t 3. 종료");

				int i = nextInt("번호를 입력해주세요. >> ");

				switch (i) {// 키오스크 메인
				case 1: // 테이블(손님)
					// 테이블 현황 조회
					tableService.displayTables(false);
					
					tableService.setTable(tableService.findBy(nextInt("몇번째 테이블인가요? >> ")));

					System.out.println("*******************");
					System.out.println("**     휴 밤     **");
					System.out.println("*******************");

					try {
						Thread.sleep(1000); // 1초 대기
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // try 종료

					boolean customerCheck = true;

					while (customerCheck) {
						try {
							// order(), 
							System.out.println("1. 주문하기 \t 2. (계산전)주문내역확인 \t 4. 종료");

							int select1 = nextInt("번호를 입력해주세요.");

							switch (select1) {// 1. 메뉴선택 2. 장바구니 3. 주문확인
							case 1:// 메뉴선택
								//ProductService.getInstance().productsList(); // 메뉴판 출력
								orderService.cart(); // 주문확인 하려면 일단 담아야해서... order 테스트용으로 사용중(나현)
								break;

							case 2:// 장바구니
								System.out.println("1. 주문하기 \t 2. 취소하기 \t 3. 돌아가기");

								switch (nextInt("번호를 입력해주세요.")) {
								case 1:
//												orderService.cartToOrder(tableIndex);
								case 2: // 나현누나
//												orderService.remove();
									break;
								case 3:
									System.out.println("돌아갑니다.");
									break;
								}
								break;

							case 3: // 주문확인

//										OrderService.cartHistory();
								// 주문내역 출력시 cart list / order list 순서가 같이 진행되어야 하는데..

								// 승종이꺼
//								orderService.orderHistory();
								break;

							case 4:// 종료 만들어야할듭..?
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
				// 이거 하고 갑자기 비밀번호로 넘어가짐
				// case 1 사용자 끝
				case 2:// 직원,관리자
						// 직원 비밀번호 초기값 1111
//						String tmpPassword = nextLine("비밀번호를 입력해주세요 > ");
					UserService.getInstance().login();

					boolean adminCheck = true;

//						if(tmpPassword.equals(adminPassword)) {
//							System.out.println("직원 확인 했습니다.");
//						

					while (adminCheck) {
						try {
							System.out.println("1. 테이블 관리 \t 2. 영업 관리 \t 3. 매출 현황 \t 4. 환경설정 \t 5. 종료");

							switch (nextInt("번호를 입력해주세요.")) {
							case 1:// 테이블관리
								boolean tableCheck = true;

								while (tableCheck) {
									System.out.println(
											"1. 테이블 현황 \t 2. 테이블 주문 취소 \t 3. 테이블 결제 \t 4. 테이블 이동 \t 5.테이블 초기화 6. 뒤로가기");

									switch (nextInt("번호를 입력해주세요. >> ")) {
//									case 1: // 테이블 현황
//										tableService.table(tableIndex, orderService);
//										tableService.tableStatus(nextInt("몇번째 테이블 입니까?") - 1); // 아직 오류나요!!
//										break;
//									case 2: // 테이블 주문 취소
//										tableService.table(tableIndex, orderService);
////														orderService.removeOrder(nextInt("몇번째 테이블 입니까?") - 1);
//										break;
//									case 3: // 테이블 결제
//										tableService.table(tableIndex, orderService);
//										tableService.tablePay(nextInt("몇번째 테이블 입니까?") - 1);
//										break;
//									case 4: // 테이블 이동
//										tableService.table(tableIndex, orderService);
//										int endIndex = nextInt("끝나는 테이블") - 1;
//										tableService.tableMove(tableIndex, endIndex);
//										tableIndex = endIndex;
//										break;
//									case 5: // 테이블 초기화
//										tableService.tableInit(nextInt("몇번째 테이블 입니까?") - 1);
//										break;
//									case 6: // 뒤로가기
//										tableCheck = false;
//										break;
//													default:
//														System.out.println("다른 번호를 입력해주세요.");
//														break;
									} // switch end
								} // while end
								break;
							case 2:// 영업관리 ==> 나현쓰
								SalesService.sales_management();
								break;
							case 3:// 매출현황 ==> 나현
								SalesService.getInstance().sales_currentState(null, i); // 오류뜸
								break;
							case 4:// 환경설정
								UserService.getInstance().configuration();
								break;
							case 5:// 종료
								adminCheck = false;
								break;
							} // switch end
						} catch (NumberFormatException e) {
							System.out.println("숫자형식으로 입력해주세요");
						} // try-catch 끝
					} // while end
//						} // if end
//					else {
//						System.out.println("올바른 비밀번호가 아닙니다.");
//					}
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

