package codeup._1200s;

import java.util.Scanner;

public class _1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		
		for (int i = 1; i <= N; i++) {
			int temp = sc.nextInt();
			if( max < temp )
				max = temp;
		}
		
		System.out.println(max);
		sc.close();
	}
}
