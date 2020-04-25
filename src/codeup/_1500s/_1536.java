package codeup._1500s;

import java.util.Scanner;

public class _1536 {
	public static int getMinNum(int[] arr) {
		int min = Integer.MAX_VALUE;			// 최솟값
		
		// 2 3 2 1 3
		for (int i = 0; i < arr.length; i++) {
			if( min > arr[i] ) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = getMinNum(arr);
		System.out.println(answer);
		
		sc.close();
	}
}
