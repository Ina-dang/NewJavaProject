package a220112;

public class ArrayPrac {
	public static void main(String[] args) {
		int [] arr = new int [5];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (i + 1) * 4;
			System.out.println(arr[i]);
		}
		/*
		 * .
		 * .
		 * . �迭 ���� ������ 5������ ���ʿ��ϰԵ�
		 * . �� ����Ͽ� ó������ �˳��ϰ� �����
		 * .
		 * 
		 */
		int [] tmp = new int[arr.length*2]; // ���� �迭���� ���̰� 2���� �迭 ����
		
		for(int i = 0; i < tmp.length; i++) {
			tmp[i] = arr[i]; // arr[i]�� �� (i + 1) * 4 �� tmp[i]�� ����
							
//		tmp = arr; // �ּ� ������ tmp �� �ٲ� åó�� ���� �����ȵǴµ�..?
		arr = tmp;
		
		System.out.println(tmp[i]);
		// arr �迭�� �� �̻� ����� �� ���� JVM������ �÷��Ϳ� ���ؼ� �ڵ������� �޸𸮿��� ���ŵȴ�
		}			
	}
}
