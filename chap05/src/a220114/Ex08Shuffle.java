package a220114;

import java.util.Arrays;

public class Ex08Shuffle { //shuffle
	public static void main(String[] args) {
		int[] ball = new int[45]; //45���� �������� �����ϱ� ���� �迭 ����.
		
		//�迭�� �� ��ҿ� 1~45�� ���� �����Ѵ�.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; //ball[0]�� 1�� ����ȴ�. �ζǹ�ȣ�� 1���� 45�����ϱ�+1
		}	
		System.out.println(Arrays.toString(ball)); //���� �� ����ֳ� Ȯ��
		
		int temp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int j    = 0; //������ ���� �� ������ ����
		
		//�迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��° ���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		
		for (int i = 0; i < 6; i++) { //���ñ���
			j = (int)(Math.random() * 45);
			temp    = ball[i]; //�ӽú���
			ball[i] = ball[j];
			ball[j] = temp; // �ӽú��� ������ �������� �ߺ����� ����
		}
		System.out.println(Arrays.toString(ball)); //�������� ��� �Ƴ� Ȯ��
		
		
		//�迭 ball�� 0���� ���� 6���� ��Ҹ� ����Ѵ�.
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %2d%n", i, ball[i]);
		}
	}
}