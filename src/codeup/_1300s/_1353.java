package codeup._1300s;

import java.util.Scanner;

/*
n 이 5 이면
*
**
***
****
*****
 */
public class _1353 {
	public static void main(String[] args) {
		// 1. 입력 받아서 n에 저장
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 2. n번 만큼 줄바꿈
		for (int i = 1; i <= n; i++) {
			// 3. n번 만큼 '*'을 출력
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}





