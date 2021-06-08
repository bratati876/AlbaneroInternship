package Alberano;

import java.util.Scanner;

public class Q3 {
   static String evenorodd(int []num){
        int sum=0;
        for(int x:num)
        {
            sum+=x;
        }

        if(sum%2==0)
            return "even";
        else
            return "odd";
    }
}

class Main2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();

     int[] num=new int[size];

     for(int x:num){
         x=sc.nextInt();
     }

        System.out.println(Q3.evenorodd(num));

    }
}
