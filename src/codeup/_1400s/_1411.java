package codeup._1400s;

import java.util.Scanner;

// 빠진 카드
public class _1411 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  = sc.nextInt();
		int[] inputArr = new int[N];
		int[] seqArr = new int[N];
		int answer = 0;
		
		for (int i = 0; i < N-1; i++) {
			inputArr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			seqArr[i] = i+1;
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <= N; j++) {
				if( inputArr[i] == j )
					seqArr[j-1] = 0;
			}
		}
		
		for (int i = 0; i < seqArr.length; i++) {
			if(seqArr[i] != 0)
				answer = seqArr[i];
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
