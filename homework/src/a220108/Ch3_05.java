package a220108;

public class Ch3_05 {
	/*
	 * �Ʒ��� ���� num�� �� �߿��� ���� �ڸ��� 1�� �ٲ۴� �ڵ��̴�. 
	 * ���� ���� num�� ���� 333�̶�� 331�� �ǰ�, 777�̶�� 771�� �ȴ�
	 * ()�� �˸��� �ڵ带 �����ÿ�
	 */
	public static void main(String[] args) {
		int num = 777;
//		System.out.println((int)Math.ceil(num/10)*10+1);
		System.out.println(num/10*10+1);

		System.out.println(num - num%10+1);
	}
}
