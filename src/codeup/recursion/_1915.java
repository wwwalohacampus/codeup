package codeup.recursion;

import java.util.Scanner;

public class _1915 {
	
	public static int fibo(int n) {
		
		if( n < 3 )
			return 1;
		
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = fibo(n);
		
		System.out.println(answer);
	}
}

