package codeup._1200s;
import java.util.ArrayList;
import java.util.Scanner;


public class _1284 {

   public static void main(String[] args) {
      
      Scanner sc= new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> list = new ArrayList<Integer>();
   
      // 1. 약수를 구한다.
      for (int i = 2; i < n; i++) {
         if( n % i == 0 )
            list.add(i);
      }
      
      // 2. 약수 A X 약수 B  == N
      int[] twoPrime = new int[2];
      for (int i = 0; i < list.size()-1; i++) {
         for (int j = i+1; j < list.size(); j++) {
            int a = list.get(i);
            int b = list.get(j);
            if( ( a * b ) == n ) {
               twoPrime[0] = a;
               twoPrime[1] = b;
            }
         }
      }
      
      // 3. 약수 A,B 모두 소수?
      boolean aStatus = true;
      boolean bStatus = true;
      int aAnswer = 0;
      int bAnswer = 0;
      int a = twoPrime[0];
      int b = twoPrime[1];
      
      for (int j = 2; j < a; j++) {
         if( a % j == 0 )
            aStatus = false;
      }
      for (int j = 2; j < b; j++) {
         if( b % j == 0)
            bStatus = false;
      }
      if( aStatus && bStatus ) {
         aAnswer = a;
         bAnswer = b;
      }
      
      if( aAnswer != 0 && bAnswer != 0)
         System.out.println(aAnswer + " " + bAnswer);
      else
         System.out.println("wrong number");
         
            
      sc.close();
   }
}