package a220108;

public class Ch3_02_ { //ch3/Exercise3_2
	public static void main(String[] args) {
		int numOfApples = 123;		// 사과의 개수
		int sizeOfBucket = 10;		// 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);	
									// 모든 사과를 담는데 필요한 바구니의 수
						 // 주석안에 알맞은 코드를 넣기
		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
		
		//해석 보는데도 이해가 안감
	}
}
