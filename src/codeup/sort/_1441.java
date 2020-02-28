package codeup.sort;

import java.util.Scanner;

// 버블정렬
public class _1441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10001];
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-(i+1); j++) {
				if( arr[j] > arr[j+1] ) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}
}

