package a220121;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null; //����ó�� �� �� ���� ��
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.drive();
		fe.water();
		car = fe;		// car = (Car)fe;���� ����ȯ�� ������ ���´�.
//		car.water();		// �����Ͽ���. CarŸ���� ���������δ� water()�� ȣ���� �� ����.
		((FireEngine)car).water();		// car ���� ĳ���� �ϸ� �� �� ����
		fe2 = (FireEngine)car; // �ڼ�Ÿ�� �� ����Ÿ��
		fe2.water();
		fe2.stop();

		System.out.println("=================");
		
		Car car2 = new Car(); // ī �ν��Ͻ� ����
//		car2 = fe;
		System.out.println(fe instanceof Car);			//true 
		System.out.println(fe instanceof FireEngine);	//true	== ��� �ڱ�Ÿ�� ĳ����
		//īŸ�� �ν��Ͻ������ �ҹ��� �ν��Ͻ������ == ����ȯ �ǳ�? 
		
		System.out.println(car2 instanceof Car);		//true == ��� �ڱ�Ÿ�� ĳ����
		System.out.println(car2 instanceof FireEngine);	//false
		
		System.out.println(car.getClass().getName());
		System.out.println(car.getClass().getSimpleName());
		System.out.println(car.getClass().getCanonicalName());
		System.out.println(car2);
		System.out.println(car2.getClass().getName());
		
	}
}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("stop !!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
	
}
