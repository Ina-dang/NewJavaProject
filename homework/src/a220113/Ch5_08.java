package a220113;

public class Ch5_08 {
	//������ �迭 answer�� ��� �����͸� �а� 
	//�� ������ ������ ��� 
	//������ŭ ��*���� �� �׷����� �׸��� ���α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ �ϼ��Ͻÿ�
	
//	�� �ڵ� ���࿡ ��� ��
	
//	0xffffff 0x000000 >> 24bit > 3byte * 160000 = 480Kbyte >> �ʹ�Ŀ�� ��������� 24k����
//	git = 256
//	 �ս�  ���� = ��ǥ������ .jpg
	
		
//	���ս� ���� = �������¶� �Ȱ�
	
	
	public static void main(String[] args) {
		int[] answer  = { 1,4,4,3,1,4,4,2,1,3,2}; //3*** , 2**, 2**, 4****
//		1 3�� 2 2�� 3 2�� 4 4�� = 11��
		//���ڸ� �Ѱ����ε� ����ϰ� *������ε� ���
		
		int[] counter = new int[4]; //�ε��� 0,1,2,3 
		
		
		for (int i = 0; i < answer.length; i++) { //answer�� ���� �� �渶�� �Ҵ�
//			System.out.printf("%d  \t",answer[0]);
			if (answer[i] == 1) { //answer i ==1�̸�
				counter[0] = counter[0] + 1; // ī���� 0�濡 1�� �����ش�
			}
			if (answer[i] == 2) { //answer i ==2�̸�
				counter[1] = counter[1] + 1; 
			}
			if (answer[i] == 3) { //answer i ==3�̸�
				counter[2] = counter[2] + 1; 
			}
			if (answer[i] == 4) { //answer i ==4�̸�
				counter[3] = counter[3] + 1; 
			}
		}
		
		System.out.println();
		for (int i = 0; i < counter.length; i++) { 
			//index �� ����ŭ �� 
			System.out.printf("%d", counter[i]); 
			for (int j = 0; j < counter[i]; j++) {
				System.out.printf("%s", "*"); 
			}

			System.out.println();
			
		}
	} 	
}
