package Alberano;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {



    void sort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();
         int[] num=new int[size];
        System.out.println("enter the array elements");

        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);

        String sorted=Arrays.toString(num);
        System.out.println("the sorted array would be");

        System.out.println(sorted);

    }
    public static void main(String args[]){
       Q14 q=new Q14();
       q.sort();

    }
}
