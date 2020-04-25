package codeup._1000s;

import java.util.Scanner;

public class _1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split("\\.");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		
		sc.close();
	}
}
