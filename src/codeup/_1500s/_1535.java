package codeup._1500s;

import java.util.Scanner;

public class _1535 {
	public static int getMaxNum(int[] arr) {
		int max = 0;			// 최댓값
		int maxNum = 1;			// 최댓값의 위치
		
		// 1 3 2 1 3
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
				maxNum = i+1;
			}
		}
		return maxNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int answer = getMaxNum(arr);
		System.out.println(answer);
		
		sc.close();
	}
}
