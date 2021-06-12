package Alberano;

import java.util.Scanner;

public class Q28 {

    public  static String parity(String s){
        int count=0;int parity;
        byte bin[]=s.getBytes();
        for(int i=0;i<s.length();i++){
            if(bin[i]==1)
                count++;
        }

        if(count%2==0){
            parity=0;
        }
        else {
            parity=1;
        }

        String s_final= s + Integer.toString(parity);

        return s_final;


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any binary number");
        int n=sc.nextInt();

        String s1=Integer.toString(n);

        System.out.println("With parity :"+ parity(s1));
    }
}
