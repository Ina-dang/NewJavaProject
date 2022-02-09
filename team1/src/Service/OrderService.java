package Service;

import static util.ScannerUtil.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Domain.Cart;
import Domain.Order;

public class OrderService {

//  Product ==1:1관계==> Cart
//   Cart ==다:1(카트여러개가 오더하나)==> Order
//   Order ==얘도 다대일==> Table 로 이동

	private TableService tableService = TableService.getInstance(); 
	private ProductService productService = ProductService.getInstance();
	private List<Order> orders = new ArrayList<Order>();
	
	

	private List<Cart> carts = new ArrayList<Cart>(); // 기능 수행을 위한 임시 저장 공간

	private static OrderService orderService = new OrderService();
	private OrderService() {}
	public static OrderService getInstance() {
		return orderService;
	}
	
	public Order findBy(int orderNo) {
		for (Order o : orders) {
			if (o.getNo() == orderNo)
				return o;
		}
		return null;
	}

	public Cart findCartBy(Order order, int cartNo) { // remove findBy
		Cart tmpCart = null;
		for (Cart c : order.getCarts()) {
			if (c.getCartNo() == cartNo) {
				tmpCart = c;
			}
		}
		return tmpCart;
	}

	public List<Cart> cart() {// 장바구니에 상품담기
		int cartNo = 1;
		productService.productsList();
		while (true) {
			Cart cart = new Cart(cartNo++, nextInt("상품 번호 >> "), nextInt("상품 수량 >> "));
			String input = nextLine("주문 계속하기(z), 주문 취소(x), 주문 확정(c)");
			if (input.equals("z")) carts.add(cart);
			if (input.equals("x")) return new ArrayList<>();
			if (input.equals("c")) {
				carts.add(cart);
				break;				
			}
		}
		return carts;
	}
	
	public void order() {
		List<Cart> tmpList = new ArrayList<Cart>(cart());
		if(tmpList.size() != 0) {
			Order order = new Order(orders.isEmpty() ? 1 : orders.get(orders.size()-1).getNo()+1, System.currentTimeMillis()
					, tmpList);
			
			boolean isStock = true;
						
			for(Cart c : order.getCarts()) {
				if(productService.findBy(c.getProductNo()).getStock() - c.getAmount() < 0 || productService.findBy(c.getProductNo()).getStock() <= 0) {
					isStock = false;	
				}
			}
			
			if(isStock) {
				System.out.println(order.sum() + "원을 주문합니다.");
				
				for(Cart c : order.getCarts()) {
					productService.findBy(c.getProductNo()).setStock(productService.findBy(c.getProductNo()).getStock() - c.getAmount());
				}
				
				orders.add(order);
				tableService.getTable().getOrders().add(order);
				
				carts.clear(); 			
			} else {
				System.out.println("주문 불가능한 상품이 포함되어있습니다.");
			}
		
		}
	}
	
	public void removeOrder() {//주문 삭제하기
		int tableNo = nextInt("취소할 주문의 테이블을 입력하세요 > ") - 1;
		tableService.tableOrderList(tableNo);
		int orderNo = nextInt("취소할 주문의 번호를 입력하세요 > ") - 1;
		Order order = tableService.getTables().get(tableNo).getOrders().get(orderNo);
		
		for(Cart c : order.getCarts()) {
			productService.findBy(c.getProductNo()).setStock(productService.findBy(c.getProductNo()).getStock() + c.getAmount());
		}
		
		orders.remove(order);// 전체 주문 목록에서의 삭제
		tableService.getTables().get(tableNo).getOrders().remove(order); // 테이블 내의 주문삭제
	}

   
   public void orderList() {
	   System.out.println("*******************************");
	   System.out.println("**                           **");
	   System.out.println("**        [주문 내역]        **");
	   System.out.println("**                           **");
	   System.out.println("*******************************");
		
	   int num = 0;

	   for (int i = 0; i < tableService.getTable().getOrders().size(); i++){
		   System.out.println("===================================================================");
		   System.out.println("====== 주문내역 >> [주문번호=" + (i + 1) + ", 주문시간=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tableService.getTable().getOrders().get(i).getTime()) + "]" + "======");
		   System.out.println("===================================================================");
			
		   for(Cart c : tableService.getTable().getOrders().get(i).getCarts()) {
			   System.out.println("[상품순서=" + c.getCartNo() + ", 상품명=" + productService.findBy(c.getProductNo()).getName() + ", 수량=" + c.getAmount() + ", 주문금액=" + c.sum() + "]");
		   }
		   System.out.println("총 " + tableService.getTable().getOrders().get(i).sum() + "원 입니다.");
		   num += tableService.getTable().getOrders().get(i).sum();
	   }
	   
	   System.out.println("===================================================================");
	   System.out.println("                          총 " + num + "원 입니다.");
	   System.out.println("===================================================================");
		
	}
   
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}