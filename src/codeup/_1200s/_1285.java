package codeup._1200s;

import java.util.ArrayList;
import java.util.Scanner;

public class _1285 {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      String strNum = "";
      ArrayList<Integer> numList = new ArrayList<Integer>();
      ArrayList<Character> operatorList = new ArrayList<Character>();
      
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         
         if( ch != '+' && ch != '-' && ch != '*' && ch != '/' && ch != '=' ) {
            strNum += ch;
         }
         else {
            numList.add(Integer.parseInt(strNum));
            operatorList.add(ch);
            strNum = "";
         }
      }
      
      int Answer = numList.get(0);
      for (int i = 0; i < numList.size()-1; i++) {
         Character opr = operatorList.get(i);
         switch (opr) {
         case '+':   
                  Answer += numList.get(i+1);
                  break;
         case '-':   
                  Answer -= numList.get(i+1);
                  break;
         case '*':   
                  Answer *= numList.get(i+1);
                  break;
         case '/':   
                  Answer /= numList.get(i+1);
                  break;
         }
      }
      
      System.out.println(Answer);
      sc.close();
      
      
   }
}