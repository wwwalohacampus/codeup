package codeup._1400s;

import java.util.Scanner;

// 비교
public class _1440 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
	
		for (int i = 0; i < N; i++) {
			System.out.print(i+1 + ": ");
			for (int j = 0; j < N; j++) {
				if( i == j )
					continue;
				if( arr[i] < arr[j] )
					System.out.print("< ");
				if( arr[i] > arr[j] )
					System.out.print("> ");
				if( arr[i] == arr[j] )
					System.out.print("= ");
			}
			System.out.println();
		}
		sc.close();
	}
}
