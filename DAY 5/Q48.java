package Alberano;

import java.util.Scanner;

public class Q48 {

   static void findProduct(int arr[], int n)
    {
       int []left=new int[n];
        int []right=new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        right[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = left[i] * right[i];
        }

        for(int x:arr){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements in the array");
        int size = sc.nextInt();

        System.out.println("enter the array elements");
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        findProduct(num,size);
    }
}
