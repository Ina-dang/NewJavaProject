package Interface;

import Domain.MenuItem;

public interface Admin{ // 어드민
	public void tableInit(); // 테이블 초기화(프로그램 실행시 동작)
	public void tableState(int index); // 테이블 주문현황
	public void tableMenuRemove(int index, String menuname); // 테이블 주문취소(손님이 관리자 불러서 가능여부 확인 후 진행)
	public void tablePay(int index); // 테이블 계산
	public void tableMove(int index, int toIndex); // 테이블 이동
	
	public void addCart(MenuItem tmp, int tmpIndex); // 카트에 주문 넣기
}