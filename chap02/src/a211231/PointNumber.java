package a211231;

public class PointNumber {
	public static void main(String[] args) {
		double val1 = 3.14;
		
		double result = val1 + 1;
		// �Ҽ��� 15�ڸ����� ���е�(precision)
		System.out.println(val1);
		System.out.println(result);
		System.out.println(val1 + result);
		
		float val2 = 3.14f; // �ڿ� f�� �ٿ���� ������ �ȶ�
		
		float result2 = val2 + 1;
		// �Ҽ��� 7�ڸ����� ���е�(precision)
		System.out.println(val2);
		System.out.println(result2);
	}
}
