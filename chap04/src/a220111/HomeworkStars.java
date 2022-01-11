package a220111;

public class HomeworkStars {
	//5*5마름모 구현법 과제 
	/*
	 *      *
	 *     ***
	 *    *****
	 *     ***
	 *      *
	 */
	//FlowEx16참고
	public static void main(String[] args) {
		for(int i= 0; i < 5; i++) {
			for(int j= 0; j < 5; j++) {
//				boolean b = i >= j ; //if보다 boolean으로 넣으면 나중에 바꾸기 슆다
				if(i==2) {
//					System.out.print("*");
					System.out.printf("[%d,%d]", i, j);
				} else if (j==2) {
//					System.out.print("*");
					System.out.printf("%10c", ' ');
					System.out.printf("[%d,%d]", i, j);
				} {//저 네모들 어케 합칠지 생각..
				}
			}
			System.out.println();
		}//4개로 나누면 되지 않을까?
	}
}
