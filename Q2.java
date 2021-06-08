package Alberano;

import java.util.Scanner;

public class Q2 {

   static int depth(String s){
        int i=0,k=0;
        for(int j=0;j<s.length();j++){
            k=(k<i)?i:k;
            char c=s.charAt(j);
            if(c == '('){
                i++;
            }
            else if(c == ')'){
                i--;
            }
        }
        return k;
    }
}

class Main1{
    public static void main(String args[]){
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("the depth of the VPS is "+ Q2.depth(s1));
    }

}