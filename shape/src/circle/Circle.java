package circle;

import shape.Shape;
import shape.D2;

public class Circle extends Shape implements D2 {
//get I �� ������Ʈ�� �����

		 //���� �����ڰ� �ƹ��͵� ���ǵǾ��������� �⺻�����ڸ� ���� �׷��⶧���� �굵 �߰������� ȣ��������� 
			// ��Ŭ�� ���õȰ� ���ۿ���
			public Circle(int r) { //int i�̸��ٸ����ذ�
				super(r); //��Ŭ���� r ��û
			}	

		//���������� �����ؾ���
			@Override
			public double getCircum() {
				return 2 * Math.PI * getI();
			}

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return getI() * getI() * Math.PI;
			}
			
	//��Ŭ���� ������ �������Ϸ��� ���� �� �Է��ϸ��
	public void setR ( int r) {
		setI(r);
	}
	public int getR() {
		return getI();
	}
}

