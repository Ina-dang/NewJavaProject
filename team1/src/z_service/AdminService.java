package z_service;

import static util.ScannerUtil.nextInt;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Domain.Table;



public class AdminService {

//	static Scanner sc = new Scanner(System.in);
//	Table tables = Table.getInstance();

	
	// super_admin과 관련된 로그인은 따로 메서드 선언이 좋을 것 같아요 >_0
	private static int super_admin_password = 2222;
	
	//날짜 넣으려고 잠시 만들어뒀습니다
	long now = System.currentTimeMillis();
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	
	//테이블관리,
	
	
	// 2. 영업 관리 =======> 나현
	public void sales_management() {
//		System.out.print("1. 마감 정산 2. 준비금 등록(일단 보류) 3. 뒤로가기 ");
//		System.out.print(" >> ");
		int select = nextInt("1. 마감 정산 2. 준비금 등록(일단 보류) 3. 뒤로가기 >> ");
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
		}
	}
	
	// 3. 매출 현황 =========> 나현
	public void sales_currentState() throws InterruptedException { //테이블이 비워져도 누적으로 계속 남아있어야한다
		//일단은 입력만 계속받고 조회되도록 == 학생 조회기능 구현이랑 닮도록 출력
//		super_login(); // 로그인
//		System.out.println("1. 전일 매출 \t 2. 현 매출 \t 3. 종료");
		DecimalFormat decimal = new DecimalFormat("###,###,###");
		int i = nextInt("1. 전일 매출 \t 2. 현 매출 \t 3. 종료");
		switch (i){
		case 1: //답답허다 답답해..
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
			
			//총 매출 --> 테이블 누적 끌어오기
//			Table.getInstance();
			Thread.sleep(3000); //throw해뒀음
			int price = 30000; //테이블 리스트에서 총 합산가격 끌어오기


			
			
			 //테이블 리스트에서 총 합산가격 끌어오기
//			System.out.println( 테이블리스트인덱스  + "번 테이블" + format1.format(now) + "시 까지 총 매출은 " + decimal.format(price) + "원 입니다.");
			System.out.println(format1.format(now) + "시 까지 총 매출은 " + decimal.format(price) + "원 입니다.");
			
			break;
			
		case 3: 
			break;

		default: System.out.println("올바른 번호를 입력하세요");
			break;
			
		}
	}
	
//	private Table findBy(int no) {
//		Table tableNum = null; 
//		for( Table tb1 : Table.getInstance() ) { //배열 사이즈만큼만 순회
//			if(tb1.getNo() == no) { //s.getNo랑 no같으면 출력
//				tableNum = tb1;
//			}
//		}
//		return tableNum;
//	}
}

//
////임시로 사용중인 클래스
//class Tables {
//	String[] tables = new String[7];
//	
//	String tb2 = tables[2];
//	
//	String no;
//	String name;
//	int price;
//	
//	public Tables() {}
//	
//	
//	public Tables(String no, String name, int price) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.price = price;
//	}
//
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return tables[1];
//	}
//}
//	
//	
