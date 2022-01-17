package a220116;

import java.util.Arrays;

//public class InsertionSort {
//	public static void main(String[] args) {
//		
//		int[] arr = {40, 50, 30, 10, 20};
//		int min = arr[0]; // �迭�� ù ��° ������ �ּҰ��� �ʱ�ȭ �Ѵ�.
//		int idx = 0; 
//		
//		for (int i = 1; i < arr.length; i++) {
//			if (min > arr[i] ) { //min�� arr���� Ŭ���
//				min = arr[i];
//				idx = i;
//			}
//		}
//			System.out.println("�ּҰ� :" + min);
//			System.out.println(idx); //�� �� �ε����� �ּҰ����� ����
//		//40�� ���� 10�� �� ��ȯ
//		int tmp = arr[0]; 
//		arr[0] = arr[idx];
//		arr[idx] = tmp;
//		
//		System.out.println(Arrays.toString(arr));
//	}
//}

// ���� ������ �� �����ϰ� ���̱�

public class InsertionSort {
	public static void main(String[] args) {

		int[] arr = {40, 50, 30, 10, 20};
		
		int idx = 0; 
		
		for (int i = 1; i < arr.length; i++) {
			if ( arr[idx] > arr[i] ) { // arr���� Ŭ���
				idx = i; //�ε��� ��°�� ���
			}
		}
		System.out.println(arr[idx]); //�� �� �ε����� �ּҰ����� ����
			System.out.println(idx); //�� �� �ε����� �ּҰ����� ����
		//40�� ���� 10�� �� ��ȯ
		int tmp = arr[0]; 
		arr[0] = arr[idx];
		arr[idx] = tmp;
		
		System.out.println(Arrays.toString(arr));
	}
}