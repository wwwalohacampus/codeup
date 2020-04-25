package codeup._1000s;

import java.util.Scanner;

public class _1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 10000;
		int input = sc.nextInt();
		
		while(input > 0) {
			System.out.println("[" + (input / s) * s + "]");
			input %= s;
			s /= 10;
		}
		sc.close();
	}
}
