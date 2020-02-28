package codeup._1400s;

import java.util.Scanner;

// 알파벳 개수 출력하기
public class _1412 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split("");
		String[] alphaArr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
						  "o","p","q","r","s","t","u","v","w","x","y","z" };
		int[] cnt = new int[26];

		
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < alphaArr.length; j++) {
				if( strArr[i].equals(alphaArr[j]) )
					cnt[j]++;
			}
		}
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(alphaArr[i] + ":" + cnt[i]);
		}
		sc.close();
	}
}
