package a220118;

public class WhatIsThis {
	public static void main(String[] args) {
		WhatIsThis isThis = new WhatIsThis(); //�ν��Ͻ� ����
		//�ν��Ͻ����� �ּҰ� ����
		System.out.println(isThis); //�� �� �� ���� �ּҰ����
		isThis.printWhatIsThis();
		System.out.println(isThis.getWhatIsThis());
	}
	
	WhatIsThis getWhatIsThis() {//This �����ϰ� ����Ÿ�� Ŭ����
		return this; //�̷��� ������ ��ü
	}
	
	void printWhatIsThis() { //void�ϱ� ���� ���� ����.
		System.out.println(this);
	}
//	static void sm() {
//		System.out.println(this); //Ŭ���� ���������� this�ȵ�
//	}
}
