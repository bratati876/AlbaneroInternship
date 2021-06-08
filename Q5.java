package Alberano;

import java.util.Scanner;

public class Q5 {
 int num[];
    Scanner sc=new Scanner(System.in);

     int outlier(){
        int o = 0,e=0,even=0,odd=0;

         System.out.println("enter the size of the array");
         int size=sc.nextInt();

         int[] num=new int[size];

         for(int i=0;i<size;i++){
             num[i]=sc.nextInt();
         }

        for(int x:num){
            if(x%2==0){
                e=x;
                even++;
            }
            if(x%2!=0){
                o=x;
                odd++;
            }
        }

        if(even == num.length-1)
            return o;
        else
            return e;
    }

    public static void main(String args[]){
Q5 q=new Q5();
        System.out.println("the outlier number is "+ q.outlier());
    }
}
