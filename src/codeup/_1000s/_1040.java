package codeup._1000s;

import java.util.Scanner;

public class _1040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 1. 정수 
		// 	- 음수인 정수, 0, 양수인 정수
		if( num < 0 ) {				// 음수
			// -1, -2, -100, ... , -2147483647
			num = (-1) * num;
		} else if ( num > 0 ) {		// 양수
			// +1, +2, +100, ... , +2147483647
			num = (-1) * num;
		} else {					// 0
			num = 0;
		}
		
		System.out.println(num);
		sc.close();
		
	}
}
