package a220108;

public class Ch3_07 {
	/*
	 * �Ʒ��� ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϵ� �ڵ��̴�.
	 * ��ȯ ������ 'C = 5 / 9 x (F - 32)' ��� �� ��, (0)�� �˸��� �ڵ带 �����ÿ�
	 * ��, ��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�
	 * (Math.round()�� ������� �ʰ� ó���� ��)
	 */
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(5/9f * (fahrenheit-32)*100 + 0.5f)/100f;
						
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);
	}
}
