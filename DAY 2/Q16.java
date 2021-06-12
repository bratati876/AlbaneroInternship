package Alberano;

import java.util.Scanner;

public class Q16 {

     String np(){
         int Pos=0,Neg=0;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array size");
         int size = sc.nextInt();
         int[] num = new int[size];
         System.out.println("enter the array elements");

         for (int i = 0; i < size; i++) {
             num[i] = sc.nextInt();
         }

         for(int x:num){
             if(x<0){
                 Neg+=x;
             }
             else{
                 Pos++;
             }
         }

         String s=Integer.toString(Pos) + "," + Integer.toString(Neg);
         return s;
     }
     public static void main(String args[]){
         Q16 q=new Q16();
         System.out.println(q.np());
     }
}
