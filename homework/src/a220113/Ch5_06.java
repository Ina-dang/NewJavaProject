package a220113;

public class Ch5_06 { //������ �Ž������� �� ���� �������� ������ �� �ִ����� ����ϴ� �����̴�. ��
//	�� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� �����
//	��. ��, ������ �� ���� ���� �������� �Ž��� �־���Ѵ�. (1)�� �˸��� �ڵ带 �־
//	���α׷��� �ϼ��Ͻÿ�.
//	[Hint] ������ �����ڿ� ������ �����ڸ� ����ؾ� �Ѵ�.
	
	//ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		
		int money = 2680;
		System.out.println("money = " + money);
		
		for (int i = 0; i < coinUnit.length; i++) {
			
			System.out.println(coinUnit[i] + "��: " + money/coinUnit[i]);
			money = money%coinUnit[i];
		}
	}
}
