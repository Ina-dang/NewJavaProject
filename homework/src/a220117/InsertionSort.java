package a220117;
//n^2 ���ĵ��� �� �̰Ű���
//�ٱ��� �ݺ��� ȸ��
//���� �ݺ��� ���� ���
//���ʺ��� ����� ������

import java.util.Arrays;

public class InsertionSort {//�������� - ������ ��������� ȿ���� �ް�
	public static void main(String[] args) {
		int[] arr = {8, 5, 6, 2, 4};
		
//		if(arr[1] < arr[0]) { //5�� 8���� ������ �ڸ���ü
//			int tmp = arr[0];
//			arr[0] = arr[1] ;
//			arr[1] = tmp;  //�̷��� �ϸ� 1ȸ�� �����ٰ���
//		}
//		
//		System.out.println(Arrays.toString(arr));
//		
//		if(arr[2] < arr[0]) { //5�� 8���� ������ �ڸ���ü
//			int tmp = arr[0];
//			arr[0] = arr[2] ;
//			arr[2] = tmp;  //�̷��� �ϸ� 1ȸ�� �����ٰ���
//		}
//
//		if(arr[2] < arr[1]) { //5�� 8���� ������ �ڸ���ü
//			int tmp = arr[1];
//			arr[1] = arr[2] ;
//			arr[2] = tmp;  //�̷��� �ϸ� 1ȸ�� �����ٰ���
//		}
		
		for (int i = 1; i < arr.length ; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i] ;
					arr[i] = tmp; 
				}
			} System.out.println(Arrays.toString(arr));
		}
	}
}
