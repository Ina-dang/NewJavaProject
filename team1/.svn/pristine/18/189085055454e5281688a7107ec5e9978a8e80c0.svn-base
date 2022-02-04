package Service;

import Domain.Cart;
import Domain.Order;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

public class OrderService {
	ProductService productService = new ProductService(); //경보프로덕트서비스 생성
//  Product ==1:1관계==> Cart
//	Cart ==다:1(카트여러개가 오더하나)==> Order
//	Order ==얘도 다대일==> Table 로 이동

	//주문번호랑 주문시간
	int no = 1;
	long time = System.currentTimeMillis();
	//주문내역
	Order order = new Order(no, time);
	
	Cart cart = new Cart();
	//담은상품번호 상품코드 수량
	int cartNo = 2;
	int productNo = 102; //부대찌개 코드
	int amount = 3; //3개
	
	Cart cart2 = new Cart(cartNo, productNo, amount);

	public void cart() {//카트에 들어갈거 
		int a;
		String b = nextLine(" 원하는 상품을 입력하세요 >> ");
		a = nextInt(" 원하는 상품의 수량을 입력하세요 >> ");
		
		//현재 담긴 장바구니 상품 출력
		
	}
	
	public void order() { //오더에 뽑혀야할거
		//여태까지 주문했던 내역 
		//주문번호, 시간, cart 리스트 들어가
	}
}
