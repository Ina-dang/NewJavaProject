package a220113;

public class Ch5_03 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50}; //5���� int ���� �����Ҽ� �ִ� intŸ�� �迭 arr
		int sum = 0;
//			  �ʱ�ȭ	���ǽ�			������
		for (int i = 0; i < arr.length; i++) { //0���� arr.length���� 1������
			sum += arr[i]; //sum = sum + arr[i];
//			System.out.println(arr[i]);
		}
		
		System.out.println("sum=" + sum);
	}
}
