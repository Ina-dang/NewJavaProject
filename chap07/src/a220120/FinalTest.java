package a220120;

import java.util.Arrays;

public class FinalTest {
	final int NUMBER;
	
	FinalTest(){ //������
		NUMBER = 10; //�ʱ�ȭ ���� �ڷ� �̷�� �����ȶ�
//		NUMBER = 20; //final�̶� �ٲٷ� �ϸ� ����
	}
	public static void main(String[] args) {
		
		final int[] arr = {1, 2, 3 ,4 ,5}; //int�迭Ÿ�� �����ڷ���
		arr[2] = 10; 
		System.out.println(Arrays.toString(arr)); //�׷����� �� �����
		//���� == �迭�� �ּҰ��� �ٲ� �� ���� ����
//		arr = new int[3]; //arr�� �ּ� ������ ������
		
		//��� �����ڷ����� �Ȱ���
		
		final FinalTest test = new FinalTest();
//		test = new FinalTest(); //�̶��� final ������ ����
	}
}
