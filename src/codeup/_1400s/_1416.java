package codeup._1400s;

import java.util.Scanner;

// 2진수 변환
public class _1416 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = 0;
		int digit = 0;
		int[] binary = new int[32]; 
		
		while( true ) {
			R = N % 2;
			N = N / 2;
			binary[digit] = R;
			digit++;
			
			// 종료조건
			if( N < 2 )
				break;
		}
		
		if( N != 0 )
			System.out.print(N);
		for (int i = digit-1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		
		sc.close();
	}
}
