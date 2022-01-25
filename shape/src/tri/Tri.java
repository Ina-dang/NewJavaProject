package tri;

import shape.Shape;
import shape.D2;

public class Tri extends Shape implements D2 {
	private int x;
	public Tri(int x, int y) { //��� x�� ���̴ϱ� 2�����ʿ�
		super(y);
		this.x = x;
	}
	
	@Override
	public double getCircum() {
		return Math.sqrt(getI()*getI() + x*x) + getI() ;
				//���������ϱ� geti���� x������ ��Ʈ����
	}
	@Override
	public double getArea() {
		return getI() * x / 2d;
		//getI�� ���� y�� ���̰�����
	}	
}
