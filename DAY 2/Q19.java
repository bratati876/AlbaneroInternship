package Alberano;

import java.util.Arrays;
import java.util.Scanner;

public class Q19 {
   static boolean findPair(int[] A,int sum)

    {
//        int sum=0;

//        for(int x:A){
//            sum+=x;
//        }
        Arrays.sort(A);

        int low = 0;
        int high = A.length - 1;

        while (low < high)
        {
            if (A[low] + A[high] == sum)
            {
                return true;
            }

            if (A[low] + A[high] < sum) {
                low++;
            }
            else {
                high--;
            }
        }
     return false;
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int num[]=new int[size];
        System.out.println("enter the array elements ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("enter the number for the sum searching :");
        int sum=sc.nextInt();

        System.out.println(findPair(num, sum));
    }
}
