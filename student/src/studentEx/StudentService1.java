package studentEx;

import static utils.StudentUtil.*;

import app.StudentEx;

class StudentService1 {
	
	//�л�������
	Student1[] students = new Student1[10];

	
	int cnt; //���� �л� �ο���
	
	String[] names = {"��溸", "�赿��", "�����", "�����", "�迹��", "��ġ��", "������"};
	
	
	public StudentService1() { //��Ʃ��Ʈ���� ������
		for (int i = 0; i < names.length; i++) {
			students[cnt] = new Student1(220000 + cnt + 1 + "", names[cnt], getScore(), getScore(), getScore());
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
		
		students[cnt++] = new Student1(nextLine("�й�>"), nextLine("�̸�"), nextInt("����"), 
				nextInt("����"), nextInt("����") );

	}
	//��Ϻκ� ��
	
	
	//����
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
	
	//����

}
