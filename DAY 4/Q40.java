package Alberano;

import java.util.Scanner;

public class Q40 {

    static boolean subseq(String s,String t){

        if(s=="")
            return true;

        int i=0,j=0;
       while(i<s.length() && j<t.length()){
           if(s.charAt(i)==t.charAt(j))
           {
               i++;
           }
           j++;
       }
       if(i==s.length())
           return true;
       else
           return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings to check for the subsequence");

        String s1;
        String s2;

        s1=sc.nextLine();
        s2=sc.nextLine();

        System.out.println(subseq(s1,s2));

    }
}
