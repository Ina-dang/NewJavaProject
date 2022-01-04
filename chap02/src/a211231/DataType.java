package a211231;

public class DataType {  //����� ���ͷ�(constant & literal)
	public static void main(String[] args) {
		
//		int val3 = 10;
//		val3 = 20;
		
//		final int val3 = 10;
//		val3 = 20;
		
	/* 
	 * ���ͷ��� Ÿ�԰� ���̻� -> ������ Ÿ���� �ִ� ��ó�� ���ͷ����� Ÿ���� �ִ�.
	 * 1. ����(���̻�x) : false, true
	 * 2. ������(long-l�Ǵ�L, int-x) : 123, 0b0101(2�������ͷ�), 077(8����), 0xFF(16����), 100L(��Ÿ��)
	 * 				l,L �򰥸��Ƿ� �빮��L ��õ
	 * 3. �Ǽ���(float-f, double-d) : 3.14, 3.0e8, 1.4f(float���ͷ�), ox1.0p-1(p�� ���� ������ �ǹ�)
	 * 4. ������(���̻�x) : 'A', '1', '\n'
	 * 5. ���ڿ�(���̻�x) : "ABC", "123", "A", "true"
	 * 
	 * long, float ���ͷ� �Ű澲��
	 */
		
		//boolean, char, int, double
		
		boolean val1 = true; //���� true or false
		System.out.println(val1);
		
		int val2 = 0b1000; //������ b=binary 1000�� 2���� = 8
		System.out.println(val2);
		
		int val3 = 077; //������ 8����
		System.out.println(val3);
		
		int val4 = 0xFF; //������ ��ҹ��� ����x
		System.out.println(val4);
		
		float val5 = 123.456f; //�Ǽ��� �����ͷ� f�ٿ��� ��
		System.out.println(val5);
		
		double val6 = 123.456; //�Ǽ��� d�� �ʿ����
		System.out.println(val6);
		
		double val7 = .1; //0.1���� 0������
		System.out.println(val7);
		
		long val9 = 10;
		System.out.println(val9);
		
		// float val10 = 10.1; �ڿ� f ������ double�� �ν��ؼ� ���� �� 
		float val10 = 10.1f;
		System.out.println(val10);
		
		// int val11 = 100L; L���ͷ��� int���� Ŀ�� ������
		int val11 = 100;
		System.out.println(val11);
		
		// ���ڿ��� char type 48, 65, 97���� �߿�
		// �� �� ���� �߿��� ���� 65
		/* ASCII (American Standard Code for Information Interchange) �̱� ���� ǥ�� ��ȸ
		 * ���� ���ĺ��� ����ϴ� ��ǥ ���� ���ڵ�
		 * Decimal = 10����
		 * Hexadecimal = 16 
		 * Binary = 2
		 * Octal = 8
		 * 
		 * 0 ~ 127 ���� Decimal �� 128�� ASCII table (7��Ʈ)
		 * Decimal 48 = Char 0
		 * Decimal 65 = Char A
		 * Decimal 97 = Char a
		 */
		
		char val12 = 65;
		System.out.println(val12);
		
		char val13 = 48;
		System.out.println(val13);
		
		char val14 = 97;
		System.out.println(val14);
	}

}
