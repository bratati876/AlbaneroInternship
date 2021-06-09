package Alberano;

import java.util.Arrays;
import java.util.Scanner;

public class Q20 {

    int five_sum() {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("enter the array elements");

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        for(int i=num.length-5;i<num.length;i++){
            sum+=num[i];
        }
        return sum;
    }

    public static void main(String args[]){
        Q20 q=new Q20();
        System.out.println("the maximum sum of five elements would be "+ q.five_sum());
    }
}
