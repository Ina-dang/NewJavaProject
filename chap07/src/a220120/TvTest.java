package a220120;

import java.util.Scanner;

class Tv {
								
	private String color;						// ����					==> null 			 (����ü)
	private boolean power;						// ��������(on/off)		==> false		=====������ �������
	private int channel;						// ä��					==> 0
	
	// Tv�� ���(�޼���)
	public void setPower() {power = !power;}		// TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() {++channel;}		// TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() {--channel;}		// TV�� ä���� ���ߴ� ����� �ϴ� �޼���
	
	public void  setColor(String color) {
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public boolean isPower() {
		return power;
	}
	
	
} 

public class TvTest { //����� �޼��尡 �ִ³༮���� ���� �ؾ� �����۵� 
	public static void main(String[] args) {
		int[] arr = new int[3];
		Scanner scanner = new Scanner(System.in);
		Tv t = new Tv();					// TV�ν��Ͻ� ����
		
		System.out.println(t); //�ּ����
		// . ~��
//		t.channel = 7;	
		t.setChannel(7);
		t.channelUp();				// TV�ν��Ͻ��� �޼��� channelDown()�� ȣ���Ѵ�
		System.out.println("���� ä���� " + t.getChannel() + " �Դϴ�.");
		
	}
}
