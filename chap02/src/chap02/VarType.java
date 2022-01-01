package chap02;

public class VarType {
	public static void main(String[] args) { //참조변수 args의 파일 string[]
	//변수의 앞에 들어오는 파일은 대문자로 시작
/*
 * long l = 10 ; 기본형변수
 * Long l2= new Long(20) ; 참조형변수-> 반드시 앞에 type이 오고 첫글자가 대문자
 * VarEx2 ex2; -> 클래스이름도 어딘가에서 새로운 변수로 사용 가능
 */
		
		double value = 1.8;
		System.out.println(value);

	
	/*
	 * 변수의 타입
	 * 자료형(data type) : data의 type에 따라 값이 저장될 공간의 저장형식을 정의한 것
	 * data type 종류 : 문자형(char), 
	 * 					정수형(byte, short, int, long)
	 * 					실수형(float, double)
	 * 변수를 선언할 때는 저장하려는 값의 특성을 고려하여 가장 알맞은 자료형을 선택
	 * 
	 * 메모리에는 1byte단위로 일련번호가 붙어있는데, 이 번호를 '메모리주소 (memory address)'또는 간단히'주소'라고한다. 
	 * 객체의 주소는 객체가 저장된 메모리기본형(primitive type) : 실제 값(data)를 저장 
	 * - 논리형(boolean) : 1byte. true와 false 중 하나를 값으로 가짐, 조건식&논리적 계산에 사용 
	 * - 문자형(char) : 2byte. 문자를 저장하는데 사용, 변수에 하나의 문자만 저장 가능
	 * - 정수형(1-byte, 2-short, 4-int, 8-long) : 정수저장, 주로 int사용. byte는 2진데이터, short는 C언어 호환을 위해 추가
	 * - 실수형(4-float, 8-double) : 실수저장, 주로 double사용. 주소를 뜻한다.
	 * 
	 * 자료형은 기본형과 참조형으로 나뉘어짐
	 * 
	 * 기본형(primitive type) : 실제 값(data)를 저장 
	 * - 논리형(boolean) : 1byte. true와 false 중 하나를 값으로 가짐, 조건식&논리적 계산에 사용 
	 * - 문자형(char) : 2byte. 문자를 저장하는데 사용, 변수에 하나의 문자만 저장 가능
	 * - 정수형(1-byte, 2-short, 4-int, 8-long) : 정수저장, 주로 int사용. byte는 2진데이터, short는 C언어 호환을 위해 추가
	 * - 실수형(4-float, 8-double) : 실수저장, 주로 double사용.
	 * **_(underbar)를 통해서 숫자 구분 가능 1,000(x), 1_000(o)
//
//
//
//
//
//
//
//
	 * int의 범위 -2,147,483,648 ~ 2,147,483,647 (-2^31~2^31-1, 약 ±20억)
	 * 
	 * 10000 = 1e4(지수표기법)대소문자 상관x -> 10을 4번곱함 
	 * 5678 = 5.768e3 
	 *		  5.768 e3
	 * 		  5.768 10 * 10 * 10
	 * 3e-3 = 0.003
	 * 		  3 * 0.1 * 0.1 * 0.1
	 *  
	 * 100,000,000 = 100,000k = 100m (mega for coding) = 0.1g
	 * 110gb = 110,000mb = 110,000,000km = 110,000,000,000bytes
	 * 
	 * 프로세서 3.40GHz -> 1초에 34억번 진동 -> 한 번 연산할 때 얼마나 보낼거야
	 * -> 시스템종류 64비트 운영체제니까 64번 보냄
	 *  
	 * 참조형(reference type) : 어떤 값이 저장되어 있는 주소(memory address)를 값으로 가짐
	 * - 객체의 주소를 저장한다, 8개의 기본형을 제외한 나머지 타입.
	 * - 자바는 C언어와 달리 변수 간의 연산을 할 수 없으므로 실제 연산에 사용되는 것은 모두 기본형 변수이다
	 * 		C언어는 app에 따라 int type도 2가지임 (32bit int, 64bit int)
	 * ↓
	 * 
	 * bit - 합성어(신조어)라고 함. binary digit(2진법)의 줄임말
	 * 진법 : 한 자릿수에 표시할 수 있는 개수 
	 * 		  - 일상생활에서는 10진법 사용 (0-9)
	 * 		  - 2진법 (0,1), 8진법(0-7), 16진법(0-15)
	 * 컴퓨터가 2진법 쓰는 이유 : 신호가 들어오면 1, 안들어오면 0 으로 인식 -> 정확하게는 5V 들어오면 1, 1.5V들어오면 0
	 *  
	 * 16진법 : 0 ~ 15까지, 0~9표기는 숫자, 10=A, 11=B, 12=C, 13=D, 14=E, 15=F로 표기
	 * 			R /G /B 컬러팔레트도 16진법 사용 중 
	 * 			00/00/00 : black
	 * 			FF/00/00 : red
	 * 			00/FF/00 : green
	 * 			00/00/FF : blue
	 * 			FF/FF/FF : white
	 * 
	 * byte = 8bit -> 2진수 8개가 모여서 1바이트
	 * 00000000
	 * 11111111  -> 1byte(8bit) 경우의 수 2^8 = 256
	 * 				8bit는 2^8 경우의 수를 가진다
	 * 
	 *  bit - byte(8bit) - word(4byte) 
	 * 
	 */
	}
}
