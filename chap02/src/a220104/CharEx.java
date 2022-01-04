package a220104;

public class CharEx {
	public static void main(String[] args) {
		char ch = 'A'; 		//char ch = 65;
		int code = (int)ch; //ch¿¡ ÀúÀåµÈ °ªÀ» int Å¸ÀÔÀ¸·Î º¯È¯ÇÏ¿© ÀúÀåÇÑ´Ù.
		
		System.out.printf("%c=%d(%#X) %n", ch, code, code);
							// char=10Áø(#16Áø¼ö), ¿£ÅÍ
		char hch = 'ÆR'; 	// char hch = 0xAc00;
		System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch) ;
		
		//char ÀÇ Å©±â 2byte
		// 2^16 = 65536 °³ 0~65535
		
		//escape char Æ¯¹® 
		
		/* ¿µ¹®ÀÚ ÀÌ¿Ü tabÀÌ³ª backspace µîÀÇ Æ¯¼ö¹®ÀÚ¸¦ ÀúÀåÇÏ´Â ¹æ¹ý
		 * 
		 *  ex) tab
		 * 		char tab = '\t'; // º¯¼ö tab¿¡ ÅÇ ¹®ÀÚ¸¦ ÀúÀå
		 * 		
		 * 		tab = \t
		 * 		backspace = \b
		 * 		form feed = \f
		 * 		new line = \n
		 * 		carriage return = \r
		 * 		¿ª½½·¡½¬ = \\
		 * 		ÀÛÀºµû¿ÈÇ¥ = \'
		 * 		Å«µû¿ÈÇ¥ = \"
		 * 		À¯´ÏÄÚµå(16Áø¼ö)¹®ÀÚ = \ u + À¯´ÏÄÚµå (¿¹: char a='\u0041')
		 * 		
		 */
		System.out.println("\"µû¿ÈÇ¥Ãâ·Â\"");
		System.out.println('\"');
		System.out.println("°¡\t³ª\t´Ù\t"); //\t ¾øÀ¸¸é[    ]ÀÌ·¸°Ô ¶ç¾î¾²±â ÇØ¾ßÇÔ
		System.out.println('\u0041');
		System.out.println("\t°¡\r³ª\n´Ù\f\f\f\f\f\f\fAAB");
		
		char ch1 = 'A';
		short s = 65;
		
		System.out.println(ch1);
		System.out.println(s);
		
		// ÄÄÇ»ÅÍ´Â µÑ´Ù 2Áø¹ý 65·Î ¹Þ¾ÆµéÀÌÁö¸¸ Ãâ·Â°á°ú´Â ´Ù¸£´Ù
		// ÄÄÇ»ÅÍ´Â ¼ýÀÚ¹Û¿¡ ¸ð¸£±â¶§¹®¿¡.. (±âÁØÀº À¯´ÏÄÚµå)
		
		/*		ÀÎÄÚµù : ¿ì¸®°¡ º¸´Â°É ÄÄÇ»ÅÍ°¡ ÀÌÇØÇÏµµ·Ï ÄÚµåÈ­ ½ÃÅ´ 
		 * 'A' ---------> 65
		 *     <---------
		 *      µðÄÚµù : ÄÄÇ»ÅÍ°¡ ÀÌÇØÇÑ°É ´Ù½Ã ¿ì¸®½ÄÀ¸·Î ºÎÈ£È­(º¹È£È­) ½ÃÅ´
		 *      
		 * codec : coder + decode ÀÇ ÇÕ¼º¾î 
		 * modem : modulator + demodulator ÀÇ ÇÕ¼º¾î
		 * 
		 */		
	}
}
