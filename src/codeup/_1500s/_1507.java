package codeup._1500s;

import java.util.Scanner;

public class _1507 {
	static int[][] a = new int[100][100];
	
	public static void setArea(int x1, int y1, int x2, int y2) {
		for (int i = x1; i < x2; i++) {
			for (int j = y1; j < y2; j++) {
				a[i][j] = 1;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			setArea(x1, y1, x2, y2);
		}
		
		int area = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if( a[i][j] == 1 )
					area++;
			}
		}
		System.out.println(area);
		sc.close();
	}
}
