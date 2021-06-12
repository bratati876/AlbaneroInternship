package Alberano;

import java.util.Scanner;

public class Q30 {

   static int  mean(int n){
        int temp=n;int nodig=0,sum=0;
        int rem;

        while(temp!=0){

                rem = n % 10;
                sum+=rem;
                temp = temp / 10;
                nodig++;
        }

        return sum/nodig;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number to get the mean:");
        int n=sc.nextInt();
        System.out.println("the mean is: "+ mean(n));
    }
}
