package a220105;

public class OperatorEx14 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++); {
			System.out.print(c++);
		}	
		System.out.println();
			
		c = 'A';
		for(int i=0; i<26; i++);{
			System.out.print(c++);
		}	
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++);{
			System.out.print(c++);
		}	
		System.out.println();	
		
		//¡èº»¹® ¿¹½Ã 
		//¾Æ·¡´Â ¼±»ý´ÔÀÌ ÀÀ¿ëÇÑ°Í°°À¾´Ï´Ù
		
		System.out.println('ÆR' - '°¡' + 1);
		
		System.out.println(11172 / 19f);
		
		for(int i = '°¡'; i < '±î'; i++) {
			System.out.print((char)i);
		}
		
		System.out.println('a' - 'A');
		
	}
}
