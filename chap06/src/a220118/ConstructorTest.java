package a220118;

class Data1{
	int value;
}

class Data2{
	int value;
	
//	Data2(){
//		//�����ε� �ϸ� complie error �����
//	}
	
	Data2(int x){
		value = x;
	}
	
}

public class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1(); //�����ڴ� new�� ���ؼ� ȣ��. �迭���� �ϴ� �����ڶ�� �����ϼ�
		System.out.println(d1);
//		Data2 d2 = new Data2(); //compile error ����
		Data2 data2_2 = new Data2(5);
		
		String str = new String();
		System.out.println(str); //�ƹ��͵��ȳ���
		String str2 = new String("abcd");
		System.out.println(str2);
		String str3 = new String(new char[] {'a', 'b', 'c', 'd'});
		System.out.println(str3);
	}
}
