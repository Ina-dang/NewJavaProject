package Service;

import static util.ScannerUtil.nextInt;

import java.util.ArrayList;
import java.util.List;

import Domain.Cart;
import Domain.Order;

public class OrderService {
	ProductService productService = new ProductService(); //경보프로덕트서비스 생성
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

	
	List<Cart> carts = new ArrayList<Cart>();
	
	public void cart() {//장바구니에 들어갈거 (프로덕트에 있는 code(상품코드), price)
		//대신 상품코드 입력하면 상품명이뜨게 가능한가?
		
		//수량입력 												// 메뉴만뜨게..
		carts.add(new Cart(nextInt("장바구니 번호 >> "), nextInt("상품 번호 >>"), nextInt("상품 수량>>")));
		System.out.println(carts);
	}
	
	
	public void remove() {
		carts.remove(findBy(nextInt("삭제할 장바구니 번호")));
	}
	
	private Cart findBy(int no) { //remove
		Cart carts1 = null;
		for (Cart c : carts) {
			if(c.getNo() == no) {
				carts1 = c;
			}
		}
		return carts1;
	}
	
	
	List<Order> orders = new ArrayList<Order>();
	
	public void order() { //오더에 뽑혀야할거
		//여태까지 주문했던 내역 
		int no = 1;
		long time = System.currentTimeMillis();
		orders.add(new Order(no, time, carts)); 
		System.out.println(orders);
		
		//주문번호, 시간, cart 리스트(담긴상품, 수량, 합산가격) (비둘기 목으로 날아가는 중)
	}
}
