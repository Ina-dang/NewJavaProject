package service;

import static utils.StudentUtil.*;
import static domain.Student.*;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import app.StudentEx;
import domain.Student;

class StudentService1 {
	
	//�л�������
	Student[] students = new Student[10];

	
	int cnt; //���� �л� �ο���
	
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	
	public StudentService1() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
			cnt++;
		}
	}
	
	int getScore() {
		return (int)(Math.random()*41)+60;
	}
	
	//��ȸ
	void list() {
		System.out.println("�й�\t  �̸�\t  ����\t ����\t ����\t ����\t ���");
		System.out.println("======================================================");
		for (int i = 0; i < cnt; i++) {
				System.out.println(students[i]); // �� �ּҰ��� toString�� ����� ���ڿ��� ��ȯ
		}


	}
	
	//���
	void register() { 
		
		students[cnt++] = new Student(nextLine("�й�>"), nextLine("�̸�"), nextInt("����"), 
				nextInt("����"), nextInt("����") );

	}
	//��Ϻκ� ��
	Student student = new Student();
	
	//����
	public void modify() {
		//�й����� �л��� Ž�� �� �л� ������ �� �̸� , ���� ����
		System.out.println("������ �л��� �й� >> ");
		String no = StudentEx.scanner.nextLine(); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals Ȯ��
				System.out.println(students[i]);
				System.out.print("�̸�>");
				String name = StudentEx.scanner.nextLine();
				System.out.print("����>");
				int kor = Integer.parseInt(StudentEx.scanner.nextLine());
				System.out.print("����>");
				int eng = Integer.parseInt(StudentEx.scanner.nextLine());
				System.out.print("����>");
				int math = Integer.parseInt(StudentEx.scanner.nextLine());
				students[i].getName = name;
				students[i].getKor = kor;
				students[i].getEng = eng;
				students[i].getMath = math;
			}
		}
	}//modify ��
	
	//����
	boolean flag = false;
	
	public void delete() {
		System.out.println("������ �л��� �й� >>");
		String no = StudentEx.scanner.nextLine(); 
		for (int i = 0; i < cnt; i++) {
			if (students[i].getNo().equals(no)) { //equals Ȯ��
				System.out.println( getName() + "�� �����մϴ�");
				for (int j = 0; j < cnt-1; j++) {
					students[j] = students[j+1]; 
				}
				cnt--;
				flag = true;
				break;
			}
		}
	
	}
}
