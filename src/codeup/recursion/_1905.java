package codeup.recursion;

import java.util.Scanner;

//����Լ�	(Recursion)
//		: �Լ� ���ǿ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ�
  
public class _1905 {
	
	public static int res (int n) {
		// 5+4+3+2+1    
		// ( ����  n == 0 )
		if( n == 0)
			return 0;
			
		return n + res(--n);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		_1905 s = new _1905();
		
		int answer = res(n);
		System.out.println(answer);
	}
}
