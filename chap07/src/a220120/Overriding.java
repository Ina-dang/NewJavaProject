package a220120;

public class Overriding {
  //����Ŭ�����κ��� ��ӹ��� �޼����� ������ �����ϴ°�
// Ŭ���� �޼��� x �ν��Ͻ� �޼��忡��������
	class Point{ 
		int x;
		int y;
		
		String getLocation() {
			return "x : " + x + ",y : " + y;
		}
	}
	class Point3D extends Point{
		int z;

		
		String getLocation() {
			return super.getLocation() + ", z : " + z; //������ �޼��� ȣ��
//			return "x : " + x + ",y : " + y + ", z : " + z;
		}
	}
	
	//////////////////
	
	class Parent {
		void parentMethod() {}
	}
	
	class Child extends Parent {
		void perentMethod() {} //�������̵�
		void parentMethod(int i) {} // �����ε�
		
		void childMethod() {}	// ��������
		void ChildMethod(int i) {} // ���ǵȰ� �����ε�
//		void childMethod() {}	// �ߺ����Ƕ� ������
		
	}	
}
