package codeup._1000s;

import java.util.Scanner;

public class _1012 {
	public static void main(String[] args) {
		// 1. 실수를 입력
		Scanner sc = new Scanner(System.in);
		
		// 2. 실수를 변수에 저장
		// float - 실수 데이터 타입
		float f = 0;
		f = sc.nextFloat();
		
		// 3. 변수를 출력
		System.out.printf("%f", f);
		
		sc.close();
	}
}
