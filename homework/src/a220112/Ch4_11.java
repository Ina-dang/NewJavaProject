package a220112;

public class Ch4_11 {//�� �Ǻ���ġ..?
		/*
		 * 
		 * �Ǻ���ġ ���� ���غ���
		 * �տ��ִ� �� ���� ���� ����� �ݿ��Ѵ�
		 * 
		 */
	public static void main(String[] args) {
		//Fibonnaci ������ ù �μ��ڸ� 1,1��
		int num1 = 1;
		int num2 = 0;
		int num3 = 0; 
//		System.out.print(num1+","+num2); / num1 1 num2 0���� �ٲٰ� �̰� ����Ʈ ���ϰ� �Ʒ� �ݺ��� 10������ �ϸ� �������������
		// num1 + num2 = 3
		/*
		 * a b c 
		 * 1 0 1
		 *   a b c
		 *   0 1 0
		 *     a b c
		 *     1 0 1
		 */
		
		for(int i = 0 ; i < 10 ; i++) { //������ 1,0�ϰ� 8���̾���
			num3 = num2 + num1; 
			num1 = num2;
			num2 = num3;
			System.out.print(num3+",");
			// �ڵ�־�ϼ� ��� 1,1,2,3,5,8,13,21,34,55 
		}
	}
}
