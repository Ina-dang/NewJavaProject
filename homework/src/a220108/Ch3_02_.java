package a220108;

public class Ch3_02_ { //ch3/Exercise3_2
	public static void main(String[] args) {
		int numOfApples = 121;		// ����� ����
		int sizeOfBucket = 10;		// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);	
									// ��� ����� ��µ� �ʿ��� �ٱ����� ��
						 // �ּ��ȿ� �˸��� �ڵ带 �ֱ�
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
		
		
		//�ؼ� ���µ��� ���ذ� �Ȱ�
		
		/*
		 * ������ �ؼ�
		 * 
		 * ����� �ٱ��ϼ�
		 *  118     12
		 *  119     12
		 *  120     12
		 *  121     13
		 *  122     13
		 *  123     13
		 */
		int numOfBucket1 = numOfApples % sizeOfBucket == 0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket + 1;
		System.out.println(numOfBucket1);

		//�̷��� �׳� �ø� �ع����� �ȴ�
		int numOfBucket2 = (numOfApples + 9) / 10;
		System.out.println(numOfBucket2);
		
		//�̷��Ե� �� �� �ִ�
		int numOfBucket3 = (numOfApples -1) / 10 + 1;
		System.out.println(numOfBucket3);
	}
}
