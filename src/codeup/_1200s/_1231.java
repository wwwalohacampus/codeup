package codeup._1200s;

import java.util.Scanner;

public class _1231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fom = sc.nextLine();
		String[] fomArr = new String[2];
		char opr = ' ';
		int result = 0;
		
		if(fom.contains("+")) {
			fomArr = fom.split("\\+");
			opr = '+';
		}
		if(fom.contains("-")) {
			fomArr = fom.split("\\-");
			opr = '-';
		}
		if(fom.contains("*")) {
			fomArr = fom.split("\\*");
			opr = '*';
		}
		if(fom.contains("/")) {
			fomArr = fom.split("\\/");
			opr = '/';
		}
		
		int a = Integer.parseInt(fomArr[0]);
		int b = Integer.parseInt(fomArr[1]);

		double dResult;
		
		
		switch (opr) {
			case '+':
					result =  a + b;
					System.out.println(result);
					break;
			case '-':
					result =  a - b;
					System.out.println(result);
					break;
			case '*':
					result =  a * b;
					System.out.println(result);
					break;
			case '/':
					dResult =  (double)a / b;
					System.out.printf("%.2f",dResult);
					break;
		}
		
		sc.close();
	}
}
