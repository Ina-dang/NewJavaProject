package Domain;
		//메뉴아이템은 소비자관점 제목임
public class MenuItem{ //Product 로 변경추천
	private int id;
	private String name;
	private int price;
	//메뉴 아이템에는 세개면 충분
	
	private int cartCount; // 메뉴아이템에 있어야할 녀석 아님 
	//재고라는 표현이 더 맞음
	
	private long Time;
	
	public MenuItem() {
		
	}
	
	public MenuItem(String name, int count) {
		long now = System.currentTimeMillis();
		
		this.setName(name);
		this.setCartCount(count);
		this.setTime(now);
	}
	
	public MenuItem(int id, String name, int price) {
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getTime() {
		return Time;
	}

	public void setTime(long time) {
		this.Time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCartCount() {
		return cartCount;
	}

	public void setCartCount(int cartCount) {
		this.cartCount = cartCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", cartCount=" + cartCount + ", Time="
				+ Time + "]";
	}
	
}