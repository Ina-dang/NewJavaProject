package service;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class UserService {
	static Scanner sc = new Scanner(System.in);
	Product product = new Product();
	public void menuChoice(){ 
		//메뉴관리 ==> 경보가들어올거
		System.out.println("메뉴 창입니다 >_0");
		System.out.println("1.시그니처 2.안주 3.주류");
	}

	public void cart(){
		//장바구니 ==> 승종이가들어올거
		System.out.println("장바구니 창입니다 >_0");
		System.out.println("주문내역출력");
	}

	public void cartHistory(){
		//주문확인 
		for (boolean b = true; b;) { 
			System.out.println("1.주문내역확인 2.더치페이 3.처음으로");
			String input = sc.nextLine();
			int num = Integer.parseInt(input);

			switch (num) {
			case 1:	
	//			ArrayList<String> ready = new ArrayList<String>();  
				//어레이리스트를 넣은 장바구니 어레이를 인덱스별로 골라서 출력하면 될 것 같은데..
				//그 골라서 출력은 어케하지
				//일단은 시간이랑 메뉴 뜨는것만 보이게 해봤다..
				String[] table1 = {"오징어", "진로", "맥주500cc"};
				String[] table1_1 = {"오징어", "진로", "맥주500cc"};
				String[] table1_2 = {"오징어", "진로", "맥주500cc"}; //2차원 배열로 table1의 인덱스 안에 주문시간대별로 각각의 인덱스 넣어야할까요
				System.out.println("주문내역확인");
				System.out.printf("%s %s %n", new Date(), Arrays.toString(table1)); 
				System.out.printf("%s %s %n", new Date(), Arrays.toString(table1_1)); 
				System.out.printf("%s %s %n", new Date(), Arrays.toString(table1_2)); //넣을때마다 시간 다르게 어케 설정되려나? 
	
				//현재시간 + 상품명 + 가격 + sum 을 만들어야하는데...
				//시간 + cart 넣
				
				break;
				
			case 2:	
				System.out.print("더치페이 할 금액을 입력해주세요 >> ");
				String input1 = sc.nextLine();
				int num1 = Integer.parseInt(input1);
				
				System.out.print("더치페이 할 인원수를 입력해주세요 >> ");
				String input2 = sc.nextLine();
				int num2 = Integer.parseInt(input2);
				
				System.out.println(num1 / num2);
				// 주문확인의 총 금액 / 설정수
				break;
				
			case 3:	
				System.out.println("처음으로");
				b = false;
				break; //외않끗나..ㅠㅠ
	
			default: 
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}

	public void customers(){
		//종업원 호출 ==> 미숙님 들어올거
		System.out.println("종업원 호출 창입니다 >_0");
		System.out.println("1.물 2. 얼음 등등");
	}
}





class Product {
	String no;
	String name;
	int price;
	
	public Product(){
		
	}
	
	public Product(String no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public Product(String name, int price) {

		this.name = name;
		this.price = price;
	}
	
	public int sum() {
		return price + price; //상품 별 가격을 더해야하는데
	}
	
	public String toString() { //주문내역확인용
		String str = new Date() + "     " + name +  "     " + price;
		return str;
	}
	//한 카트에 들어갈거 ==> 주문시간 + 담은 메뉴들(코드+수량)
	Date date = new Date();
	
}

