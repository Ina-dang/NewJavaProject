package a220121;

import java.util.Arrays;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println(b);
		b.buy(new Tv());
		System.out.println(b);
		b.buy(new Computer());
		System.out.println(b);
		b.buy(new Audio());
		System.out.println(b);
		b.summary();
		
	Product product = new Product(10) {};
		//����θ� �ۼ��ϰ� �����δ� �ۼ��ϴ´�� ���ܵд�
	}
}

abstract class Product {
	int price;
	int bonusPoint;
	
	Product (int price) {
		this.price = price;
		bonusPoint = (int)(price/10d);		
	}

	Product(){}
	
	@Override
	public String toString() {
		return getClass().getSimpleName(); 
	}	
}

class Tv extends Product {Tv(){	super(100);	} }
class Computer extends Product {Computer(){	super(200);	} }
class Audio extends Product { Audio() { super(50); } }	


class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] item = new Product[10]; //������ ��ǰ�� �����ϱ� ���� �迭
	int i; 
	
	void buy(Product p) { //���� ������ ����� ����Ŭ����
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ������ ����迭�� ���� �� 
		System.out.println( p + "��/�� �����߽��ϴ�");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		for (int i = 0; i < this.i; i++) {
//			if (item [i] == null) {
//				break;
//			}
			sum += item[i].price; //��ǰ�迭���ִ� ���ݸ� �����ͼ� ���ϱ�
			itemList += item[i] + ", "; //��ǰ�迭����  ��ǰ �̸��߰�
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ���" + sum + "�Դϴ�");
//		System.out.println("�����Ͻ� ��ǰ�� " + Arrays.toString(item) + "�Դϴ�"); //null���� ����
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�");
	}

	
	@Override
	public String toString() {
		return String.format(" [������=%s, bonusPoint=%s]", money, bonusPoint); //main�޼��忡�� ����Ҷ� 
	}
}
