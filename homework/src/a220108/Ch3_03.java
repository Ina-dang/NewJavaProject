package a220108;

public class Ch3_03 { 
	// 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 
	// 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오
	public static void main(String[] args) {
		int num = 100;
		System.out.println(( num > 0 ) ? "양수" : (num>=0 ? "0": "음수")) ;
		
		//String result = ( num > 0 ) ? "양수" : "0" ;
		//String result = ( num >=0 )  ? "0" : "음수" ;
		//연산자 ? 수식 1 : 2 
	}

}
