package Alberano;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {

    int sum(int[] a){
        int sum=0;
        for(int x:a)
            sum+=x;
        return sum;
    }
    int posum() {
        int s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("enter the array elements");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("enter the k value");
        int k=sc.nextInt();
        Arrays.sort(num);

        int low=0;
        int high= num.length-1;

        for(int i=0;i<k;i++){
            if(num[low]>0 && num[high]>0){
                num[low]=-num[low];
                s=sum(num);
            }
            else if(num[low]<0 && num[high]>0){
                num[low]=-num[low];
                s=sum(num);
            }



        }
        return s;

    }
}