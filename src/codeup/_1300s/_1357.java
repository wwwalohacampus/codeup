package codeup._1300s;

import java.util.Scanner;

public class _1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
			
		for (int i = 0; i < 2*N-1 ; i++) {
			if( i < N ) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} 
			else {
				for (int j = 0; j < 2*N-i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
				
	}
}
