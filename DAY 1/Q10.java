package Alberano;

import java.util.Scanner;

public class Q10 {
   static Scanner sc=new Scanner(System.in);
    int num[];

    static void even(){
        System.out.println("enter the size of the array");
        int size=sc.nextInt();

        int[] num=new int[size];
        System.out.println("enter the array elemets");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        int[] even=new int[20];
        int j=0;
        for(int i=0;i<size;i++){
            if(num[i]%2==0){
                even[j++]=num[i];
            }
        }

        for(int i=0;i< even.length;i++){
            System.out.println(even[i]+"\n");
        }

    }

    public static void main(String args[]){
        Q10.even();
    }
}
