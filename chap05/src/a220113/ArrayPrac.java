package a220113;

import java.util.Arrays;

//������ ��� ��Ű���� �ڹ���ƿ�� �θ��ſ��� ��� ����

public class ArrayPrac {
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8}; //{5, 6, 7, 8}
		
		int[] tmp = new int[arr.length * 2 ]; //{0, 0, 0, 0, 0, 0, 0, 0}
		System.arraycopy(arr, 0, tmp, 0, 4);
		/*
		 * src     : �ҽ� (����) . ��������
		 * srcPos  : �ҽ������� ==> �� �� ����
		 * dest    : Ÿ��. ���. ������
		 * destPos : ��������ġ �� �����ϸ� �������� �ٲ�
		 * length  : ���� �� �����ϸ� ���� �迭�� 2���� ������
		 */
		//{5, 6, 7, 0, 0, 0}
		System.out.println(Arrays.toString(tmp));
							//�� Arrays�� �����ִ°��� java.util. 
//		System.out.println(java.util.Arrays.toString(tmp)); �ؾ��ϴµ� �׷��� ��� �θ� ������ �ؾ���
//		ctrl + shift + o ������ ���� �Ǽ��� ������ �ڹ���ƿ �ҷ���
		
	}	
}
