package Service;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import java.util.ArrayList;
import java.util.List;

import Domain.Product;;



public class ProductService { //메뉴추가수정 여기서 기능
	private List<Product> products = new ArrayList<Product>();
	//모든 변수는 private 
	
	public ProductService() {
		products.add(new Product(101, "김치찌개", 13000));
		products.add(new Product(102, "부대찌개", 14000));
		products.add(new Product(103, "어묵탕", 12000));
		products.add(new Product(104, "해물탕", 17000));
		products.add(new Product(105, "번데기탕", 8000));
		products.add(new Product(201, "오돌뼈", 13000));
		products.add(new Product(202, "닭똥집", 12000));
		products.add(new Product(203, "찜닭", 13000));
		products.add(new Product(204, "매운찜닭", 14000));
		products.add(new Product(205, "계란말이", 12000));
		products.add(new Product(206, "스팸계란", 11000));
		products.add(new Product(301, "감자튀김", 12000));
		products.add(new Product(302, "후라이드치킨", 14000));
		products.add(new Product(303, "양념치킨", 15000));
		products.add(new Product(304, "수제소세지", 12000));
		products.add(new Product(305, "콘치즈", 11000));
		products.add(new Product(401, "참이슬", 4000));
		products.add(new Product(402, "진로", 4000));
		products.add(new Product(403, "좋은데이", 4000));
		products.add(new Product(404, "대선", 4000));
		products.add(new Product(405, "카스", 4000));
		products.add(new Product(406, "하이트", 4000));
		products.add(new Product(407, "테라", 4000));
		products.add(new Product(501, "콜라", 2000));
		products.add(new Product(502, "사이다", 2000));
		products.add(new Product(503, "환타", 2000));
		products.add(new Product(601, "날치주먹밥", 3000));
		products.add(new Product(602, "볶음밥", 2000));
		products.add(new Product(603, "치킨무", 0));
	}
//, getCount()지우고 기본수량 20개로 만들었음
	
	public List<Product> getProducts() {
		return products;
	} //getter 생성
	
	void userProductsList() {
		System.out.println();
		for (Product userMenus : products) {
			System.out.println(userMenus);
		}
	}

	void productsList() { // 메뉴 조회 메서드
		System.out.println("***************************");
		System.out.println("**                       **");
		System.out.println("**    [휴밤 메뉴판 입니다.]   **");
		System.out.println("**                       **");
		System.out.println("***************************");
		System.out.println();
		
		for (Product menus : products) {
			System.out.println(menus.getName() + menus.getPrice() + "원");
			
		}
	}
	void productRegister() { // 등록 메서드
		
		products.add(new Product(nextInt("등록하실 상품코드를 입력하세요 >>"),nextLine("등록하신 코드의 상품명을 입력하세요 >>"),nextInt("등록한 상품의 가격을 쓰세요 >>"),nextInt("등록하실 상품 제고를 적어주세요")));
	}
	
	void productModify() { // 수정 메서드
		Product product = findBy(nextInt("수정하실 상품코드를 입력하세요 >>"));
		if(product == null) {
			System.out.println("엥?? 없는 상품이에요!");
			return;
		}
		product.setCode(nextInt("상품코드 >"));
		product.setName(nextLine("상품명 >"));
		product.setPrice(nextInt("상품 가격 >"));
		product.setStock(nextInt("상품 제고 >"));
	}
	
	void productRemove() { // 삭제 메서드
		products.remove(findBy(nextInt("삭제하실 상품의 코드를 적어주세요 >>")));
	}
	
	
	
	
	public Product findBy(int code) {
		Product product = null;
		for( Product p : products ) { //배열 사이즈만큼만 순회
			if(p.getCode() == code) { //p.getCode랑 code같으면 출력
				product = p;
			}
		}
		return product;
	}
	


	public static void main(String[] args) { // 중간 확인용
		ProductService productService = new ProductService();
		
//			productService.productsList();
//			productService.productRegister();
//			productService.productModify();
//			productService.productRemove();
//		
		
			
		int pro = nextInt("test ex = 1,2,3,4");
		switch (pro) {
		case 1:
			
			productService.productsList();
		case 2:
			productService.productRegister();
			
		case 3:
			productService.productModify();
			
		case 4:
			productService.productRemove();
			
			
		default:
			break;
		
		}
	} //잘해놨어!! 대빵님 칭찬하심 ㅎ_ㅎ 
}
