package a220114;

public class Ex07Shuffle { //shuffle
	public static void main(String[] args) {
		int[] numArr = new int[10];
//		System.out.println(numArr[0]); 0~9 �ε��� ���� �� �� 0������
		
		for (int i = 0; i < numArr.length; i++) { //0�� �ε���10���� 1������
			numArr[i] = i; //�迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);			
		}
		System.out.println();
		
		for (int i = 0; i < numArr.length; i++) { //0~9���� ���� �� ���� 
			int n = (int)(Math.random() * 10); //0~9���� �� ���� ���Ƿ� ��´�.
			int tmp = numArr[0]; //�ӽú���
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		for (int  i= 0; i < numArr.length ; i++) {
			System.out.print(numArr[i]);
		}
	}
}
