package a220118;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		
		System.out.printf("C1�� color=%s, gearType=%s, door%s%n", 
				c1.color, c1.gearType, c1.door);
		
		Car c2 = new Car ("white", "auto", 4);
		//�����ϸ鼭 ������ ==> �� ȿ����
		
		System.out.printf("C2�� color=%s, gearType=%s, door%s%n", 
				c2.color, c2.gearType, c2.door);
		
	}
}

// this : �̷��� ������ ��ü�� �ּҰ�
