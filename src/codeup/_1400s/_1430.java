package codeup._1400s;

import java.util.HashMap;
import java.util.Scanner;

// 기억력 테스트2
// ( 시간초과 - 서버의 문제인듯, 새벽에 제출해보기 )
public class _1430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
    	HashMap<Integer, Integer> test = new HashMap<Integer, Integer>(); 
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
        	test.put(sc.nextInt(), 1);
        }
        
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
        	int tmp = sc.nextInt();
        	if(test.containsKey(tmp))
        		System.out.print(test.get(tmp)); 
        	else
        		System.out.print("0");
        	System.out.print(" ");
        }
        
        sc.close();
	}
}
