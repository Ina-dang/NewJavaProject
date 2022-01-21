package domain;

//import java.util.Arrays;
// Ŭ���� ���赵 �׸��� �������� �ν��Ͻ��� ���ٴ� �� ����ϰ� �ν��Ͻ��� ���߿� ���� �ڸ��� this�� ����

public class Student {
	
	private String no; 
	private String name;
	private int kor;             
	private int eng;
	private int math;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getNo() {return no;}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {return name;}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {return kor;}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {return eng;}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {return math;}

	public void setMath(int math) {
		this.math = math;
	}

	//����, ���
	
	public int sum() {
		return this.kor + this.eng + this.math;
	}

	public double avg() {
		return (int)(sum() / 3d * 100) /100d;
	}

	public String toString() { //format���� �ϴ°� ���� ����
		String str = no + "    "+ name + "    " + kor + "    " + eng + "    " + math +
				"    " + sum() + "    " + avg() ; 

		return str;
	}
}
