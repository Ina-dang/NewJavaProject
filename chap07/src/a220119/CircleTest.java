package a220119;

class Point { //Point class ���赵 
	int x;
	int y;
	
	Point(){}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle1{
	int x; //x ��ǥ
	int y; //y ��ǥ
	int r; //������
}

class Circle{

	Point c; // Point Ÿ�� ���������� => ���԰����� �θ�
	
	int r;
	Circle(){}
	Circle(int x, int y, int r){
		c = new Point(x,y); //���԰���
		c.x    = x;
		c.y    = y;
		this.r = r;
	}
}

public class CircleTest {
	public static void main(String[] args) {
		//Circle Ÿ���� �ν��Ͻ� ��ü ����
		Circle circle = new Circle(10,20,30);
			//�����ڸ� ����ؼ� 3���� int Ÿ�� �ް� ���� (������ ���ϴ� Ŭ�����ȿ� ����)
		
		//�� ���� x��ǥ��?? y��ǥ��?? ��������??�Դϴ� ���
		System.out.printf("�� ���� x��ǥ�� %s y��ǥ�� %s �������� %s �Դϴ�.", circle.c.x, circle.c.y, circle.r);
	}


}
