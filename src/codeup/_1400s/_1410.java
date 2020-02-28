package codeup._1400s;

import java.util.Scanner;

// 올바른 괄호 1 (괄호 개수 세기)
public class _1410 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split("");
		int openCnt = 0;
		int closeCnt = 0;
		
		for (String str : strArr) {
			if( str.equals("(") )
				openCnt++;
			if( str.equals(")") )
				closeCnt++;
		}
		
		System.out.print(openCnt + " " + closeCnt);
		
		sc.close();
	}
}
