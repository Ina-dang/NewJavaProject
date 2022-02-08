package Service;

import static util.ScannerUtil.nextInt;

import java.util.ArrayList;
import java.util.List;

import Domain.Cart;
import Domain.Order;

public class OrderService {
	   
//  Product ==1:1관계==> Cart
//   Cart ==다:1(카트여러개가 오더하나)==> Order
//   Order ==얘도 다대일==> Table 로 이동
   
	private static OrderService orderService = new OrderService(); 
	private OrderService(){}
	public static OrderService getInstatnce() {
		return orderService;
	}
	
   private List<Order> orders = new ArrayList<Order>();

   private Order order = new Order();
   
   public void cart() {//장바구니에 상품담기   
	  ProductService.getInstance().productsList();
      order.getCarts().add(new Cart(nextInt("장바구니 번호 >> "), nextInt("상품 번호 >> "), nextInt("상품 수량>> ")));
      System.out.println(order.getCarts());
   }
   
   public void order(int index) {
      orders.add(new Order(1, System.currentTimeMillis(), order.getCarts()));
      System.out.println("주문 완료했습니다.");
      order.getCarts().clear(); // 장바구니 초기화
   } 
   
   public void removeCart() {//장바구니 삭제하기
      System.out.println(order.getCarts());
      order.getCarts().remove(findBy(nextInt("삭제할 장바구니 상품 순서 >> ")));
      System.out.println("삭제되었습니다. \n");
      System.out.println("** 현재 장바구니 **");
      System.out.println(order.getCarts());
   }
   
   public void removeOrder() {//주문 삭제하기
      System.out.println(getOrders());
      getOrders().get(nextInt("수정할 주문 순서 >> ")).getCarts().remove(nextInt("삭제할 주문 순서 >> "));
      System.out.println("삭제되었습니다. \n");
      System.out.println("** 현재 주문내역 **");
      orderHistory();
   }
   
   public void orderHistory() { 
      for(Order o : orders) {
         System.out.println(o);
      }
   }
   
   public List<Order> getOrders() {
      return orders;
   }
   
   public Cart findBy(int no) { //remove findBy
      Cart tmpCart = null;
      for (Cart c : order.getCarts()) {
         if(c.getCartNo() == no) {
            tmpCart = c;
         }
      }
      return tmpCart;
   }
   
   public static void main(String[] args) {

	  
   }
}