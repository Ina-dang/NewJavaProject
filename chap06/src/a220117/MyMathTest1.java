package a220117;

public class MyMathTest1 {
	//���θ޼���� os�� jvm���Ѽ� ���α׷� ����� �ڵ������� ȣ��ȴ�
	
				 //��ȯŸ���� void�̹Ƿ� ��������. �����Ϸ��� �ڵ��߰�	
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		System.out.println("add(5L, 3L) = " + result1); 	  // long result = a+b; return a + b

		if (result1 == 8) {
				return;
			//�ش� �޼��� ������ returnŰ���带 ������ ���������
		}
		
		long result2 = mm.subtract(5L, 3L);
		System.out.println("soubtract(5L, 3L) = " + result2); // long result2 = return a - b
		long result3 = mm.multiply(5L, 3L);
		System.out.println("multiply(5L, 3L) = " + result3);  // long result3 = return a * b
		double result4 = mm.divide(5L, 3L);
		System.out.println("divide(5L, 3L) = " + result4);    // double result4 = return a / b
		
	}
	
	int max(int a, int b) {
		if (a < b) {
			return a;
		}
		return b;
	}
	
	int abs(int x) {
		//���밪 : ����� �͵� �������, ������ �͵� �������
		if(x < 0 ) return -x;
		return x;
	}
}
	

