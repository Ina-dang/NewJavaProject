package Service;

import java.util.ArrayList;

import Domain.MenuItem;
import Interface.Menu;

public class MenuImpl implements Menu{
	private ArrayList<MenuItem> items;
	
	public MenuImpl() {
		
	}
	
	public MenuImpl(ArrayList<MenuItem> items) {
		this.items = items;
	}
	
	public void menuInit() {
//		items.add(new MenuItem(id, name, price));
//		items.add(new MenuItem(id, name, price));
//		items.add(new MenuItem(id, name, price));
//		items.add(new MenuItem(id, name, price));
//		items.add(new MenuItem(id, name, price));
//		items.add(new MenuItem(id, name, price));
	}
	
	@Override
	public void menuList() { // 100번대, 200번대, 300번대 id 순서대로
		for(MenuItem m : items) {
			System.out.println(m);
		}
	}
	
	@Override
	public MenuItem choose(String name) {
		for(MenuItem each : items) {
			if(each.getName().equals(name)) {
				return each;
			}
		}
		return null;
	}

	@Override
	public void menuAdd(int id, String name, int price) {
		items.add(new MenuItem(id, name, price));
	}

	@Override
	public void menuRemove(String name) {
		int cnt = -1;
		
		for(MenuItem each : items) {
			if(each.getName().equals(name)) {
				items.remove(each);
				cnt++;
			}
		}
		if(cnt >= 0) {
			System.out.println("삭제되었습니다.");
		}
		else if(cnt < 0) {
			System.out.println("찾으려고 하는 상품이 없습니다.");
		}
		
	}
}