package Alberano;

import java.util.Scanner;

public class Q4 {

    static int[] Plusone(int []num){
        for(int x:num)
            System.out.println(x+"\n");
        int[] num1=new int[num.length];
        for(int i=0;i<num.length;i++)
        {
            num1[i]=num[i]+1;
        }


       return num1;
    }
}

class Main3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();

        int[] num=new int[size];

        for(int x:num){
            x=sc.nextInt();
        }

        System.out.println("the new array would be ");
        num=Q4.Plusone(num);
        for(int x:num){
            System.out.println(x+"\n");
    }
}
}
