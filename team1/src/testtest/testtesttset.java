package testtest;

import java.util.ArrayList;
import java.util.List;

public class testtesttset {
	public static void main(String[] args) {
		Order order = new Order();
		Cart cart = new Cart();
		
		order.getCarts().add(cart);
		
		for(int i = 0; i < 6; i++) {
			Table.getInstance().getTables().add(null);
		}
		
		Table.getInstance().getTables().set(0, order);
		
		for(int i = 0; i < 6; i++) {
			System.out.println((i+1) + "번째 테이블 " + Table.getInstance().getTables().get(i));
		}
	}

}

class Table{
	List<Order> tables = new ArrayList<Order>();
	
	private static Table table = new Table();
	private Table() {}
	public static Table getInstance() {
		return table;
	}
	
	public List<Order> getTables() {
		return tables;
	}
	public void setTables(List<Order> tables) {
		this.tables = tables;
	}
	@Override
	public String toString() {
		return "Table [tables=" + tables + "]";
	}
}

class Order{
	private List<Cart> Carts = new ArrayList<Cart>();
	
	public Order() {
		Carts.add(new Cart());
	}

	public List<Cart> getCarts() {
		return Carts;
	}

	public void setCarts(List<Cart> carts) {
		Carts = carts;
	}

	@Override
	public String toString() {
		return "주문 [Carts=" + Carts + "]";
	}
	
	
}

class Cart{
	private int i = 1;
	
	public Cart() {
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "[i=" + i + "]";
	}
}