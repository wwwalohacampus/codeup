package codeup._1400s;

import java.util.Scanner;

// 문자열 출력하기1
public class _1407 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = new String[100];
		String str = "";
		str = sc.nextLine();
		strArr = str.split(" ");
		
		for (String ans : strArr) {
			System.out.print(ans);
		}
		sc.close();
	}
}
