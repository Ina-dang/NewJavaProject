package chap15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IoEx3 {
	public static void main(String[] args) throws IOException {
		byte[] inSrc = { 0,1,2,3,4,5,6,7,8,9,10};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream bais = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.out.println("input source :" + Arrays.toString(inSrc));
		
		int data = 0;
		
		while(bais.available() > 0) { //3번
//			int len = bais.read(temp);
//			baos.write(temp, 0, len);  --이거 2줄이 아래 한줄로 변환
			baos.write(temp, 0, bais.read(temp)); //0부터~~ bais.read(temp) 까지
//			bais.read(temp);
//			baos.write(temp);
//			System.out.println("temp :" + Arrays.toString(temp));
			outSrc = baos.toByteArray();
			printArrays(temp, outSrc);
		}
	}
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp         :" + Arrays.toString(temp));
		System.out.println(""
				+ "outSrc       :" + Arrays.toString(outSrc));
		
	}

}
