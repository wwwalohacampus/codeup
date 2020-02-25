package codeup._1200s;

import java.util.Scanner;

public class _1226 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int[] lotto = new int[7];
		int[] juhee = new int[6];
		int cnt = 0;
		int rank = 0;
		
		// 입력 - lotto(6자리+보너스1), juhee(선택 번호 6자리) 
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = sc.nextInt();
		
		for (int i = 0; i < juhee.length; i++) 
			juhee[i] = sc.nextInt();
		
		
		// 비교 ( 당첨번호(6자리)와 선택번호(6자리) 비교 )
		for (int i = 0; i < juhee.length; i++) {
			for (int j = 0; j < juhee.length; j++) {
				if( lotto[i] == juhee[j] )
					cnt++;
			}
		}
		
		switch (cnt) {
			case 6:		rank = 1;
						break;
			// 일치하는 번호가 5개 인 경우 2등 또는 3등 
			// 보너스 번호가 일치 		--> 2등
			// 보너스 번호가 불일치 	--> 3등
			case 5:		rank = 3;
						for (int i = 0; i < juhee.length; i++) {
							if( lotto[6] == juhee[i] ) {
								rank = 2;
							}
						} 	
						break;
			case 4:		rank = 4;
						break;
			case 3:		rank = 5;
						break;
			default:    rank = 0;
						break;
		}
		System.out.println(rank);
	}
}

