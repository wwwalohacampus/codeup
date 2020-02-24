package codeup.recursion;

import java.util.Scanner;

//재귀함수	(Recursion)
//: 함수 정의에서 자기 자신을 호출하는 함수

public class _1905 {

	public static int res(int n) {
		// 5+4+3+2+1    
		// ( 조건  n == 0 )
		if (n == 0)
			return 0;

		return n + res(--n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = res(n);
		System.out.println(answer);
	}
}
