package a220111;

public class HomeworkStars {
	//5*5������ ������ ���� 
	/*
	 *      *
	 *     ***
	 *    *****
	 *     ***
	 *      *
	 */
	//FlowEx16����
	public static void main(String[] args) {
		for(int i= 0; i < 5; i++) {
			for(int j= 0; j < 5; j++) {
//				boolean b = i >= j ; //if���� boolean���� ������ ���߿� �ٲٱ� ����
				if(i==2) {
//					System.out.print("*");
					System.out.printf("[%d,%d]", i, j);
				} else if (j==2) {
//					System.out.print("*");
					System.out.printf("%10c", ' ');
					System.out.printf("[%d,%d]", i, j);
				} {//�� �׸�� ���� ��ĥ�� ����..
				}
			}
			System.out.println();
		}//4���� ������ ���� ������?
	}
}
