package a220112;

public class Array { //�迭
	static int value;
	
	public static void main(String[] args) {
		
//		int result = 0;
		int i = 10;
		System.out.println(value);
		int [] score = new int [8]; //�迭 ����
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		score[2] = 100;
		score[3] = 50;
		System.out.println("============");
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);

		System.out.println("============");
		for( i = 0; i < 5; i++) { //���� ��Ʈ ���� �־ int ����
			System.out.println(score[1]);
		}
			
		System.out.println("============");
		for( i = 0; i < score.length; i++) { //���� ��Ʈ ���� �־ int ����
						//score�� ����
			System.out.println(score[i]);
		}
		
			// [I@ �ڿ� ���ڷ� �� �ּҳ���		
			// score Ÿ�� ? int []
			// score [0]Ÿ�� ? int
	}
}
