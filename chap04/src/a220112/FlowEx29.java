package a220112;

public class FlowEx29 {//���ٿ��
	public static void main(String[] args) {
		for(int i = 1 ; i <= 100 ; i++) {
			System.out.printf("i = %d", i); //������� �ϸ� �ϴ� i =1
			
			int tmp = i;
			
			do {
				// tmp %10�� 3�� ������� Ȯ��(O)����
				if(tmp %10 %3==0 && tmp %10 != 0)  //do �� �ϴ� ������ �۵�
					//1���ڸ����� 3���� ���� �� �ִ°� 0,3,6,9�� (&& 1���ڸ��� 0�̾ƴѰ�) �� ����
					// = 1�� �ڸ��� 3,6,9 �� ��
					System.out.print("¦");
				
				// tmp /= 10�� tmp = tmp /10 �� ����
//								40 = 40  /10
			} 	while((tmp /= 10)!= 0);
				System.out.println();
		}
	}
}
