package codeup.sort;

import java.util.Scanner;

public class _1442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// [1][3][2][5][4] 
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n ; j++) {
				if( arr[i] > arr[j] ) {
					// ��ȯ���� (swap)
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int i = 0; i < n ; i++) {
			System.out.println(arr[i]);
		}
	}
} 
  