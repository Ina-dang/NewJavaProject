package a220119;

public class Prev {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();

	System.out.println(parent.age);
	System.out.println(child.age);

//	System.out.println(parent.name);//�̰Ǿȵ�
	System.out.println(child.name);
	
	GrandChild grandChild = new GrandChild();
	System.out.println(grandChild.age);
	System.out.println(grandChild.name);
	}
}

class Parent {
	int age;
}

// Child & Child2 ���� ���������� �߰��ؾ��� ���(��������� �޼���)�� �ִٸ� ������ Parent�� �߰��ϴ°� ����

class Child extends Parent{
	String name;
}

class Child2 extends Parent{
	//Child2�� ���� �� �ִ� �ʵ��� ���� 1�� (ParentŬ���� int age;)
}

class GrandChild extends Child{
//	indirect superclass : Child
//	direct superclass	: Parent
	
	//Parent���� ����� extends������ �������� 
	
}
