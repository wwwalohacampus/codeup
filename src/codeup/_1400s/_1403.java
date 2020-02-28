package codeup._1400s;

import java.util.Scanner;

// 배열 두 번 출력하기
public class _1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}
		
		sc.close();
		
	}
}
