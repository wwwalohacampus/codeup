package codeup._1300s;

import java.util.Scanner;

public class _1362 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// N에 따라 출력해야할 수의 개수
		// N 	: 1		2	3	4	5	...
		// 개수	: 1		3	6	10	15	...		a(n)	== 1~N 까지의 합계
		// 공차	:    2     3   4   5			b(n)
		int cnt = 0;		// 시작하는 수
		for (int i = 1; i <= N; i++) {
			cnt = cnt + i;
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(cnt-- + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}







