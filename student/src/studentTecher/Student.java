package studentTecher;

//
public class Student {
	// �й�, �̸�, ����, ����, ����
	
	String no; 
	String name;
	int kor;
	int eng;
	int math;
	
//	static String schoolName = "�޸��ʵ��б�"; //���� �л��� �̸��� �ٲ����� �б� �̸��� �ȹٲ�ϱ� static
	
	Student(Student stu){
		no = stu.no;
		name = stu.name;
		kor = stu.kor;
		eng = stu.eng;
		math = stu.math;		
	}
	
	Student(String no, String name, int kor, int eng, int math){
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	} 
	//������ �ʿ��� ��� ���������� ������ ==> �� 
	//this.no �ν��Ͻ� ����
	//no 	  �Ű������� ���ǵ� ��������
	
	
	
	
	//����, ���
	int sum() {
		//�Է°��� ������θ� ���� kor, eng, math�� �����
		//�ν��Ͻ� ���� �������� ���Ѿ��� ���� �ִ�
		return kor + eng + math;
		
	}
	// sum ������ ���� = ���� �ν��Ͻ� ������ �̷������ ����
	
	double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}
	
}
