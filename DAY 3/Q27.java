package Alberano;

import java.util.Scanner;

public class Q27 {

    public static void multiples(int n,int len){
        int []mul=new int[len];
        int m=1;

        for(int i=0;i<len;i++){
            mul[i]=n*m++;
        }

        System.out.println("the multiple array would be");

        for(int x:mul){
            System.out.print(x +" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,length;

        System.out.println("enter any number to het the multiplaes in the array");
        num=sc.nextInt();
        System.out.println("enter the length");
        length=sc.nextInt();

        multiples(num,length);
    }
}
