package a220111;

public class Ch4_02 {//1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
	public static void main(String[] args) {
//		int sum = 0;
//		
//		for(int i = 0; i <=20; i++) {
//			if(i%2!=0 && i%3!=0)
//				sum += i;
//		}
//		System.out.println("sum="+sum);
		
		//�� Ǯ��
		int sum = 0; //�������
		for(int i = 1; i <=20 ; i++) { //20����
			if( i % 2 != 0 && i % 3!=0)// !(i % 3 == 0 || i % 3==0) �� �������̶�� �Ѵ�
				//�����̾�׷����� 
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum); //����Ʈ
	}
}