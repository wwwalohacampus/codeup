package codeup._1000s;

import java.util.Scanner;

public class _1043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int answer = a % b;
		System.out.println( answer );
		
		sc.close();
	}
}
