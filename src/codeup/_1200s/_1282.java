package codeup._1200s;

import java.util.Scanner;

public class _1282 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int t = (int) Math.sqrt(n);
		int k = n - t*t;
		
		System.out.println(k + " " + t);
		
		sc.close();
	}
}
