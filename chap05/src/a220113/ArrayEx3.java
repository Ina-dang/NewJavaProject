package a220113;

public class ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; //���� 1,2,3,4,5�� �ʱ�ȭ
		}	
			System.out.println("[������]");
			System.out.println("arr.length:" + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
			//��������ϸ� arr[4]:5���� ���
		}
		
		int[] tmp = new int[arr.length*2]; //�ӽ� �迭 -> �����迭 *2 ����
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //������ �� �ѹ� ��ȯ
		}
		arr = tmp; //tmp�� ����� ���� arr�� �����Ѵ�. (���)
	
		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length); //arr�� ȣ�������� �ּҰ� tmp�� �Ǿ������Ƿ� 10ĭ�� ���´�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		//�ѹ� �� �Ҷ��� int �� ���� ����. �ߺ����� ������
			tmp = new int[arr.length*2]; //�ӽ� �迭 -> �����迭 *2 ����
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //������ �� �ѹ� ��ȯ
		}
		arr = tmp; //tmp�� ����� ���� arr�� �����Ѵ�. (���)
		
		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length); //arr�� ȣ�������� �ּҰ� tmp�� �Ǿ������Ƿ� 10ĭ�� ���´�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		
		System.out.println("==============");
		//�迭�� ���� for���� arraycopy()�� �ٲ㺸��
//		System.arraycopy(src, srcPos, dest, destPos, length);;
		/*
		 * src     : �ҽ� (����) . ��������
		 * srcPos  : �ҽ�������
		 * dest    : Ÿ��. ���. ������
		 * destPos : ������ġ
		 * length  : ����
		 */
		
		tmp = new int[arr.length*2]; //�ӽ� �迭 -> �����迭 *2 ����
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i]; //������ �� �ѹ� ��ȯ
		}
		arr = tmp; //tmp�� ����� ���� arr�� �����Ѵ�. (���)
		
		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length); //arr�� ȣ�������� �ּҰ� tmp�� �Ǿ������Ƿ� 10ĭ�� ���´�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:" + arr[i]);
		}
		
	}
}
