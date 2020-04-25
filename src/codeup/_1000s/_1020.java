package codeup._1000s;

import java.util.Scanner;

public class _1020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == '-' )
				continue;
			System.out.print(str.charAt(i));
		}
		sc.close();
	}
}
