package a220118;
public class VariableEx {
	
	public VariableEx(){ //������ ��� �θ�
		// �Ű�����
		// ���Ͼ���
		// ������ �̸��� Ŭ�����̸��� ���ƾ��Ѵ�
	}
	
	static int i = 100; //Ŭ���� ���� i 
//	int i = 1000; ���⼭�� �ȵǴµ�
	public static void main(String[] args) { //�����ε��� �޼��� ��������
		int i =1000; //���⼭�� ��������
//		������� �������� �̸� ���� �� �ִµ� �׷� ��쿡�� �޼��� ���� ������������
		System.out.println(i);
		System.out.println(VariableEx.i);
		System.out.println("=================");
//		void run() {
//		
//		} �ޤļ��� �������� �޼��� ����ȵ�. Ŭ���������� ��
		
		Integer[] arr = {5, 10, 15};
		System.out.println(add(arr));
		
		//�̰� Integer...a
		System.out.println(add(1,2,3,4));
		System.out.println(add(10, 20, 30));
		
		// ������ : �ν��Ͻ��� ������ �� ȣ��Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���'
		// new Ŭ������() ==> �ν��Ͻ� ȣ��
		// �޼����() ==>�޼���ȣ��
		// ������ new�� �ν��Ͻ��� �����ϴ� ������ �����ڰ� �ν��Ͻ��� �����ϴ� ���� �ƴϴ�.
		
		
	}
	
	void run() {
		
	}
	
	//�������� Ȱ��
	
//	static int add(Integer[] a) { //�̷��� ��¥ �迭 ���� add(����)�Ѱ� ����
//		//����Ŭ���� 
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		return sum;
//	}
	
	//�������� �޼��� ���ǻ���
//	static int add(String str, Integer... a) { //�̰͵� �����ϱ��ѵ�
		//����Ŭ���� �׻� �������� �;���. �߰� �Ķ���� ���� �������� 
	static int add(Integer... a) { //�Ű����� �ֱ�
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
}
