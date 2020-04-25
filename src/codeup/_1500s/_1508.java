package codeup._1500s;

import java.util.Scanner;

public class _1508 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N+1][N+1];
		
		for (int i = 1; i <= N; i++) {
			a[i][1] = sc.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(a[i-1][j-1] != 0) {
					a[i][j] = a[i][j-1] - a[i-1][j-1];
				}
			}
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if(a[i][j] != 0)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
