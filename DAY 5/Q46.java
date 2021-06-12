package Alberano;

import java.util.Scanner;

public class Q46 {

    static boolean start(String s){
        System.out.println(s.charAt(0));
        return s.charAt(0) >= 'A' && s.charAt(0) <= 'Z';
    }

    static boolean end(String s)
    {
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-1));
        return s.charAt(s.length()-1)=='.';
    }

    static boolean two_space(String s){
        boolean yes=false;
        for(int i=0;i<s.length();i++){
           if( s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' )
                yes=true;

        }
        return yes;
    }

    static boolean twoupper(String s){
        boolean yes=true;
        for(int i=0;i<s.length();i++) {
         if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
             if(s.charAt(i+1) >= 'A' && s.charAt(i+1) <= 'Z')
                  yes=false;
        }
        return yes;
    }

    static boolean verify(String s){
        if(start(s)==true && end(s)==true && two_space(s)==true && twoupper(s)==true)
            return true;
        else
            return false;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String sen;

        System.out.println("Enter a simple sentence:");
        sen=sc.nextLine();


        System.out.println(verify(sen));

    }
}
