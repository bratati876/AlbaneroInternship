package Alberano;

import java.util.Scanner;

public class Q34 {

    static boolean len(int n1,int n2){
        String s1,s2;

        s1=Integer.toString(n1);
        s2=Integer.toString(n2);

        if(s1.length()==s2.length())
            return true;
        else
            return false;

    }

    static boolean counter_part(int n1,int n2){
       String s1,s2;int c=0;

       s1=Integer.toString(n1);
       s2=Integer.toString(n2);
       if(len(n1,n2)==true) {
           for (int i = 0; i<s1.length();i++){
               if(Integer.parseInt(String.valueOf(s2.charAt(i))) >= Integer.parseInt(String.valueOf(s1.charAt(i)))){
                   c++;
               }
           }
       }

       if(c==s1.length())
           return  true;
       else
           return false;
    }

    static int dig_dist(int n1,int n2){
        String s1,s2;int sum=0,diff=0;

        s1=Integer.toString(n1);
        s2=Integer.toString(n2);
        if(counter_part(n1,n2)==true){
            for (int i = 0; i<s1.length();i++){
                diff=Integer.parseInt(String.valueOf(s2.charAt(i))) - Integer.parseInt(String.valueOf(s1.charAt(i)));
                    sum+=diff;

            }

        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two digits");
        int num1,num2;

        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("the sum of difference of the digits :"+dig_dist(num1,num2));

    }
}
