package Alberano;

import java.util.Scanner;

public class Q15 {

   String even() {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the array size");
       int size = sc.nextInt();
       int[] num = new int[size];
       System.out.println("enter the array elements");

       for (int i = 0; i < size; i++) {
           num[i] = sc.nextInt();
       }
       String s="";
       for(int x:num){
           if(x%2==0){
              s+= Integer.toString(x);
           }
       }

       return s;
   }

   public static void main(String args[]){
       Q15 q=new Q15();
       System.out.println("the even elements are \n"+ q.even());

   }
}
