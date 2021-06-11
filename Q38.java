package Alberano;

import java.util.Scanner;

public class Q38 {

    static int minimum(int[] c,int l)
    {
        int []cost=new int[l];

        cost[0]=c[0];
        cost[1]=c[1];

        for(int i=2;i<l;i++){
            cost[i]=Math.min(cost[i-1],cost[i-2]) + c[i];
        }
        return Math.min(cost[l-2],cost[l-1]);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of costs:");
        int cost=sc.nextInt();

        System.out.println("enter the array of costs");
        int arr[]=new int[cost];

        for(int i=0;i<cost;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(minimum(arr,cost));
    }
}
