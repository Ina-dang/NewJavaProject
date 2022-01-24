package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		
		shapes[0] = new Circle();
		shapes[1] = new Square();
		shapes[2] = new Triangle();
		shapes[3] = new Pringles();
		shapes[4] = new Hexahedron();
		shapes[5] = new TriangularPrism();
		
		System.out.println(shapes[5]);
		
	}
}

interface perimeterable {void perimeter (int a, int b);}
interface areable {final double a = 3.14;}

class Shape {
	int x; //x��
	int y; //y��
	double PI = 3.14;
	
	public Shape() {}
	
}

class Circle extends Shape {

	public Circle() {}
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	
}

class Square extends Shape {
	public Square() {
		// TODO Auto-generated constructor stub
	}
}
class Triangle extends Shape {
	public Triangle() {
		// TODO Auto-generated constructor stub
	}
}
class Pringles extends Shape {
	public Pringles() {
		// TODO Auto-generated constructor stub
	}
}
class Hexahedron extends Shape {
	public Hexahedron() {
		// TODO Auto-generated constructor stub
	}
}
class TriangularPrism extends Shape {
	public TriangularPrism() {
		// TODO Auto-generated constructor stub
	}
}


//shape : ����
// ���� Ŭ���� ���� ( 2���� ����, 3���� ���� )
// 2�������� : ��, �簢��, �����ﰢ��
//		��� : �ѷ�, ���̰� ���

// 3�������� : �����, ����ü, �ﰢ��� 
//		��� : �ѳ���, ���� ���

//���������� 
/*
 * 
 * Shape[] shapes = new Shape[6];
 * �� ������ 
 * shapes[0] = new Circle(5);
 * �̷������� ��Ŭ�� ���������鰨
 * 
 */

// ������ ������ �߻�Ŭ����, �������̽� �� �Ἥ �����
// ������ ã�Ƽ� ��� ����°ǰ�?

