//package z_service;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Scanner;
//
//import Domain.Cart;
//
//public class UserService {
//	static Scanner sc = new Scanner(System.in); //스캐너 유틸
//	Product product = new Product(); // 프로덕트 인스턴스
//	private void user_main() {} //유저메인 생성자
//	Cart cart = new Cart();
//	
//	//메뉴관리 ==> 경BOSS들어올거
//	public void menuChoice(){ 
//		System.out.println("메뉴 창입니다 >_0");
//		System.out.println("1.시그니처 2.안주 3.주류");
//	}
//
//	
//	//장바구니 ==> 승종쓰들어올거
//	public void cart(){
//		System.out.println("장바구니 창입니다 >_0");
//		System.out.println("주문내역출력");
//	}
//
//	
//	//주문확인 ==> 나현쓰들어올거 
//	public void cartHistory(){
//		for (boolean b = true; b;) { 
//			System.out.println("1.주문내역확인 2.더치페이 3.처음으로");
//			String input = sc.nextLine();
//			int num = Integer.parseInt(input);
//
//			switch (num) {
//			case 1:	
//	//			ArrayList<String> ready = new ArrayList<String>();  
//				//어레이리스트를 넣은 장바구니 어레이를 인덱스별로 골라서 출력하면 될 것 같은데..
//				//findBy 인덱스 데려올 수 있나?
//				//그 골라서 출력은 어케하지
//				//일단은 시간이랑 메뉴 뜨는것만 보이게 해봤다.. (domain에서 나중에 끌어올거 + 시간은 내가 추가하겠지????)
//				
//				//1. ArrayList
//				ArrayList<String> list = new ArrayList<String>();
//				list.add("오징어, 진로, 맥주500cc");
//				list.add("진로");
//				list.add("어묵탕, 진로, 맥주500cc");
//				
//				for (int i = 0; i < 6; i++) {
//					System.out.printf("%s %s", new Date(), list.get(i));
//				}
//				// 문제 ==> list로 뽑으면 add 전체가 합쳐져서 나올것이고..? get(0)로 하면 for문에 넣어야하나?
//				
//				break;
//				
//			//더치페이
//			case 2:	
//				//이거 금액 입력안하고 "n번테이블의 현재 주문금액은 n원입니다"하고 
//				//더치페이 할 인원수를 입력해주세요 로 이어지도록 하고싶다
//				
//				System.out.printf("%s번 테이블의 현재 주문금액은 %s원입니다", cart, cart.sum());
//				
//				System.out.print("더치페이 할 인원수를 입력해주세요 >> ");
//				String input2 = sc.nextLine();
//				float num2 = Integer.parseInt(input2);
//				
//				System.out.println("총 금액은" + (int)((cart.sum() / num2) * 100 + 0.5) / 100f + "입니다.");
//				// 주문확인의 총 금액 / 설정수
//				
//				break;
//				
//			case 3:	
//				b = false;
//				break; //처음으로 어떻게 돌려놓지
//	
//			default: 
//				System.out.println("잘못된 입력입니다");
//				break;
//			}
//		}
//	}
//}
//
//
///////////////////////////////////////////////////////////////////////
//
////임시 변수 클래스
//class Product { //MenuItem
//	String no;
//	String name;
//	int price;
//	
//	public Product(){
//		
//	}
//	
//	public Product(String no, String name, int price) {
//		super();
//		this.no = no;
//		this.name = name;
//		this.price = price;
//	}
//	public Product(String name, int price) {
//
//		this.name = name;
//		this.price = price;
//	}
//	
//	public int sum() {
//		return price + price; //상품 별 가격을 더해야하는데..
//	}
//	
//	public String toString() { //주문내역확인용 
//		String str = new Date() + "     " + name +  "     " + price;
//		return str;
//	}
//	
//	//한 카트에 들어갈거 ==> 주문시간 + 담은 메뉴들(코드+수량)
//	Date date = new Date();
//	
//	
//}
//
///*
// * 
// * 	public Product findBy(int code) {
//		//이거있으면 포문 한번 덜한대~
//		Product product = null;
//		for( Product p : products ) { //배열 사이즈만큼만 순회
//			if(p.getCode()== code) { //s.getNo랑 no같으면 student출력
//				product = p;
//			}
//		}
//		return product;
//	}
// */
//
