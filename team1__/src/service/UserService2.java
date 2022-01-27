package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UserService2 {
	static Scanner sc = new Scanner(System.in);

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
		System.out.println("1.주문내역확인 2.더치페이 3.처음으로");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		switch (num) {
		case 1:	
			System.out.println("주문내역확인");
			ArrayList<String> ready = new ArrayList<String>();
//			System.out.println(new Date()); //현재시간
			//시간 + cart 넣
			
			break;
		case 2:	
			System.out.println("더치페이");
			break;
		case 3:	
			System.out.println("처음으로");
			break;

		default: 
			System.out.println("잘못된 입력입니다");
			break;
		}

	}

	public void customers(){
		//종업원 호출 ==> 미숙님 들어올거
		System.out.println("종업원 호출 창입니다 >_0");
		System.out.println("1.물 2. 얼음 등등");
	}
}

class product {
	String no;
	String name;
	int price;
	
	public product(){
		
	}
	
	public product(String no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	//한 카트에 들어갈거 ==> 주문시간 + 담은 메뉴들(코드+수량)
	Date date = new Date();
	
}

