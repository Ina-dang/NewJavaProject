package Domain;

import java.util.ArrayList;
import java.util.List;

import Service.ProductService;
//O
public class kioskTest {
	public static void main(String[] args) throws InterruptedException {
		ProductService productService = new ProductService(); //경보 서비스생성
		
		Order order = new Order();
		//얘네도 모여서 정산금액 들어갈거 다대일
		int no = 1;
		long time = System.currentTimeMillis();
		
		order.setNo(no);
		order.setTime(time); //현재시간
		
		//cart = 메뉴 저장 단위 1:1
		
		Cart cart = new Cart();
		
		int cartNo = 1;
		int productNo = 101; //김치찌개
		int amount = 2; //김치찌개수량
		
		cart.setNo(cartNo); //cart 번호
		cart.setProductNo(productNo); //실제로는 프로덕트에서 만든거 쓰셈 1:1대응
		cart.setAmount(amount); //김치찌개 2개 
		
		//해당 카트 종료시 합계값 구하기 
//		System.out.println(productService.findBy(cart.productNo).getPrice() * cart.amount);
		
		Cart cart2 = new Cart();
		
		int cartNo2 = 2;
		int productNo2 = 102; //부대찌개 코드
		int amount2 = 3; //3개
		
		cart2.setNo(cartNo2);
		cart2.setProductNo(productNo2); 
		cart2.setAmount(amount2);
		
//		System.out.println(productService.findBy(cart2.productNo).getPrice() * cart2.amount);
		
		List<Cart> carts = new ArrayList<Cart>();
		carts.add(cart);
		carts.add(cart2);
		
		order.carts = carts;
		
		// 주문 전체 담겨있는 수량 합계 
		// 향상 for문 공부하셈
		for ( Cart c : order.carts ) {
			//경보서비스에서 findBy로 상품번호에서 가격끌어와서 수량이랑 곱함
//			System.out.println(productService.findBy(c.productNo).getPrice() * c.amount);
			
		}
		
		//한번의 주문 출력
		System.out.println(order); //toString으로 바꾸셈
		//보일때는 상품번호아니고 상품명으로 해야 손님이 확인이되겠지..?
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
		//3초뒤에 출력쓰 currentTimeMillis
		//작업할때 카트 하나하나 상품을 고르면 이만큼 '한번에 주문할겁니까' 물어보고 그 
		//주문하겠다는거 확정되면 그때 주문번호, 주문시간부여(order.no / time)
		
		Thread.sleep(3000);
		
		//2번째 주문 //얘네도 모여서 정산금액 들어갈거 1:多
		order = new Order();
	
		order.setNo(no);
		order.setTime(time); //현재시간
		
		//cart = 메뉴 저장 단위 1:1
		
		cart = new Cart();
		cart.setNo(cartNo); //cart 번호
		cart.setProductNo(productNo); //실제로는 프로덕트에서 만든거 쓰셈 1:1대응
		cart.setAmount(amount); //김치찌개 2개 
		
		cart2 = new Cart();
		cart2.setNo(cartNo2);
		cart2.setProductNo(productNo2); 
		cart2.setAmount(amount2);
		
		carts = new ArrayList<Cart>();
		carts.add(cart);
		carts.add(cart2);
		
		order.carts = carts;
		
		//한번의 주문 출력
		System.out.println(order); //toString으로 바꾸셈
		
		// product ==1:1관계==> cart ==다:1(카트여러개가 오더하나)==> order ==얘도 다대일==> table 로 점점 들어간다고 생각합니다
		// cart 를 order로 넣어서 지금 출력한거고
		// order타입도 order리스트가 필요해서 이것처럼 만들어서 그게 나중에 각 table로 들어갈 거
		
		/*
		 * table 에는 order 주문내역있고
		 * 나갈때 계산서에 있는거 주문내역들 합계하고
		 * 지워버리면
		 * 다른손님 받을 수 있음
		 * 
		 * 금액은 여기서 보이지는 않고
		 * 나중에 합게때 sum으로 나오면됨
		 * 
		 * 상품목록 가져오고 상품목록내 하나 가져오고 상품코드에있는거 합계값 계산해오게 하면 된다고 하셨는ㄷㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎㅎ
		 */
		
	}
}
