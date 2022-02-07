package Service;

import static util.ScannerUtil.nextInt;

import java.util.ArrayList;
import java.util.List;

import Domain.Cart;
import Domain.Order;

public class OrderService {
//	ProductService productService = new ProductService(); //경보프로덕트서비스 생성
	
//  Product ==1:1관계==> Cart
//	Cart ==다:1(카트여러개가 오더하나)==> Order
//	Order ==얘도 다대일==> Table 로 이동

	//주문번호랑 주문시간
	//주문내역
	
//	Cart cart = new Cart();
//	//담은상품번호 상품코드 수량
//	int cartNo = 2;
//	int productNo = 102; //부대찌개 코드
//	int amount = 3; //3개
//	
//	Cart cart2 = new Cart(cartNo, productNo, amount);
//	///////////////////////////////////////////////////////////////////

	List<Order> orders = new ArrayList<Order>();
	List<Cart> carts = new ArrayList<Cart>(); // 이걸 쓰면 안되고 Order안에 carts를 써야함
	
	
	public void cart() {//장바구니에 상품담기											
		carts.add(new Cart(nextInt("장바구니 번호 >> "), nextInt("상품 번호 >> "), nextInt("상품 수량>> ")));
		System.out.println(carts);
	}
	
	
	public void remove() {//장바구니 삭제하기
		System.out.println(carts);
		carts.remove(findBy(nextInt("삭제할 장바구니 상품 순서 >> ")));
		System.out.println("삭제되었습니다.");
	}
	
	public void display() { 
		for(Order o : orders) {
			System.out.println(o);
		}
	}
	
	public void cartHistory() { //오더에 뽑혀야할거
		//여태까지 주문했던 내역 
		int no = 1;
		long time = System.currentTimeMillis();
		orders.add(new Order(no, time, carts)); 
//		System.out.println(orders);
		display();
	}
	
	
	public void orderHistory(int index) { 
//		System.out.println(Table.getInstance().getTables().get(index).toString());
	}
	
	//↑↑↑↑↑↑↑↑↑↑↑↑↑ 승종이 Table getInstance() 주석 ↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	public void cartToOrder(int index) {
//		Table.getInstance().getTables().get(index).add(new Order()); // domain 오더에 있는 carts에 여기 있는 cart를 넣어야하는데..?
		orders.clear(); // 초기화
		System.out.println("주문완료했습니다.");
	} // 만약 각각 다른 orders 넣는다면 3차원 배열이 됩니다....

	
	private Cart findBy(int no) { //remove findBy
		Cart carts1 = null;
		for (Cart c : carts) {
			if(c.getNo() == no) {
				carts1 = c;
			}
		}
		return carts1;
	}
}