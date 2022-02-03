package Domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Order { //OrderService 
	/*
	 * Cart 배열이 들어가야함
	 * 
	 * 분리해서 해보자아
	 * ㅎ_ㅎ
	 * 
	 * 
	 */
	
	int no; //주문번호 한 번에 카트 하나가일 확률 적음 주문 여러번 발생하니까
	//그러면 이때 들어갈 타입 = 인트배열
	long time; // 주문시간
	
	List <Cart> carts = new ArrayList<Cart>(); //주문한번에 몇개가 들어갈지 모름 그때그때 다름 (Integer 에서 Cart로 바꿨음)

	@Override
	public String toString() {
		return "주문내역 >> [주문번호=" + no + ", 주문시간=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time) + ", 장바구니=" + carts + "]";
	}
}