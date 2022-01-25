package shape1;
import circle.*;
import shape.*;
import tri.*;
import cylinder.*;
import prizm.*;


public class ShapeTest {
	public static void main(String[] args) {
//		//�� ���Ȯ��
//		Circle circle = new Circle(3);
//		circle.getArea();
//		circle.getCircum();
//		System.out.println(circle.getArea());
//		System.out.println(circle.getCircum());
//		
//		//�ﰢ�� ���Ȯ��
//		Tri tri = new Tri(3,4);
//		tri.getArea();
//		tri.getCircum();
//		System.out.println(tri.getArea());
//		System.out.println(tri.getCircum());
//		
//		//����� ���Ȯ��
//		Cylinder cylinder = new Cylinder(3, 4);
//		System.out.println(cylinder.getArea());
//		System.out.println(cylinder.getVolume());
//		
//		//�ﰢ�� ���Ȯ��
//		Prizm prizm = new Prizm(3, 4, 5);
//		System.out.println(prizm.getArea());
//		System.out.println(prizm.getVolume());
//		
//		circle.setR(5);
//		System.out.println(circle.getR());
//		System.out.println(circle.getArea());
//		System.out.println(circle.getCircum());
		
		Shape[] shapes = new Shape[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Tri(3,4);
		shapes[2] = new Cylinder(3,4);
		shapes[3] = new Prizm(3,4,5);
		
		for (Shape s : shapes) {
			System.out.println(s.getClass().getSimpleName() + "�� ���̴�" + s.getArea());
			if(s instanceof D2) {
				System.out.println(s.getClass().getSimpleName() + "�� �ѷ���" + ((D2)s).getCircum());
			}
			if(s instanceof D3) {
				System.out.println(s.getClass().getSimpleName() + "�� �ѷ���" + ((D3)s).getVolume());
			}
		}
	}
}
//shape : ���� ���� Ŭ���� ���� ( 2���� ����, 3���� ���� )
//2�������� : ��, �簢��, �����ﰢ�� >> ��� : �ѷ�, ���̰� ���
/* �� : r(������ �ϳ��� �ѷ� ���� ���� �� ����)
 * ���簢�� : x, y ������ �ѷ� ���� ���� �� ����
 * �����ﰢ�� : x, y 
 * 
 * �ʿ��� �ʵ尹�� ã���� ��
 * �� ��Ʈ�ϱ� �׷��� ������ ��Ʈ�ϳ��� �ǰڳ�? ��� �������� ������
 * 
 * ���������ڱ��� �˴� ����ҰŴ� 
 * 
 */

//3�������� : �����, ����ü, �ﰢ���	��� : �ѳ���, ���� ���
/*
 * 
 */


//3���� 2���� ���� �������� ã�ƾ���
// �������̶��ϸ� ���� ���ϱ� �ƴѰ�
// ���� ������� ����� ���� �����Ұǰ� 
//����������� ����̾ƴ϶� has �� ���԰����

//������ ������ �߻�Ŭ����, �������̽� �� �Ἥ �����
//������ ã�Ƽ� ��� ����°ǰ�?