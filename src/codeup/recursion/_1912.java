package codeup.recursion;

import java.util.Scanner;

public class _1912 {
	
	// 5 4 3 2 1
	// 5 * 4 * 3 * 2 * 1 
	public static int fact(int n) {
		
		// ��������
		if(n == 0)
			return 1;
		
		// ��� ����
		return n * fact(n-1);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = fact(n);
		
		System.out.println( answer );
	}
}


