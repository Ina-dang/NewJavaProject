package a220117;

import java.util.Arrays;

public class SellectionSort { //�ּҰ����ؼ� ��������
	public static void main(String[] args) {
		
		int[] arr = {50, 20, 30, 10, 40};
		//���⿡ int idx = 0�� ������ �ߺ����ڴ� ������ �ȵ� ==> �� �Ʒ� �ݺ����� �־���� 0������ �ϸ� ��� �ּҰ��̶��� ����
		for (int j = 0; j < arr.length - 1 ; j++) {
			int idx = j; //�� ���⿡ idx = j �� �ؾ���
			for (int i = j + 1; i < arr.length; i++) {
				if ( arr[idx] > arr[i]) {
					idx = i;
				}
			}
			
			int tmp = arr[j];
			arr [j] = arr[idx];
			arr [idx] = tmp;
			
			System.out.println(Arrays.toString(arr)); // �ּҰ� ���� �� ����
		}
	}
}
