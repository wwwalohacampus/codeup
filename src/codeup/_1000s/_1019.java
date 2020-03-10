package codeup._1000s;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _1019 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		// Date - 날짜 데이터 타입
		String s = sc.next();
		// 2013.8.5
		SimpleDateFormat format = new SimpleDateFormat("yyyy.mm.dd");
		Date date = format.parse(s);
		
		SimpleDateFormat ans = new SimpleDateFormat("yyyy.mm.dd");
		String newDate = ans.format(date);
		
		System.out.println(newDate);
		
		sc.close();
	}
}
