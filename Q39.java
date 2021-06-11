package Alberano;

import java.util.Scanner;

public class Q39 {

    static int max_sub(int []n,int l){
        int max_sum=Integer.MIN_VALUE;
        int upto_max=0;

        for(int i=0;i<l;i++){
            upto_max+=n[i];

            if(upto_max<0){
                upto_max=0;
            }
            if(max_sum<upto_max){
                max_sum=upto_max;
            }
        }

        return max_sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array of integers:\n\n");

        System.out.println("Enter how many integers you want to input");
        int n=sc.nextInt();
        int[] max=new int[n];

        for(int i=0;i<n;i++){
            max[i]=sc.nextInt();
        }

        System.out.println("the maximum subarray:"+max_sub(max,n));
    }
}
