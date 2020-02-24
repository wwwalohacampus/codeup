package codeup.recursion;

import java.util.Scanner;

// 펙토리얼
public class _1912 {
	
	// 5 4 3 2 1
	// 5 * 4 * 3 * 2 * 1 
	public static int fact(int n) {
		// 종료조건
		if(n == 0)
			return 1;
		
		// 재귀 조건
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = fact(n);
		
		System.out.println( answer );
	}
}
