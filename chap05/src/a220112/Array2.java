package a220112;

public class Array2 {
	public static void main(String[] args) {
		// �迭�� ���� �ε��� [1] ���� 4 [2]�� 8 12 16 20 �� ���غ���
		// 4 8 12 16 20
		// 1 2 3  4  5
		// 0 1 2  3  4  == i
		//�̷��� �صε�
//			score[0] = 4; 
//			score[1] = 4*2; 
//			score[2] = 4*3; 
//			score[3] = 4*4; 
//			score[4] = 4*5;
		int[] score = new int[5];
		for(int i = 0 ; i < score.length ; i++) {
			score[i] = (i + 1) * 4;
			
		System.out.println(score[i]);
		}
			

		int[] score2 = score; // score�� ����ִ� '�ּ�'���� int[]Ÿ���� score2�� �Ҵ�
		score2[3] = 100;
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.println(score[i]);
		}
		System.out.println(score);
		System.out.println(score);
//		new String("abcd"); // �����ϰ� ���� �ȴ��� --> ������
	}
}
