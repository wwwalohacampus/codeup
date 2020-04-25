package codeup._1500s;

import java.util.Scanner;

public class _1502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N];
		
		int k = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				a[j][i] = k++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
