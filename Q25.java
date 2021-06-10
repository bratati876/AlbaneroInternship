package Alberano;

import java.util.Scanner;

public class Q25 {

    static boolean isogram(String s) {
        int cnt = 0;

        char iso[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (iso[i] == iso[j]) {
                    System.out.println(iso[j]);
                    cnt++;


                }
            }
        }
        if(cnt>0)
            return false;
        else
            return true;
    }
    public static void main(String args[]){
        String s1;
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();

        System.out.println(isogram(s1));
    }
}
