package Service;



import Domain.Table;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import java.util.ArrayList;
import java.util.List;

public class TableService {
	   
	   private List<Table> tables = new ArrayList<Table>();
	   
	   private Table table = new Table();
	   
	   // 테이블에 반영하기
	   public void table(int index, OrderService orderService) {
	      tables.set(index, new Table(orderService.getOrders()));
	   }
	   
	   // 테이블 현황
	   public void tableStatus(int index) { // 몇번째 테이블인지
	      // 뭐뭐 출력할지 생각해야함둥
	      System.out.println("\n" + index + "번째 테이블입니다.");
	      table.getOrders().toString();
	   }
	   
	   // 테이블 결제(카드 or 현금 or 카드 + 현금 or 더치페이)
	   public void tablePay(int index) { // 몇번째 테이블인지
	      tables.get(index);
	      // 쭈루루룩
	      // history에 저장
	      tableInit(index);
	   }
	   
	   // 테이블 이동
	   public void tableMove(int startIndex, int endIndex) {
	      tables.set(endIndex, tables.get(startIndex));
	      tables.set(startIndex, null);
	   }
	 
	   // 테이블 전체 초기화
	   public void tableInitAll() {
	      for(int i = 0; i < 6; i++) {
	         tables.add(null);         
	      }
	   }
	   
	   // 테이블 하나만 초기화
	   public void tableInit(int index) { // 몇번째 테이블인지
	      tables.set(index, null);
	   }
	}