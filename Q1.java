package Alberano;

import java.util.Scanner;

public class Q1 {

  static   String odd(int n){
        if(n>=1 && n<=500){
            String s="";

            if(n%2==0){
                for(int i=1;i<=n-1;i++)
                s+="a";

                s+="b";
            }
            else{
                for(int i=1;i<=n;i++)
                    s+="a";
            }
              return s;
        }
        else{
            return "out of range";
        }
    }
}

class Main{
    public static void main(String args[]){
        int noc;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of characters in the string");
        noc=sc.nextInt();

        System.out.println("the string would be "+ Q1.odd(noc));

    }
}
