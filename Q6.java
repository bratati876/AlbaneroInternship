package Alberano;

import java.util.Scanner;

public class Q6 {
    static void AP(int a, int d, int n){
        String ap="";

        for(int i=1;i<=n;i++)
        {
            ap=ap+(a+(i-1)*d)+" ";
        }
        System.out.println(ap);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first term");
        int a=sc.nextInt();
        System.out.println("Enter the common difference");
        int cd=sc.nextInt();
        System.out.println("enter the total no of terms");
        int n=sc.nextInt();
        Q6.AP(a,cd,n);
    }
}
