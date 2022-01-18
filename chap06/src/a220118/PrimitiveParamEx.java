package a220118;

class Data { int x; }

class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change (d.x)");
		System.out.println("main() : x = " + d.x);
	
//		change�޼����� �Ű������� �������̶� ���̾ƴ� ���� ����� �ּҸ� change�޼��忡�� �Ѱ��־ �����氡��
		change(d); 
		System.out.println("After change (d)");
		System.out.println("main() : d.x = " + d.x);
	}
	
	//�⺻�ڷ��� int
	static void change(int x) {
		x = 100;
		System.out.println("change() : x = " + x);	
		
	}	
	//�����ڷ��� Data
	static void change(Data d) { //change�޼��� ȣ�� �Ŀ� d.x�� ���� ����� ����
		d.x = 1000;
		System.out.println("change() : d.x = " + d.x);		
	}	
//	//�����ڷ��� Data
//	static void change(Data data) { //change�޼��� ȣ�� �Ŀ� d.x�� ���� ����� ����
//		data.x = 1000;
//		System.out.println("change() : d.x = " + d.x);		
//	}	
}
