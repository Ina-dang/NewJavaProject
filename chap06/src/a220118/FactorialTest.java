package a220118;

public class FactorialTest {
	public static void main(String[] args) {
		int result = factorial(4); // !4 >> 4 * 3 * 2 * 1 //�ڱ⺸�� �������ڵ� ����
		System.out.println(result);
		
		int result1 = factorial2(4);
		System.out.println(result);
	}
//factorial method == static method ==> �ν��Ͻ��� �������� �ʰ� ���� ȣ�� ����
//	main method�� ���� Ŭ������ �ֱ� ������ static�޼��带 ȣ���� �� Ŭ���� �̸� ���� ����
//	�׷��� FactorialTest.factorial(4)��� factorial(4)
	static int factorial(int n) {
		int result = 0;
		
		if ( n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1);
		}
		return result;		
	}
	
	//�̰� �� ȿ����
	static int factorial2(int n) {
		int result1 = 1;
		for (int i = 1; i <= n; i++) {
			result1 *= i;			
		}
		return result1;
	}
}




