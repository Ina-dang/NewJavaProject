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
	
	
	Student(String n, String n1, int k, int e, int m){ //������
			no = n;
			name = n1;
			kor = k;
			eng = e;
			math = m;

// sum, avg ���ɳ�
		}
}
