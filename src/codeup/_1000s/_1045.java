package codeup._1000s;

import java.util.Scanner;

public class _1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 합
		System.out.println( a + b );
		// 차
		System.out.println( a - b );
		// 곱
		System.out.println( a * b );
		// 몫
		System.out.println( a / b );
		// 나머지
		System.out.println( a % b );
		// 나눈 값
		System.out.printf( "%.2f" , (double)a/(double)b);
		
		sc.close();
		
	}
}	
