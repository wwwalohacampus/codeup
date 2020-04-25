package codeup._1300s;

import java.util.Scanner;

public class _1356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N ; i++) {
			// 첫번째 줄
			if( i == 0 ) {
				for (int j = 0; j < N; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			// 마지막 줄
			else if( i == (N-1) ) {
				for (int j = 0; j < N; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			// 나머지 줄
			else {
				// 별 * 출력
				System.out.print("*");

				// 빈칸을 N-2 개 출력
				for (int j = 0; j < N-2; j++) {
					System.out.print(" ");
				}
				
				// 별 * 출력
				System.out.println("*");
			}
		}
		System.out.println();
		sc.close();
	}
}







