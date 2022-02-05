package Service;



import Domain.Table;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

public class TableService {
	
	// 테이블 현황
	public void tableStatus(int index) { // 몇번째 테이블인지
		// 뭐뭐 출력할지 생각해야함둥
		System.out.println(Table.getInstance().getTables().get(index).toString()); // Orders
		
		
	}
	
	// 테이블 주문 취소
	public void orderRemove(int index) { // 몇번째 테이블인지
		
	}
	
	// 테이블 결제(카드 or 현금)
	public void tablePay(int index) { // 몇번째 테이블인지
		
	}
	
	
	// 테이블 이동
	public void tableMove(int startIndex, int endIndex) {
		
	}
	
	// 테이블 전체 초기화
	public void tableInitAll() {
		for(int i = 0; i < 6; i++) {
			Table.getInstance().getTables().add(null);
		}
	}
	
	// 테이블 하나만 초기화
	public void tableInit(int index) { // 몇번째 테이블인지
		Table.getInstance().getTables().remove(index); // 그 자리 삭제
		Table.getInstance().getTables().add(index, null); // 그 자리에 추가
	}
	
}
