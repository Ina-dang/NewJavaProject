package studentEx;

class Student1 {//���赵
	
	//ava ctr mtd ����
	
	// �й�, �̸�, ����, ����, ����
	String no;
	String name;
	int kor;
	int eng;
	int math;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	
	public Student1(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Student1(String no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//����
	int sum() {
		return kor + eng + math;
	}
	//���
	double avg() {
		return (int)(sum() / 3d * 100) / 100d;
	}
	
	//��ȸ ��ºκ�
	public String toString() {
		String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
		
		return String.format("%s \t %s\t  %d\t %d\t %d\t %d\t %s", no, name, kor, eng, math, sum(), avg());
	}
	
	//���� ��ºκ� ������ ����
	
	
}
