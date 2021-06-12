package Alberano;

import java.util.Scanner;

public class Q37 {

    static int binary_one(int n){
        int count=0;
        int binary[] = new int[40];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }

        for(int x:binary){
            if(x==1)
                count++;
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number which is the range");
        int n=sc.nextInt();

        int[] result=new int[n+1];
        int ind=0;

        for(int i=0;i<=n;i++){
            int no_one=binary_one(i);
            result[ind++]=no_one;

        }

        System.out.println("the array with the no of ones: ");

        for(int x:result){
            System.out.print(x+" ");

        }
    }
}
