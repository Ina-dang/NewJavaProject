package domain;

import java.util.Arrays;

// Ŭ���� ���赵 �׸��� �������� �ν��Ͻ��� ���ٴ� �� ����ϰ� �ν��Ͻ��� ���߿� ���� �ڸ��� this�� ����

// ���� copy 
// ���� clone : ���δٸ� �ν��Ͻ� �ּҸ� ���� �ּҴ� �ٸ����� ���� �ν��Ͻ� ������ ���� ����

public class Student {
	// �й�, �̸�, ����, ����, ����
	
	public String no; 
	public String name;
	public int kor;               //==> int kor = 1; ������ʱ�ȭ  
	public int eng;
	public int math;
	
	{
		//�ν��Ͻ��ʱ�ȭ
		//�ַλ����ڻ��
	}
	
	static {
		//Ŭ�����ʱ�ȭ
		//��� �������ڿ��� �������� ����ž� �ϴ� �ڵ� ������ ���
	}
	
	
	
	//������ ���� : �ν��Ͻ� �ʱ�ȭ
	// �ν��Ͻ� �ʱ�ȭ �۾��� �䱸�Ǿ������ʴ´ٸ� �� ���� ���� �Է��ؾ��� => �ڵ� ������ �����
	// ������ ���� ���� : �ʵ� -> ������(���ڰ� ���� �⺻������) -> �޼���
	
	//������ 
//	Student(){}
//		
//	Student(String String, String String2, int k, int e, int m){
//		no = String;
//		name = String2;
//		kor = k;
//		eng = e;
//		math = m;
//	}
	
	// ���� ó�� ���� ��ȣ String no��� ������ ���� �ٸ��� ����Ű�Եȴ�
	// 
	public Student() {
	}

	
	public Student(String no, String name, int kor, int eng, int math){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	
	//
	
	//����, ���
	int sum() {
		//�Է°��� ������θ� ���� kor, eng, math�� �����
		//�ν��Ͻ� ���� �������� ���Ѿ��� ���� �ִ�
		// this.kor���� ������ϴµ� this�ν��Ͻ� ��� �˾Ƽ� ��ü�̸�.sum ȣ���ؼ� �������� 
		return kor + eng + math;
		
	}
	// sum ������ ���� = ���� �ν��Ͻ� ������ �̷������ ����
	
	double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}
	
	public String toString() { //format���� �ϴ°� ���� ����
		String str = no + "    "+ name + "    " + kor + "    " + eng + "    " + math +
				"    " + sum() + "    " + avg() ; 

		return str;
	}
	
	
	//������ �޼��� 
	public static void main(String[] args) {
	
	 Student student = new Student("220005", "��浿", 90, 80, 70);
	 System.out.println(student);
	}
}
