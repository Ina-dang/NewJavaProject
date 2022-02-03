package Service;

import java.util.ArrayList;

import Domain.MenuItem;
import Interface.Customer;

public class OrderImpl implements Customer{
	@Override
	public void order(String menuName, int count, int tableIndex) {
		AdminImpl admin = new AdminImpl();
		int tmpIndex = tableIndex;
		admin.addCart(new MenuItem(menuName, count), tmpIndex);
	}

	@Override
	public void historyOrder(int tableIndex) {
		AdminImpl admin = new AdminImpl();
		int tmp_cnt = -1;
		long tmp_now = 0;
		
		ArrayList<MenuItem> tmpArray = admin.getCart(tableIndex);
		
		for(int i = tmpArray.size() - 1; i >= 0; i--) { // 내림차순으로 출력(최신 기록부터)
			if(tmpArray != null) { // 카트에 값 있는지 없는지 확인
				if(tmp_now != tmpArray.get(i).getTime()) {
					if(tmp_cnt < 0) { // 제일 최근 주문 확인하는 방법
						System.out.println("마지막 주문입니다.");
						System.out.println();
					}
					else {
						System.out.println("-------------------------------------------------------------------------------------------");
						System.out.println("이전 주문입니다.");
						System.out.println();
					}
					
					tmp_now = tmpArray.get(i).getTime();
					System.out.println(tmpArray.get(i));
					tmp_cnt++;	// 마지막 주문인지 이전 주문인지 출력 구분
				}
				else {
					System.out.println(tmpArray.get(i));
				}
				
			}
			else {
				System.out.println();
			}
		}
		System.out.println("===========================================================================================");
		System.out.println();
		System.out.println();
	}
}