package studentEx;

class Student {
	//����
	int sum() {
		return kor + eng + math;
	}
	//���
	double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}
	
	// �й�, �̸�, ����, ����, ����
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	Student(){ //������
	
	}
}
