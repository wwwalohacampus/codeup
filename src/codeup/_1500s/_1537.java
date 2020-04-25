package codeup._1500s;

import java.util.Scanner;

public class _1537 {
	public static void print(int N) {
		if(N == 1)
			System.out.println("hello");
		else
			System.out.println("world");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		print(N);
	}
}
