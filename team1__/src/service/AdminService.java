package service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AdminService {
	static Scanner sc = new Scanner(System.in);
	
	// super_admin과 관련된 로그인은 따로 메서드 선언이 좋을 것 같아요 >_0
	private static int super_admin_password = 2222;
	
	long now = System.currentTimeMillis();
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd"); 
	// 1. 테이블 관리
	public void table_service() {
		System.out.println("테이블 관리 창입니다 >_0");
	}
	
	// 2. 영업 관리 =======> 나 
	public void sales_management() {
		System.out.print("1. 마감 정산 2. 준비금 등록 3. 뒤로가기 ");
		System.out.print(" >> ");
		int select = sc.nextInt();
		switch(select) {
			case 1:
				// 마감 정산
				int a = 10;
				int b = 20;
				int sum = a + b ;
				System.out.printf("%s일 카드결제 %d원, 현금결제 %d원. 총 %d원 입니다.", 
						format2.format(now), a, b, sum);
				break;
			case 2:
				// 준비금 등록
				System.out.println("준비금등록. 갯수 입력");

				
				break;
			default:
				break;
		}
	}
	
	// 3. 매출 현황 =========> 나
	public void sales_currentState() { //곧 .txt에 데이터 쌓는거 배움 테이블 지워져도 남을거
		//일단은 입력만 계속받고 조회되도록 == 학생 조회기능 구현이랑 닮도록 출력
		super_login(); // 로그인
		System.out.println("1. 전일 매출 \t 2. 현 매출 \t 3. 종료");
		DecimalFormat decimal = new DecimalFormat("###,###,###");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			int price1 = 308426812; //총 매출 --> 테이블 누적 끌어오기
			Calendar cal = Calendar.getInstance();
			String format = "yyyy-MM-DD";
			SimpleDateFormat yd = new SimpleDateFormat(format);
			cal.add(cal.DATE, -1);
			String yesterday = yd.format(cal.getTime());
			System.out.println(yesterday + "일 총 매출은 " + decimal.format(price1) + "원 입니다." );
			break;
			
		case 2:
			int price = 30000; //테이블 배열 끌어오기

			System.out.println(format1.format(now) + "시 까지 총 매출은 " + decimal.format(price) + "원 입니다.");
			break;
			
		case 3:
			break;

		default: System.out.println("올바른 번호를 입력하세요");
			break;
		}
		
		
	}
		
	// 4. 환경 설정
	public void settings() {
		super_login(); // 로그인
		System.out.println("1. 공지사항 \t 2. 직원관리 \t 3. 매출분석");
	}
	
	// 5. 종료 << 이거는 구지 따로 빼야할까 싶은 생각
	public void ending() {
		System.out.println("시스템 종료");
	}
	
	
	static void super_login() {
		System.out.print("비밀번호를 입력해주세요 > ");
		int tmp_admin_pw = sc.nextInt(); // 초기값 0000
		if(tmp_admin_pw == super_admin_password) {
			System.out.println("super_admin 확인되었습니다.");
		}
		else {
			System.out.println("올바른 비밀번호가 아닙니다.");
		}
	}
}

class Tables {
	String[] tables = new String[7];
	
	String tb2 = tables[2];
	
	String no;
	String name;
	int price;
	
	public Tables() {}
	
	public Tables(String no, String name, int price) {
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tables[1];
	}
}
	
	
