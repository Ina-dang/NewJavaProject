package studentTecher;

import java.util.Arrays;

// Ŭ���� ���赵 �׸��� �������� �ν��Ͻ��� ���ٴ� �� ����ϰ� �ν��Ͻ��� ���߿� ���� �ڸ��� this�� ����

// ���� copy 
// ���� clone : ���δٸ� �ν��Ͻ� �ּҸ� ���� �ּҴ� �ٸ����� ���� �ν��Ͻ� ������ ���� ����

public class Student {
	// �й�, �̸�, ����, ����, ����
	
	String no; 
	String name;
	int kor;               //==> int kor = 1; ������ʱ�ȭ  
	int eng;
	int math;
	
	{
		//�ν��Ͻ��ʱ�ȭ
		//�ַλ����ڻ��
	}
	
	static {
		//Ŭ�����ʱ�ȭ
		//��� �������ڿ��� �������� ����ž� �ϴ� �ڵ� ������ ���
	}
	
	
	
	
	
//	static String schoolName = "�޸��ʵ��б�"; //���� �л��� �̸��� �ٲ����� �б� �̸��� �ȹٲ�ϱ� static
	
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
		this("220003", "ȥ�海", 80, 40, 30);
	}
	
	public Student(int kor, int eng, int math){
		this("220003", "ȥ�海", 80, 40, 30);
	}
	
	public Student(String no, String name){
		this(70,70,70);
		this.no = no;
		this.name = name;
	}
	
	Student(String no, String name, int kor, int eng, int math){
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
	
	//������ �޼��� 
//	Student student2 = new Student("220002", "��浿", 80, 70, 50);
	public static void main(String[] args) {
		Student student2 = new Student("220003", "ȥ�海", 80, 40, 30);
		Student student3 = new Student(80, 90, 90);
		System.out.println(student2.no + "\t\t" + student2.name + "\t\t" + student2.kor + "\t" + student2.eng + "\t" + student2.math);
		System.out.println(student3.no);
		System.out.println(student3.name);
		System.out.println(student3.kor);
	
	
	int[] arr1 = {3,4,5,6};
	int[] arr2 = arr1; // ����
	int[] arr3 = arr1.clone(); // ����
	System.out.println(Arrays.toString(arr2));
	
//	Student student5= student3.clone(); //����Ʈ �ȵȴٰ� ������
//	Student student5 = (Student)student3.clone(); //����Ʈ �ȵȴٰ� �ٸ�������
	
	}
}
