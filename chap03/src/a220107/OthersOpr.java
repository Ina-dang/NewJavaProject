package a220107;

public class OthersOpr {
	public static void main(String[] args) {
		/*
		 * ���ǿ����� ?:
		 * ������ ���׿�����
		 * 
		 * ���ǽ� ? ��1 : ��2
		 *  
		 *  ���� ��������� ������ boolean
		 *  �����ڰ� �´ٸ� �񱳿�����, ��������
		 *   
		 */
		int i = 5;
		
		//String result = i % 2 ==0 ? "¦��" : "Ȧ��"
		System.out.println(i % 2 == 0 ? "¦��" : "Ȧ��");
		// if ���� ª�� ����
		
		
		int result2 = i > 0 ? 6 : i == 0 ? 0 : -1 ; //���ǽ��� true�� ��1�� ���, false�� ��2�� ���
													//i>0�� true�� 1�� ���,false�� i�� ��� 
//		int result3 = i > 0 ? 1 : (i==0 ? 0 : -1);
		System.out.println(result2);
		
		
		// ���Կ����� = op=
		// ���Կ����ڴ� �����ڵ��߿��� ���� ���� �켱����, ��-�� ������� 
		/*
		 * ���մ��Կ����� op=
		 * --> �ٸ� ������(op)�� �����Ͽ� ���
		 * 
		 */
		
		int i3 = 4;
		System.out.println(i3 += 5);
		System.out.println(i3 -= 5);
		System.out.println(i3 *= 5);
		System.out.println(i3 /= 5);
		System.out.println(i3 += 1);
		System.out.println(i3++);
		System.out.println(i3);
		
		String str = "ABCD";
		str += "�����ٶ�";
		str += "1234";
		System.out.println(str);
				
				
	}
}
