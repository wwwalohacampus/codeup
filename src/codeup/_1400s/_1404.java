package codeup._1400s;

import java.util.Scanner;

// 숫자 로테이션
public class _1404 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = 0;
		for (int i = 1; i <= N; i++) {
			k = 0;
			for (int j = i; j <= N; j++) {
				k++;
				System.out.print(arr[j] + " ");
				if( j == N )
					j = 0;
				if( k == N )
					break;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
