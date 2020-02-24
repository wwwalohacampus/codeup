package codeup.sort;

import java.util.Scanner;
 
// 삽입정렬
public class _1443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i, j, key;
		for (i = 1; i < n; i++) {
			key = arr[i];
			for (j = i-1; j >= 0 && arr[j]>key ; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}
		
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
	}
}
