package util_kkb;

import java.util.Scanner;

public class ProductUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String input) {
		System.out.println(input);
		return scanner.nextLine();
	}
	public static int nextInt(String input) {
		return Integer.parseInt(nextLine(input));
	}
}

