package a220124;

import java.util.Arrays;
import java.util.Comparator;

public class InnerTest {
	public static void main(String[] args) {
		// �ν��Ͻ� Ŭ����
		// static Ŭ����
		// ���� Ŭ����
		// �͸� Ŭ����
		
		//����Ŭ����
		class Local {
			
		}
		// �ν��Ͻ� ������ �ν��Ͻ��� �����ؾ��Ѵ�
		Inner inner = new InnerTest().new Inner(); //�̷�������
		Outer.Inner inner2 = new Outer().new Inner(); 
		Outer.Sinner inSinner = new Outer.Sinner(); //Outer.Sinner�� Ŭ��
		
		//����
		Integer[] arr = {3, 5, 2, 1, 4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o1;
			}		
		});
		System.out.println(Arrays.toString(arr));
	} 
	
	
	int i;
//	��� �ּ�ó���ϸ� Inner ineer =��¼�� ������ == �ٸ� Ŭ�����϶��� ���� �����
//		Outer.Inner inner2 = new Outer().new Inner(); �� �ؾߵ�

	//�ν��Ͻ�Ŭ����
	class Inner {
		//InterTestŬ�����ؿ� ����� ��
		
	}
	
	//static Ŭ����
	static class Sinner {
		
	}
	
}

class Outer {
//�ν��Ͻ�Ŭ����
	class Inner {
		//InterTestŬ�����ؿ� ����� ��
		
	}
	
//static Ŭ����
	static class Sinner {
		
	}
	
}
