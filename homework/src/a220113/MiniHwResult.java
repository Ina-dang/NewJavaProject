package a220113;

public class MiniHwResult {
	public static void main(String[] args) {
		//�Ҽ� ���ϱ�
		/*
		 * ��� : 1���� ū �ڿ��� �� "�ڱ��ڽ��� ���� ����"�� ���� �� "������ �������� ����"
		 * 			= �ڽ��� ���� ������ �ڿ���(1���� ū ����) �� ������ �������� ����
		 * 
		 * ������ �������� = �ڽ��� ���ڿ� �� ���ڸ� �������� �� 0�� �Ǵ� ��
		 * 
		 */
		/*
		 * �Ҽ� : 1�� �ڱ� �ڽŸ����� ������ �������� ����
		 * 		
		 */
		
		System.out.println(6%1);
		System.out.println(6%2);
		System.out.println(6%3);
		System.out.println(6%4);
		System.out.println(6%5);
		System.out.println(6%6);
		System.out.println("===============");
		
		//30���� �Ҽ��� ����������

		for(int num = 2, cnt = 0 ; cnt < 30 ; num++) { //������ �������ִ°� ����. 
			boolean flag = false;
			
			for (int i = 2; i < num ; i++) {
				if( num % i==0 ) {
			//System.out.printf("���� %d�� %d�� �������� �� �������� %d%n",num,i,num%i);
					flag = true;
					break;
				}
			}
			if(!flag) {
				cnt++;
				System.out.println(num + "��(��)" + (flag ? "�Ҽ��ƴ�" : "�Ҽ�"));
			}
		}
	}
}
