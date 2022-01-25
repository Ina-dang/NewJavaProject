package cylinder;

import shape.Shape;
import circle.Circle;
import shape.D3;

public class Cylinder extends Shape implements D3 { 
	//class Cylinder extends Shape3D { 
		//������� 2���� ������ �������ִ� ����. �׷��ϱ� ���� �������־����
		//��� ����Ŭ���� ���������� ��ӹ������� ��� ��� 

		private Circle circle;

		public Cylinder(int r, int z) { //������, z�� ���̰�
			super(z); //��������������� �ν��Ͻ�����
			circle = new Circle(r); //��Ŭ�� ����� ���� �ν��Ͻ�����

		}
		
		@Override
		public double getVolume() {
			return circle.getArea() * getI();
		}

		@Override
		public double getArea() {
			return circle.getArea() * 2 + circle.getCircum() * getI();
		}	
	}