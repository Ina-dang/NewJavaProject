package a220128;

import lombok.AllArgsConstructor;
import lombok.Data;

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("Heart", 10);
		
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c2);
	}
}
/*
 * lombok 롬복
@ALLArgsConstructor //모든 인자를 사용하는 생성자
@NoArgsConstructor 
@Getter 
@Setter 
@ToString
@Data
*/

@AllArgsConstructor
@Data
class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 1);
	}

	@Override
	public String toString() {
		return kind + ", " + number ;
	}
	
	
}