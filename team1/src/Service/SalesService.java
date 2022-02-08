package Service;

import static util.ScannerUtil.nextInt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Domain.Order;
import Domain.kioskTest;

public class SalesService {
	kioskTest kioskTest = new kioskTest();
	

	//날짜 넣으려고 잠시 만들어뒀습니다
	private static long now = System.currentTimeMillis();
	private static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	private static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	
	//테이블관리,
	
	
	// 2. 영업 관리 =======> 나현
	public static void sales_management() {
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
	public static void sales_currentState()  { //테이블이 비워져도 누적으로 계속 남아있어야한다
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
//			System.out.println( 테이블리스트인덱스  + "번 테이블" + format1.format(now) + "시 까지 총 매출은 " + decimal.format(price) + "원 입니다."); //하고싶은거
			System.out.println(format1.format(now) + "시 까지 총 매출은 " + Order.carts + "원 입니다.");
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
	
	public static void main(String[] args) {
		SalesService salesService = new SalesService();
		OrderService orderService = new OrderService();
		System.out.println(salesService.format1.format(salesService.now) + "시 까지 총 매출은 " + "" + "원 입니다.");
		
		//외 않들어가?
		System.out.println(orderService.getOrders().size());
		
	}
}//class 끝
