package Alberano;

import java.util.Scanner;

public class Q29 {

   static String square(int n){
        String s=Integer.toString(n);
//       System.out.println(s);

        byte[] num=new byte[s.length()];
        num=s.getBytes();

//        for(byte x: num){
//            System.out.print(x+" ");
//        }
        String s1="";

        for(int i=0;i<s.length();i++){
            int temp=Integer.parseInt(String.valueOf(s.charAt(i)));
            s1+=Integer.toString(temp*temp);
        }

        return s1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();

        System.out.println("the number with squares :"+ square(n));
    }


}
