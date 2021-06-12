package Alberano;

import java.util.Scanner;

public class Q13 {
   static Scanner sc=new Scanner(System.in);
    static int[][] num=new int[10][10];

   static int noOfOne(){
       int count=0;
       System.out.println("enter the no of rows ");
       int rows=sc.nextInt();
       System.out.println("enter the no of columns ");
       int col=sc.nextInt();
       System.out.println("Enter the matrix elemets");

       for(int i=0;i<rows;i++){
           for(int j=0;j<col;j++){
               num[i][j]=sc.nextInt();
           }
       }

       for(int arr[]: num){
           for(int x: arr){
               if(x==1){
                   count++;
               }
           }
       }
       return count;
    }
    public static void main(String args[])
    {
        System.out.println("the no of ones in the matrix will be "+ noOfOne());
    }
}
