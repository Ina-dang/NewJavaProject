package Service;

import static util.ScannerUtil.nextInt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Domain.Cart;
import Domain.Order;

public class SalesService {
	
	private static SalesService salesService = new SalesService();
	private SalesService() {};
	public static SalesService getInstance() {
		return salesService;
	}
	
	
	

	//날짜 넣으려고 잠시 만들어뒀습니다
	private long now = System.currentTimeMillis();
	public final static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	public final static SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	public final static DecimalFormat decimal = new DecimalFormat("###,###,###");
	
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
	public void sales_currentState(String yesterday, int price1)  { //테이블이 비워져도 누적으로 계속 남아있어야한다
		
			
		boolean sales1 = true;
		while (sales1) {
			int i = nextInt("1. 전일 매출 \t 2. 현 매출 \t 3. 뒤로가기");
			try {
			switch (i){
			case 1: 
																//orders에 미리 전날 데이터를 넣어두면 된다.
				System.out.println(yesterday + "일 총 매출은 " + decimal.format(price1) + "원 입니다." );
				break;
				
			case 2:
				//현 매출 --> 지금까지 매출 누적 끌어오기
				System.out.println(SalesService.format1.format(salesService.now) + "시 까지 총 매출은 " + SalesService.decimal.format(OrderService.getInstatnce().getOrders().stream().mapToInt(Order::sum).sum()) + "원 입니다.");
				break;
			
			case 3: 
				System.out.println("이전 화면으로 돌아갑니다.");
				sales1 = false;
				break;

			default :
				System.out.println("올바른 번호를 입력해주세요.");
				break;
				}//매출 현황 switch
			}//try 끝
			catch (Exception e) {
				System.out.println("매출이 없습니다");
			}//catch
		}//while문 끝
	}//매출현황 void 끝
	
//	public SalesService findBy(int no) {
//		//무엇을 찾아야 하는지 생각.. 
		//필요한가...? 전체 가격 가져오면되는데.....
//	}
	
	public static void main(String[] args) {
		
	   Order order = new Order();
	   
	   //담은상품번호 상품코드 수량
	   Cart cart = new Cart(1, 101, 1);
	   
	   order.carts.add(cart);
	   
	   System.out.println(order.carts);
	   
	   OrderService.getInstatnce().getOrders().add(order);
	   
	   System.out.println(OrderService.getInstatnce().getOrders());
	   
	   SalesService.getInstance();
	//진짜 orders누적되면 좋겠당!s
		
	   Calendar cal = Calendar.getInstance();
	   cal.add(Calendar.DATE, -1);
	   String yesterday = format2.format(cal.getTime());
	   SalesService.getInstance().sales_currentState(yesterday, 100000);
		
	}
	
	public static SimpleDateFormat getFormat1() {
		return format1;
	}

	public static SimpleDateFormat getFormat2() {
		return format2;
	}
}//class 끝
