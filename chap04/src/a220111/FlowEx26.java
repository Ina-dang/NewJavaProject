package a220111;

public class FlowEx26 {
	public static void main(String[] args) {
		int sum = 0;
		int i   = 0;
		//while�̶� sum i ���� �� ��
		while ((sum += ++i) <= 20) { //��ȣ �ȹ����� ���Կ����� �񱳿��������
			//  sum =  sum + ++i
			//  sum =  sum + 1
			//  sum =  0  + 1
			//  sum == 1
			
			//  sum =  sum + ++i
			//  sum =  sum + 2
			//  sum =  1  + 2
			//  sum == 3
			
			//  sum =  sum + ++i
			//  sum =  sum + 3
			//  sum =  3 + 3
			//  sum == 6
			
			//  sum =  sum + ++i
			//  sum =  sum + 4
			//  sum =  6   + 4
			//  sum == 10
			
			System.out.printf("%d - %d%n", i, sum);
		}
		System.out.println(i);
		System.out.println(sum);
	}
}
