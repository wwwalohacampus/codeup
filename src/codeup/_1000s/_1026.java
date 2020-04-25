package codeup._1000s;

import java.util.Scanner;

public class _1026 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(":");
		
		if(strArr[1].equals("00"))
			System.out.println("0");
		else
			System.out.println(strArr[1]);
		
		sc.close();
	}
}
