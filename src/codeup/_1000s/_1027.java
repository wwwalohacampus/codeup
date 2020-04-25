package codeup._1000s;

import java.util.Scanner;

public class _1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split("\\.");
		
		System.out.println(strArr[2] + "-" + strArr[1] + "-" + strArr[0]);
		
		sc.close();
	}
}
