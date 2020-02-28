package codeup._1000s;

import java.util.Scanner;

public class _1095 {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 23;
		
		for (int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if( min > temp )
				min = temp;
		}
		
		System.out.println(min);
		
		sc.close();
	}
}
