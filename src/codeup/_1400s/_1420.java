package codeup._1400s;

import java.util.Scanner;

public class _1420 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] nameArr = new String[N];
		int[] scoreArr = new int[N];
		
		for (int i = 0; i < N ; i++) {
			nameArr[i] = sc.next();
			scoreArr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-(i+1); j++) {
				if( scoreArr[j] < scoreArr[j+1] ) {
					int temp = scoreArr[j+1];
					scoreArr[j+1] = scoreArr[j];
					scoreArr[j] = temp;
					
					String tempStr = nameArr[j+1];
					nameArr[j+1] = nameArr[j];
					nameArr[j] = tempStr;
				}
			}
		}

		String answer = nameArr[2];
		System.out.println(answer);
		sc.close();
	}
}
