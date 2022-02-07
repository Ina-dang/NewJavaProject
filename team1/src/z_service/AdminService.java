package z_service;

import static util.ScannerUtil.nextInt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Domain.Order;
import Domain.kioskTest;
import Service.OrderService;



public class AdminService {
//	ProductService productService = new ProductService();
	kioskTest kioskTest = new kioskTest();
	
	// super_admin과 관련된 로그인은 따로 메서드 선언이 좋을 것 같아요 >_0
	private static int super_admin_password = 2222;
	
	
	//날짜 넣으려고 잠시 만들어뒀습니다
	long now = System.currentTimeMillis();
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	
	//테이블관리,
	
	
	// 2. 영업 관리 =======> 나현
	public void sales_management() {
		int select = nextInt("1. 마감 정산 2. 준비금 등록(일단 보류) 3. 뒤로가기 >> ");
		
		boolean sales = true;
		
		switch(select) {
			case 1:
				// 마감 정산
				//테이블 배열 총합해야됨
//				System.out.printf("%s일 카드결제 %d원, 현금결제 %d원. 총 %d원 입니다.", 
//						format2.format(now), table1, table2, sum);
				break;
			case 2:
				// 준비금 등록
				System.out.println("준비금등록. 갯수 입력"); //일단 보류하기로
				break;
				
			case 3:
				// 뒤로가기
				sales = false;
				break;
				
				
		}//영업관리 스위치
	}//영업관리 끝
	
	// 3. 매출 현황 =========> 나현
	public void sales_currentState()  { //테이블이 비워져도 누적으로 계속 남아있어야한다
		//일단은 입력만 계속받고 조회되도록 == 학생 조회기능 구현이랑 닮도록 출력
//		super_login(); // 로그인
		DecimalFormat decimal = new DecimalFormat("###,###,###");
		int i = nextInt("1. 전일 매출 \t 2. 현 매출 \t 3. 뒤로가기");
		
		try {
		
		boolean sales1 = true;
		
		switch (i){
		case 1: 
			int price1 = 308426812; 
			Calendar cal = Calendar.getInstance();
			String format = "yyyy-MM-DD";
			SimpleDateFormat yd = new SimpleDateFormat(format);
			cal.add(cal.DATE, -1);
			String yesterday = yd.format(cal.getTime());
			System.out.println(yesterday + "일 총 매출은 " + decimal.format(price1) + "원 입니다." );
			break;
			
			//전날 매출 어케 저장해두지?

			
		case 2:
			//현 매출 --> 지금까지 매출 누적 끌어오기
			
			//1. 테이블에서 총 합산가격 끌어오기
			//2. cart sum 가져오기
//			System.out.println( 테이블리스트인덱스  + "번 테이블" + format1.format(now) + "시 까지 총 매출은 " + decimal.format(price) + "원 입니다.");
			System.out.println(format1.format(now) + "시 까지 총 매출은 " + "" + "원 입니다.");
			break;
			
		case 3: 
			sales1 = false;
			break;
			}//매출 현황 switch
		}//try
		catch (Exception e) {
			System.out.println("매출이 없습니다");
		}//catch
	}//매출현황 void 끝
	
//	public Order findBy(int i) { //orders에 들어간 값가져오기
//		Order order = null;
//		for( Order p : OrderService.orders ) { //배열 사이즈만큼만 순회
//			if(p. == ) { 
//				order = p;
//			}
//		}
//		return order;
//	}
	
}//class끝