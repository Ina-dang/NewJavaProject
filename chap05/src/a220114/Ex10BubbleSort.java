package a220114;

public class Ex10BubbleSort { //�����ϱ�(sort)
	
//	 0(n^2) :
//	���� ���� = ȸ���� ������ �ε��� ������ ���� �Ϸ�
	public static void main(String[] args) {
		int[] numArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) { //0���� numArr.length���� 1������
			System.out.print(numArr[i] = (int)(Math.random() * 10));
		}  //��������ϸ� ù��° ���� ���� length����
		
		System.out.println();
		
//		numArr = new int[] {1,9,0,8,1}; // �������� ���� ���������ؼ� ����
//		for (int i = 0; i < numArr.length; i++) {
//			System.out.print(numArr[i]);
//		}  
//		
//		System.out.println();
		
		
		
		
		
//		i == 0;
//		[1, 9, 0, 8, 1]
		/*
		 * 1 �� 9 ���� 1�� �� ������ �״�� 9�� �� �̵�
		 * 9�� 0 ���� 0�� �� ������ 
		 * 1, 9, 0, 8, 1 ���� 
		 * 1, 0, 9, 
		 * �״����� 9�� 8 �ٽú� �� 8�� �� ������
		 * 1, 0, 8, 9 
		 * �״����� 9�� 1 �ٽ� �� �� 1�� �� ������ �� �ڸ��̵�
		 * 1, 0, 8, 1, 9
		 *   
		 */
//		i == 1;
//		[1, 0, 8, 1, 9]
		/*
		 * 1�� 0 �� �� 0�� �� ������ 0�� ������ 
		 * �Ʊ�ó�� ����
		 */

// 		�������� ���� �Ϸ��� 0, 1, 1, 8, 9  		
		
		for (int i = 0; i < numArr.length -1 ; i++) { 
							//-1 �������� 0-4�� �ε����� ������ 4���ε����� 5���̶� ���Ϸ� �ؼ� ������
			boolean changed = false; //�ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
			
			for (int j = 0; j < numArr.length-1-i; j++) {
				// ******
				if (numArr[j] > numArr[j + 1]) { //���� ���� ������ ���� �ٲ۴�.
				// ******
					
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true; //�ڸ� �ٲ��� �߻������� changed�� true��.					
			}
		}
			if (!changed) break; //�ڸ��ٲ��� ������ �ݺ����� �����.
			
		for (int k = 0; k < numArr.length; k++) {
			System.out.print(numArr[k]); //���ĵ� ����� ����Ѵ�.
		}
			System.out.println();
		}
	}
}
