package a220113;

import java.util.Arrays;

import a220112.Array;

public class FlowEx22 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr [i] = i+1;
			System.out.printf("%d ", arr[i]);
		}	
		   System.out.println(); //�ٹٲ�
		
		for (int tmp : arr) { //�迭 arr�� ���� tmp�� ȣ���ҰŴ�
			tmp = 10;
			System.out.printf("%d ", tmp);
			sum += tmp;			
		} //���� ���� ������ ȣ���� �� ���� ���� �� (�б�����)
		System.out.println(); //�ٹٲ�
		System.out.println(Arrays.toString(arr));
		
		System.out.println(); //50���� ��� �� �ٽ� �ٹٲ�
		System.out.println("sum=" + sum);
		

	}
}
