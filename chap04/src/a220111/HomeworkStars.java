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
		for(int i= 0;  i < 5;  i++ ) {
			for(int j = 0 ; j < 5; j++) {
				boolean b = i == 2 ; //if���� boolean���� ������ ���߿� �ٲٱ� ����
				boolean b1 = j == 2 ; //if���� boolean���� ������ ���߿� �ٲٱ� ����
				boolean b2 = (i > 0 && i < 4) && (j > 0 && j < 4)  ; //if���� boolean���� ������ ���߿� �ٲٱ� ����
				if (b) {
					System.out.printf("[%d,%d]", i,j);
				} else if (b1) {
					System.out.printf("[%d,%d]", i,j);
				} else if (b2) {
					System.out.printf("[%d,%d]", i,j);
				}
				else {
					System.out.printf("     ");
				}
			}
			System.out.println(""); //�̰� �ǳ�;;
		}
	}
}
