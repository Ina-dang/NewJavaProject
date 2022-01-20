package service;

import static utils.StudentUtil.*;

import app.StudentEx;
import domain.Student;

public class StudentService {
	
	// 01/17 : Student �ʵ� ����, main �޼��� �޴� ����
	// 01/18 : ������ �ۼ�, ��ȸ���, ��ϱ�� ����
	// 01/19 : toString����, ������� ����
	// 01/20 : ��Ű�� �и�, 
//			Student : student.domain������
//			StudentEx : student.app�� ����
//			StudentService : student.service�� ����
//			StudentUtil : student.utils�� ����
//						, ��� �ʵ忡 private ���� (get,set), ���� ��� ����
	
	//��ü�迭 �ν��Ͻ����� 
	Student[] students = new Student[10]; //�л��� ����
	
	//220119 �߰�
	int cnt; // ��ƮŸ�� ī��Ʈ. ���⿡ �����л��ο��� ������
		//�̰� ������ ����
	
	
	//�л� ������ ���⿡ �� ����
	
//	�� �̰� ���������	
	// Student ��ü�� �̹� �����ڷ���
	// []�迭 �� �����ڷ���
	// �����ڷ����� �����ߴ�
	
	// ��� ���ڿ� �迭�� ���� �����̱��ѵ� String[] �Ѵܰ� ����� String �⺻���� �Ǵµ� ���� ���� ���ܵ� ����
	// ŷ����
	
	/*
	 * ��� public Ŭ���������� ��� ����
	 * 
	 * �ǹؿ� main ���� �����Ұ�
	 */
	

	//220119 �߰�
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	//���� 220119 �й� �� �ٸ��� �ٽ� ����
	//�ʱ�ȭ�� ��Ʃ��Ʈ cnt�� �������� + �����־ ���� �� �� �ٸ��� ����Ұ� 60~100���̷�
	
	public StudentService() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		} //for���� �׻� �ż��� ���� �־���ϰ�, print�� �޼��� ���뿡 �־���� 
	}	  // ,but {}��ó�� ���ָ� ������ ���η� �νĵż� ����
	
	
//	students[cnt++] = new Student("220001", "��浿", 80, 80, 80); //���� �̷��� �����
//	students[cnt++] = new Student("220002", "�̱浿", getScore(), getScore(), getScore());
//	students[cnt++] = new Student(220000 + cnt + 1 + "", "��浿", getScore(), getScore(), getScore()); 
	
	//220119 �߰�  �������� �߰��ؼ� ���� ������ ���ʱ�ȭ
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	
	

	// 1. ��ȸ
	//��� �޼���� void�� �ؼ� ���Ͼ���
	public void list() {
		//���� �� �л������ͷ� ��ȸ��� ����
		System.out.println("�й�\t   �̸�\t   ����\t  ����\t����  ����   ���");
		System.out.println("========================================================");
		for (int i = 0; i < cnt; i++) { //�ν��Ͻ� �޼��峢�� �� Ŭ���� �Ⱥ���
			
//	220119		// toString ����ؼ� �����ϼ� 
			System.out.println(students[i]);
		}
	}//void list() ��
	
	
	
	// 2. ���
	public void register() { //�ڵ����� ���ϰ� o, �����ڴ� ���ϰ��� ����

		//��ϱ�� ����
		
		//��� ���� �޾Ƽ� � �������� ������ ������ Ȯ���ϰ� ���ؾ� ��
		//���������� �Է¹��� �ν��Ͻ��� public class Student ��������
		// �� �л��� students �� �����ؾ���
		// ���°��ġ��? 
		
		/* �ؾ��� ����
		 * 1. ������ �Է¹ޱ� ==> Scanner Ŭ���� instance�� �Է��� ����
		 * ��ĳ�ʸ� Ŭ���� ������ �س�����
		 * StudentEx.scanner.nextLine();�� �ؿ� �� �ִ�
		 * 2. �Է¹��� �����͸� Student Ÿ���� �ν��Ͻ��� ����
		 * 3. students �迭�� null ��ġ�� ����
		 */
		
		//1 ������ �Է¹ޱ�
//		System.out.print("�й�>");
//		String no = StudentEx.scanner.nextLine();
		
		//2 �Է¹��� �����͸� �л�Ÿ���� �ν��Ͻ��� ���� ==> 1�� �Է� ���ؾ��Ѵ�
		students[cnt++] = new Student(nextLine("�й�> "), nextLine("�̸�> "), nextInt("����>"), 
										nextInt("����>"), nextInt("����>") );
		
//220119		//3 students �迭�� cnt��ġ�� ����
//		students[cnt++] = student;
		//3 students �迭�� null��ġ�� ����

	}
	
	// 3. ����
	public void modify() {
		//�й����� �л��� Ž�� �� �л� ������ �� �̸� , ���� ����
		System.out.println("������ �л��� �й� >> ");
		String no = StudentEx.scanner.nextLine(); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].no.equals(no)) { //equals Ȯ��
				System.out.println(students[i]);
				System.out.print("�̸�>");
				String name = StudentEx.scanner.nextLine();
				System.out.print("����>");
				int kor = Integer.parseInt(StudentEx.scanner.nextLine());
				System.out.print("����>");
				int eng = Integer.parseInt(StudentEx.scanner.nextLine());
				System.out.print("����>");
				int math = Integer.parseInt(StudentEx.scanner.nextLine());
				students[i].name = name;
				students[i].kor = kor;
				students[i].eng = eng;
				students[i].math = math;
			}
		}
	}//modify ��
	
	
	
	// 4. ����
	

	////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		/*
		 * 
		 * ���� �ִ� students�� 
		 * new�� ���� �ν��Ͻ� �����Ұ���
		 */
		
		
		//�ٵ� ��ġ ����� �ߺ�����. ���� �ִ°� studentService��
		StudentService service = new StudentService(); //�̰� �����ؾ��� students[i]��밡��
//		System.out.println(service.students[]);
		
		
// 		�ʱ�ȭ ��Ŵ
//		service.students[0] = new Student("220002", "��浿", 70, 60, 50);
		//�ʱ�ȭ �Ƚ�Ű��.no �ϸ� nullpointexception��
	
		
//		//��ȸ��ɱ���
//		for (int i = 0; i < service.students.length; i++) {
//			System.out.println(service.students[i]);
//		}
		
//		System.out.println(service.students[0].no); //������ ȣ��� 
//		service.students[0] ==> ���� Student
		
		service.list();
		
		
		
		// StudentServiceŬ������ Student[]�迭Ÿ���̴�
		// service.students�� Ÿ�� = Student[] �迭Ÿ��
		
		
	}
}
