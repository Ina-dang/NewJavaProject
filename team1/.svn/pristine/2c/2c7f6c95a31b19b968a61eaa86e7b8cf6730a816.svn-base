package Domain;

public class Cart { //카트말고 order가 더 맞음 
/*
 * 1회 주문에 들어갈 내용들 저장
 * ==> 어느 상품을 몇 개를 언제 어느테이블에서 까지
 * 
 * 테이블에서 카트를 관리할 수도 있고
 * 카트에서 테이블을 관리할것인가
 * 
 * 클래스 설계 
 * 주문이 다채로운 관점이라 어렵슴당
 * 
 * 단위를 뭐로 만들지 기준선 중요쓰
 * 
 * 쌤 추천 : 메뉴 product(상품) 을 한번에 주문했을때 cart ==> cart 가 모여서 table 들어가는데
 * 이걸 도메인화시켜야함
 * 
 * 
 * product ====> order =====> table 이 관계
 */
	int no; //주문번호 카트번호
	int productNo; //상품번호
	int amount; //카트에 들어갈 상품의 수량 (재고랑 다름)
	
//	long time; //주문시점 
	//한 상품에 대해 여러번 발생할 수 있는 것들
	
	@Override
	public String toString() {
		return "Cart [no=" + no + ", productNo=" + productNo + ", amount=" + amount + "]";
	} 
	
	//sum은 여기서도 각각 합해줘야하고 cart sum 이랑 order sum 다름쓰 두개 필요

	
	
	
}
