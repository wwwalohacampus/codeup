package codeup._1400s;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 기억력 테스트2
public class _1430_overmem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		
		int[] arr = new int[10000001];
		for (int i = 1; i <= N; i++) {
			int temp = Integer.parseInt(str[i-1]);
			arr[temp] = 1;
		}
		
		int M = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		for (int i = 1; i <= M; i++) {
			int temp = Integer.parseInt(str[i-1]);
			System.out.print(arr[temp] + " ");
		}
	}
}
