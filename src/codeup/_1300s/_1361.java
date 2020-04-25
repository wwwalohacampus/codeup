package codeup._1300s;

import java.util.Scanner;

public class _1361 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("**");
		}
		
		sc.close();
	}
}
