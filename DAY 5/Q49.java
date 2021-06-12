package Alberano;

import java.util.Scanner;

public class Q49 {
    static void aptriplet(int[] n, int l) {

        for(int i=1;i<l;i++){
            for(int j=i;j>0;j--){
                if(n[j]<n[j-1]){
                    int temp=n[j];
                    n[j]=n[j-1];
                    n[j-1]=temp;
                }
            }
        }

            for(int i=1;i<l;i++){
               for(int j=i+1;j<l;j++){
                   boolean yes=false;
                   int d=n[j]-n[i];
                   for(int x=0;x<i;x++){
                       if(n[x]==n[i]-d)
                       {
                           yes=true;
                           break;
                   }}
                   if(yes==true)
                    System.out.println(n[i]-d+" "+n[i]+" "+n[j]);
               }
           }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements in the array");
        int size = sc.nextInt();

        System.out.println("enter the array elements");
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        aptriplet(num, size);
    }
}