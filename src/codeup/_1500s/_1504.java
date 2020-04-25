package codeup._1500s;

import java.util.Scanner;

public class _1504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N]; 
		int sw = 1;
		
		int k  = 1;
		for (int i = 0; i < N; i++) {
			if( sw == 1) 
				for (int j = 0; j < N; j+=sw) 
					a[j][i] = k++;
			if( sw == -1 ) 
				for (int j = N-1; j >= 0; j+=sw)
					a[j][i] = k++;
					
			sw *= (-1);				// sw = sw * (-1);
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
