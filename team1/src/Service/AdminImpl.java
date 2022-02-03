package Service;

import java.util.ArrayList;

import Domain.MenuItem;
import Interface.Admin;

public class AdminImpl implements Admin{ //이거는 tableService에서 관리해야할 table들 (현재 없음)
	private ArrayList<ArrayList<MenuItem>> tables = new ArrayList<ArrayList<MenuItem>>();
	private ArrayList<MenuItem> cart1 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> cart2 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> cart3 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> cart4 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> cart5 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> cart6 = new ArrayList<MenuItem>();
	private ArrayList<MenuItem> tmpCart = new ArrayList<MenuItem>();
	private MenuItem tmp; // 임시 ArrayList
	private int tmpIndex;
	
	@Override
	public void tableState(int index) {
		System.out.println(tables.get(index));
	}
	
	@Override
	public void tableInit() {
		tables.add(cart1);
		tables.add(cart2);
		tables.add(cart3);
		tables.add(cart4);
		tables.add(cart5);
		tables.add(cart6);
	}

	@Override
	public void tableMenuRemove(int index, String menuname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tablePay(int index) {
		// TODO Auto-generated method stub
		
		// 카드 입력하구
		
		// 결제 내역 쭈루루룩
		
	}

	@Override
	public void tableMove(int index, int toIndex) {
		int cnt = -1;
		
		tmpCart = tables.get(index);
		
		if(tables.get(toIndex) != null) {
			switch(toIndex) {
				case 0:
					cart1 = tmpCart;
					cnt++;
					break;
				case 1:
					cart2 = tmpCart;
					cnt++;
					break;
				case 2:
					cart3 = tmpCart;
					cnt++;
					break;
				case 3:
					cart4 = tmpCart;
					cnt++;
					break;
				case 4:
					cart5 = tmpCart;
					cnt++;
					break;
				case 5:
					cart6 = tmpCart;
					cnt++;
					break;
			}
		}
		else {
			System.out.println("이동하려고 하는 테이블이 사용중입니다.");
		}
		
		if(cnt >= 0) {
			tables.set(index, null);
		}
		
	}
	
	@Override
	public void addCart(MenuItem tmp, int tmpIndex) {
		this.setTmp(tmp);
		this.setTmpIndex(tmpIndex);
		
		switch(tmpIndex) {
			case 0:
				cart1.add(tmp);
			case 1:
				cart2.add(tmp);					
			case 2:
				cart3.add(tmp);
			case 3:
				cart4.add(tmp);
			case 4:
				cart5.add(tmp);
			case 5:
				cart6.add(tmp);
		}
		
	}

	public ArrayList<ArrayList<MenuItem>> getTables() {
		return tables;
	}

	public ArrayList<MenuItem> getCart(int tmpIndex){
		switch(tmpIndex) {
			case 0:
				return cart1;
			case 1:
				return cart2;
			case 2:
				return cart3;
			case 3:
				return cart4;
			case 4:
				return cart5;
			case 5:
				return cart6;
			default:
				return null;
		}
	}

	public MenuItem getTmp() {
		return tmp;
	}

	public void setTmp(MenuItem tmp) {
		this.tmp = tmp;
	}

	public int getTmpIndex() {
		return tmpIndex;
	}

	public void setTmpIndex(int tmpIndex) {
		this.tmpIndex = tmpIndex;
	}
}