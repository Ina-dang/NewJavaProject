package a220107;

public class BitOpr { //��Ʈ������
	public static void main(String[] args) {
		
	// & | ^ ~ << >> >>>
	// ^  : XOR(exclusive or ��Ÿ�� ����), caret. �ǿ����� ���� ����� �޶�߸� �� // �ΰ��� ������ ����
	
		System.out.println(8 & 6); 
		System.out.println(8 | 6); 
		System.out.println(8 ^ 6);
		/*
		 *  		 111 : 7
		 * 		 	 101 : 5
		 *  
		 *  &�� ��� 101
		 *  |�� ��� 111
		 *  ^�� ��� 010   
		 */
		/*
		 *  		 1000 : 8
		 * 		 	 0110 : 6
		 *  
		 *  &�� ��� 0000
		 *  |�� ��� 1111
		 *  ^�� ��� 1110  
		 */
		
		//~ (��Ʈ��������) : boolean Ÿ���� ������� �� ������ �ƴ� ���ڴ�� ����
		System.out.println(7);
		System.out.println(~7);
		
		System.out.print("000000000");
		System.out.print("000000000");
		System.out.print("00000000");
		System.out.println(Integer.toBinaryString(7));
		System.out.println(Integer.toBinaryString(~7));
		
		//ip 0.0.0.0 ~ 255.255.255.255 
				
		
									//2^n���ϱ� 111[2]
		System.out.println(7 << 3); //0011_1000 : 56
		System.out.println(7 << 2); //0001_1100 : 28
		System.out.println(7 << 1); //0000_1110 : 7		�� �ڸ����� 1���� ������ ��
		System.out.println(7 << 0); //0000_0111
		System.out.println(7 >> 1); //0000_0011
		System.out.println(7 >> 2); //0000_0001
		System.out.println(7 >> 3); //0000_0000
									// <<<�� ������ >>>�� ����
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 >> 1)); // /2�� ��
		System.out.println(Integer.toBinaryString(-1024 << 1));
		System.out.println(Integer.toBinaryString(-1024 >>> 1)); //��ȣ ���� shift ��ȣ�� �����ϰ� 0���θ� ä���
		// x << n �� x * 2^n�� ����� ����
		// x >> n �� x / 2^n�� ����� ����
	}
}
