package codeup._1500s;

import java.util.Scanner;
public class _1506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] a = new int[N][N];
		int k = 0;
		int s = 1;
		int i = -1;
		int j = 0;
		do {
			for (int p = 0; p < N; p++) {
				k++;
				i += s;
				a[i][j] = k;
			}
			N--;
			if( N == 0 )
				break;
			for (int p = 0; p < N ; p++) {
				k++;
				j += s;
				a[i][j] = k;
			}
			s *= (-1);
		} while (N > 0);
		
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a.length; y++) {
				System.out.print(a[x][y] + " ");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
