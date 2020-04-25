package codeup._1000s;

import java.util.Scanner;

public class _1041 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  str = sc.next();
		Character ch = str.charAt(0);
		int num = ch.charValue();
		char changeCh = (char)(num+1);
		System.out.println(changeCh);
	}
}
