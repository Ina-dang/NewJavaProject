package a220111;

public class Ch4_03 {//1(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ����� ����Ͻÿ�
	public static void main(String[] args) {
//		int sum = 0;
//		int totalSum = 0;
//		
//		for(int i = 0 ; i <= 10; i++) {
//			sum += i;
//			totalSum += sum;
//			}
//		System.out.println("totalSum="+totalSum);
		
		//220111 ���� 13�̶� 26 ����
		
//		sum�� sum ���־�����Ѵ�
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i <=100 ; i++) {
			sum1 += i;
			sum2 += sum1;
			System.out.printf("%3d   %3d   %3d %n", i, sum1, sum2);
		}
		System.out.println();
		System.out.println(sum2);
	}
}
