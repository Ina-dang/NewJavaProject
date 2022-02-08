package Service;

import Domain.Order;
import Domain.Table;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TableService {
	private static TableService tableService = new TableService();
	private TableService() {}
	public static TableService getInstance() {
		return tableService;
	}

	private List<Table> tables = new ArrayList<Table>(); // 매장 내 모든 테이블
	private Table table; // 현재 선택중인 테이블(현재 로그인 중인 유저)
	{
		for(int i = 0 ; i < 6 ; i++)
			tables.add(new Table(i+1));
//		tables.forEach(System.out::println);
		table = tables.get(0);
	}

	
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	public List<Table> getTables() {
		return tables;
	}
	
	public Table findBy(int tableNo) {
		for(Table t : tables) {
			if(t.getTableNo() == tableNo) return t;
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		TableService service = new TableService();
//		service.displayTables();
		service.displayTables(false);
		
	}
	
	public void displayTables() {
		displayTables(true);
	}
	public void displayTables(boolean b) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < tables.size() ; i+=2) {
			
			sb.append("================  ================   \r\n");
			sb.append(String.format("       %d                 %d \r\n", i+1, i+2));
			sb.append("================  ================   \r\n");
			if(b) {
				sb.append(String.format(" 주문갯수 : %d개   주문갯수 : %d개  \r\n", tables.get(i).getOrders().size(), tables.get(i+1).getOrders().size()));
				sb.append(String.format(" 총액 : %d원       총액 : %d원\r\n", tables.get(i).getOrders().stream().mapToInt(Order::sum).sum(), tables.get(i+1).getOrders().stream().mapToInt(Order::sum).sum()));
			}
			else {
				if(tables.get(i).getOrders().size() == 0) {
					sb.append("    착석 가능      ");
				}
				else {
					sb.append("    착석 불가      ");
				}
				if(tables.get(i+1).getOrders().size() == 0) {
					sb.append("   착석 가능");
				}
				else {
					sb.append("   착석 불가");
				}
				sb.append("\r\n");
				
			}
			sb.append("\r\n");
			sb.append("\r\n");
			sb.append("================  ================   \r\n");
		}
		System.out.println(sb);
	}
	
//	// 테이블에 반영하기
//	public void table(int index, OrderService orderService) {
////		tables.set(index, new Table(orderService.getOrders()));
//	}
//
//	// 테이블 현황
//	public void tableStatus(int index) { // 몇번째 테이블인지
//		// 뭐뭐 출력할지 생각해야함둥
//		System.out.println("\n" + index + "번째 테이블입니다.");
////		table.getOrders().toString();
//	}
//
//	// 테이블 결제(카드 or 현금 or 카드 + 현금 or 더치페이)
//	public void tablePay(int index) { // 몇번째 테이블인지
//		tables.get(index);
//		// 쭈루루룩
//		// history에 저장
//		tableInit(index);
//	}
//
//	// 테이블 이동
//	public void tableMove(int startIndex, int endIndex) {
//		tables.set(endIndex, tables.get(startIndex));
//		tables.set(startIndex, null);
//	}
//
//	// 테이블 전체 초기화
//	public void tableInitAll() {
//		for (int i = 0; i < 6; i++) {
//			tables.add(null);
//		}
//	}
//
//	// 테이블 하나만 초기화
//	public void tableInit(int index) { // 몇번째 테이블인지
//		tables.set(index, null);
//	}
}