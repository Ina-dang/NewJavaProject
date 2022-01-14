package a220113;

public class Ch5_07r {
//	문제 5-6 : 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//	수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//	라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//	프로그램을 완성하시오.
//	[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
//	문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
//	금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//	돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
//	한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	
	public static void main(String[] args) { // 우클릭 - 런에서 - 런 피규레션 - 아규 갑입력
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120"); //이거 잘못치면 여기서 자꾸 프로그램 끝남 
			System.exit(0); //현재 실행중인 JVM을 종료시킨다
					
		}
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money=" + money);
		
		int[] coinUnit = {500, 100, 50, 10};  // 동전의 단위
		int[] coin     = {5  , 5  , 5 , 5 };  // 단위별 동전의 개수
		
		for (int i = 0; i < coinUnit.length; i++) { // 부터 coinUnit길이(4)까지 1씩증가
//			3. 문장
			int coinNum = 0;
			coinNum = money / coinUnit[i] ; // 1. 금액(money)를 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다
			
//			배열 coin 에서 coinNum 만큼의 동전을 뺀다.
//			 (만일 충분한 동전이 없다면 배열 coin 에 있는 만큼만 뺀다.)
//			== coin[0] - coinNum >= 0; // 5 - 6 >= 0 
//			
			if (coin[i] - coinNum >= 0) { //= 내가 가진 동전으로 처리가 가능
				coin[i] -= coinNum;
			} else { // 내가 가진 동전이 모자람
				coinNum = coin[i];
				coin[i] = 0; //일단 내가 가진거는 다 줘버림
			}	
			
			money -= (coinNum * coinUnit[i]);// 금액에서 (동전의 개수와 동전단위를 곱한값)을 뺀다

			/*
			 * 아래의 로직에 맞게 코드를 작성하시오
			 * 1. 금액(money)를 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다
			 * 2. 배열 coin 에서 coinNum 만큼의 동전을 뺀다.
			 *    (만일 충분한 동전이 없다면 배열 coin 에 있는 만큼만 뺀다.)
			 * 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */
		
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); //프로그램을 종료합니다
		}
		
		System.out.println("=남은 동전의 개수 =");
		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원: " + coin[i]);			
		}
	}
}
