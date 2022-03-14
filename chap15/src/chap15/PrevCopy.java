package chap15;

import java.io.FileInputStream;
import java.io.FileReader;

public class PrevCopy {
	public static void main(String[] args) throws Exception{
		// 문자 기반 입력 스트림 : Reader
		// 문자 기반 출력 스트림 : Writer
		// 바이트 기반 입력 스트림 : InputStream
		// 바이트 기반 출력 스트림 : OutputStream
		
		//파일 : File
		// 파일을 할껀데 문자기반 입력 스트림을 할꺼면 FileReader
		
		System.out.println("AAAA");
		FileReader fr = new FileReader("src/chap15/Prev.java");
		int b = 0;
		int cnt = 0;
		while((b = fr.read()) != -1) {
//			System.out.print((char)b);
			cnt++;
		}
		System.out.println(cnt + "번 반복함");
		
		//얘는 한글 바사삭
		FileInputStream fis = new FileInputStream("src/chap15/Prev.java");
		b = 0;
		cnt = 0;
		while((b = fis.read()) != -1) {
			System.out.print((char)b + "::"); //문자로 변환해보고
			System.out.print(b);//이건int로 
			System.out.println();
			cnt++;
		}
		System.out.println(cnt + "번 반복함");
		
	}
}

//EOF End of File

//400byte
//byte[ ] byte = new byte[32];
// 400개중에서 32번씩 약 12번하고 16개 남으면 
// 리턴이 16개 되고 마지막은 0으로 마무리 -> 이게 EOF End of File
