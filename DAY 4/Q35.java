package Alberano;

import java.util.Scanner;

public class Q35 {

    static boolean digit_sum(int[] n){
        int []sum=new int[2];
        int rem;
        for(int i=0;i<2;i++){
            int temp=n[i];int s=0;
           while(temp!=0){
               rem=temp%10;
               s+=rem;
               temp/=10;
           }
            sum[i]=s;

        }

       if(sum[0]==sum[1])
           return true;
       else
           return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an aray of two integers");
        int[] num=new int[2];

        for(int i=0;i<2;i++){
            num[i]=sc.nextInt();
        }

        System.out.println(digit_sum(num));
    }
}
