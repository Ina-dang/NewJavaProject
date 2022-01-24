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
	int x; //x값
	int y; //y값
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


//shape : 도형
// 하위 클래스 제작 ( 2차원 도형, 3차원 도형 )
// 2차원도형 : 원, 사각형, 직각삼각형
//		기능 : 둘레, 넓이값 계산

// 3차원도형 : 원기둥, 육면체, 삼각기둥 
//		기능 : 겉넓이, 부피 계산

//최종적으로 
/*
 * 
 * Shape[] shapes = new Shape[6];
 * 이 각각에 
 * shapes[0] = new Circle(5);
 * 이런식으로 써클은 반지름값들감
 * 
 */

// 적절한 형태의 추상클래스, 인터페이스 다 써서 만들기
// 공통점 찾아서 상속 만드는건가?

