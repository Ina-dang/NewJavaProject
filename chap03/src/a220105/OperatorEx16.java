package a220105;

public class OperatorEx16 { //rounding
	public static void main(String[] args) {
		float pi = 3.141592f;
//		float shortPi = (int) (pi * 1000) / 1000f; 		 //--> �ݿø����ϰ� ����
		// ������ (pi * 1000) = 3141.592f --> ����ȯ(float -> int) --> /1000f (�ٽ� 1000������ float��)
		// 3.141
		
		float shortPi = (int) (pi * 1000 + 0.5) / 1000f; //�Ҽ��� ��°�ڸ� �������� �ݿø�
		// ������ (pi * 1000) = 3141.592f --> 3141.592f + 0.5 = 3142.092f 
		//  --> ����ȯ(float -> int) --> /1000f (�ٽ� 1000������ float��)
			System.out.println(shortPi);

		
		float shortPi1 = (int) (pi * 100 + .9) / 100f; //�Ҽ��� ��°�ڸ� �������� �ø�
			System.out.println(shortPi1);

		
		// �ø� ceil
		// ���� floor  
		
//		System.out.println(Math.PI); //����Ÿ�� �ִ� 15�ڸ����� ����
//		Math. ���� �˻��غ��� ���� ���� ��
//		System.out.println(Math.ceil(pi)); //4.0 - double type
//		System.out.println(Math.floor(pi));//3.0 -      "
//		System.out.println(Math.round(pi));//3   -   int  type
	
	}
}
