package Alberano;

import java.util.Scanner;

public class Q33 {

    public static String tostring(char[] n){
        String string=new String(n);
        return string;
    }

    static String capitalize(String[] names,int no){
        String result="";


        for(int i=0;i<no;i++) {

            String s = names[i];
            char[] n = s.toCharArray();
            for (int j = 0; j < n.length; j++) {
                if (j == 0 && n[j] != ' ') {
                    if (n[j] >= 'a' && n[j] <= 'z') {
                        n[j] = (char) (n[j] - 'a' + 'A');
                    }
                } else if (n[j] <= 'A' && n[j] <= 'Z') {
                    n[j] = (char) (n[j] - 'A' + 'a');
                }
            }
//            System.out.println("\""+tostring(n)+"\"");

            result+=tostring(n)+" ";
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println("Enter an array of strings");
        Scanner sc=new Scanner(System.in);

        String []name;

        System.out.println("enter how many names you want to input");
        int no=sc.nextInt();
        name=new String[no];
        for(int i=0;i<no;i++){
            name[i]=sc.next();
        }

        System.out.println("The modified strings are:\n"+capitalize(name,no));
    }
}
