package a220107;

public class ShortEval {
	public static void main(String[] args) {
		// && & 
		// || |
		
		//�ո� ��� = ȿ����
		System.out.println(true  && true);
		System.out.println(false || true);
		System.out.println(true  && false);
		System.out.println(false || false);
		//�ڵ� �� ���
		System.out.println(true  & true); 
		System.out.println(false & true);
		System.out.println(true  & false);
		System.out.println(false & false);
		
		int i = 0;
//		System.out.println(i != 0 &  10 / i > 10); //������ - ��� 10/i(0)�� ����Ϸ� �� ������ NaN
		//
		System.out.println(i != 0 && 10 / i > 10); //false . &&�� �º��� false�� false ���� - ���ʿ��� ���� ����
		System.out.println(i == 0 || 10 / i > 10); //true .  ||�� �º���  true��  true ���� - ���ʿ��� ���� ����
		
		//ȿ���� ������ ���� && || �ΰ� �� ���°�
	}
}
