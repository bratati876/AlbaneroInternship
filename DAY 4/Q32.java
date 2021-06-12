package Alberano;

import java.util.Scanner;

public class Q32 {

    static void duplicate(int[] a,int n){



        int j = 0;


        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[n - 1];

        for(int i=0;i<j;i++){
            System.out.print(a[i]+" ");
        }


    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of elements in the array:");
        int n=sc.nextInt();
         int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int x=0;x<n;x++){
            arr[x]=sc.nextInt();
        }

        System.out.println("array elements are");
        for(int x=0;x<n;x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println("\nafter removing the duplicate elements");
        duplicate(arr,n);
    }
}
