package Service;

import static util.ScannerUtil.nextInt;

import java.util.ArrayList;
import java.util.List;

import Domain.Cart;
import Domain.Order;

public class OrderService {
	
//  Product ==1:1관계==> Cart
//	Cart ==다:1(카트여러개가 오더하나)==> Order
//	Order ==얘도 다대일==> Table 로 이동

	static List<Order> orders = new ArrayList<Order>();
//	static List<Cart> carts = new ArrayList<Cart>(); // 이걸 쓰면 안되고 Order안에 carts를 써야함 ==> 됐당!

	
	public static void cart() {//장바구니에 상품담기											
		Order.carts.add(new Cart(nextInt("장바구니 번호 >> "), nextInt("상품 번호 >> "), nextInt("상품 수량>> ")));
		System.out.println(Order.carts);
	}
	
	
	public static void remove() {//장바구니 삭제하기
		System.out.println(Order.carts);
		Order.carts.remove(findBy(nextInt("삭제할 장바구니 상품 순서 >> ")));
		System.out.println("삭제되었습니다.");
	}
	
	public static void display() { 
		for(Order o : orders) {
			System.out.println(o);
		}
	}
	
	public void cartHistory() { //오더에 뽑혀야할거
		//여태까지 주문했던 내역 
		int no = 1;
		long time = System.currentTimeMillis();
		orders.add(new Order(no, time, Order.carts)); 
//		System.out.println(orders);
		display();
	}
	
	
	public static void orderHistory(int index) { 
//		System.out.println(Table.getInstance().getTables().get(index).toString());
	}
	
	//↑↑↑↑↑↑↑↑↑↑↑↑↑ 승종이 Table getInstance() 주석 ↓↓↓↓↓↓↓↓↓↓↓↓↓
	
	public static void cartToOrder(int index) {
//		Table.getInstance().getTables().get(index).add(new Order()); // domain 오더에 있는 carts에 여기 있는 cart를 넣어야하는데..?
		orders.clear(); // 초기화
		System.out.println("주문완료했습니다.");
	} // 만약 각각 다른 orders 넣는다면 3차원 배열이 됩니다....

	
	private static Cart findBy(int no) { //remove findBy
		Cart carts1 = null;
		for (Cart c : Order.carts) {
			if(c.getCartNo() == no) {
				carts1 = c;
			}
		}
		return carts1;
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Order order = new Order();
		Cart cart = new Cart();
		//담은상품번호 상품코드 수량
		int cartNo = 1;
		int productNo = 101; //상품 코드
		int amount = 1; //상품 수량

		cart.setNo(cartNo);
		cart.setProductNo(productNo);
		cart.setAmount(amount);
		//Order클래스 내에있는 carts 인덱스0에 추가
		Order.carts.add(cart);
		//cartNo1 출력
		System.out.println(cart);
		
		Cart cart2 = new Cart();
		int cartNo2 = 2;
		int productNo2 = 401; 
		int amount2 = 3; 
		
		cart.setNo(cartNo2);
		cart.setProductNo(productNo2);
		cart.setAmount(amount2);
		//carts 인덱스1에 추가됐다고 생각했는데
		Order.carts.add(cart2);
		//cart2 내용그대로 출력되긴 하는데
		System.out.println(cart2);
		//size도 두개라고 뜨는데..
		System.out.println("오더클래스 내 카트리스트 사이즈 >> " + Order.carts.size());
		//println하면 상품순서1이 안뜨고 상품순서2로 덮어씌워져서 상품순서2 두개가 출력된다.. ㅠㅠ
		System.out.println("오더클래스 내 카트리스트에 들어있는거 >> " + Order.carts);
		

		orders.add(new Order(1, System.currentTimeMillis(), Order.carts));
		
		//시간딜레이
		Thread.sleep(3000);

		System.out.println();
		System.out.println("=====세번째 카트 담기 시작=====");
		
		//세번째 카트 담기
		Cart cart3 = new Cart();
		//담은상품번호 상품코드 수량
		int cartNo3 = 3;
		int productNo3 = 402; 
		int amount3 = 7; 
		
		cart.setNo(cartNo3);
		cart.setProductNo(productNo3);
		cart.setAmount(amount3);
		//carts 인덱스2에 추가됐다고 생각하는데..
		Order.carts.add(cart3);
				
		orders.add(new Order(2, System.currentTimeMillis(), Order.carts));
		//왜 orders를 뽑으면.. 주문번호 1,2 사라지고 3만 뜨는거야...? 
		System.out.println(orders);
		
		System.out.println();
		System.out.println("=====카트랑 오더 리스트 사이즈=====");
		System.out.println("오더클래스 내 카트리스트 사이즈 >> " + Order.carts.size());
		System.out.println("오더서비스 내 오더리스트 사이즈 >> " + orders.size());
		
		//orders진짜 이상하게 들어가네... 게다가 어찌됐건
		//여기에선 orders에 들어가는데..흑흑 왜 SalesService에는 안들어가지..^^.. 
	}

}
