package a220108;

public class Ch3_02_ { //ch3/Exercise3_2
	public static void main(String[] args) {
		int numOfApples = 123;		// ����� ����
		int sizeOfBucket = 10;		// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);	
									// ��� ����� ��µ� �ʿ��� �ٱ����� ��
						 // �ּ��ȿ� �˸��� �ڵ带 �ֱ�
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket);
		
		
		//�ؼ� ���µ��� ���ذ� �Ȱ�
	}
}
