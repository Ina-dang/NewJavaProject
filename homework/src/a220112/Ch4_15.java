package a220112;

public class Ch4_15 { 
	/*
	 * ȸ���� ���ϴ� ���α׷� : �Ųٷ��ص� ��ȿ��;
	 */
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number; //number ������ �Ųٷ� ��ȯ�ؼ� ���� ����
		
		int result =0;
		
		while(tmp !=0) {
			result = result * 10 + tmp % 10;
			tmp /= 10;
		}
		
		// 123
		// 321 -> �̰� ȸ������ �ƴ�
		
		// ��Ģ �� ������ ���� �ڸ��� �����´� 
		// 123�� 3���� 3 2 1 ������ ��������
		// 321�� 1���� 1 2 3 ������ ��������
		
		// ���� �����ڸ����� �������� 10���ϰ� �ٽ� �����ڸ����� �������� 10 �����ְ�
		
		// �ݺ����� �ٷ� �Է��ϴ� �ͺ��ٴ� �̰Ÿ� �ϳ��ϳ��� ���� ����°� ����

		//���� �ִ����� 10���� ���ϰ� 1���ڸ� ���ϱ�
		
		
//		result = result * 10 + tmp % 10; //12321���� 1 ������	 	
//		tmp /= 10;		  //12321 = 12321 / 10 		=> 1232
//		System.out.printf("%d \t %d%n" , result, tmp);
//		
//		
//		result = result * 10 + tmp % 10;     //1232 ���� 2 ������
//		tmp /= 10;        //1232  = 1232  / 10		=> 123
//		System.out.printf("%d \t %d%n" , result, tmp);
		
		
		if(number == result) {
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		}else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
	}
}
