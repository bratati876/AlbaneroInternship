package Alberano;

import java.util.Scanner;

public class Q31 {

    static int[] bigger(int[][] n,int r){

        int []num=new int[r];
        int j=0;

        for(int arr[]:n){
            int large=arr[0];
            for(int i=1;i< arr.length;i++)
            {
                if(large<arr[i])
                   large=arr[i];
            }
            num[j++]=large;
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many arrays you want to enter");
        int rows=sc.nextInt();

        int[][] num=new int[rows][];

        for(int i=0;i<rows;i++){
            System.out.println("enter how many numbers are there in the "+ (i+1) +"no array:");
            int n=sc.nextInt();
//            System.out.println(i);
            num[i]=new int[n];
            System.out.println("enter the array elements:");
            for(int j=0;j<n;j++){
//                num[i][j]=0;
                num[i][j]=sc.nextInt();

            }
        }

        int []result=bigger(num,rows);
        System.out.println("the largest numbers from the arrays are:");
        for(int x:result){
            System.out.print(x+" ");
        }


    }
}
