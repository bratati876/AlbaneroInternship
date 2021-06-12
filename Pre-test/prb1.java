package Alberano;

import java.util.Scanner;

public class prb1 {

    static void separate(String s) {

        String[] words = s.split(" ");
int count=0;
        for (String word : words) {

            int start = s.indexOf(word);
            int end = start + (word.length() - 1);
            if(valid(word, start, end) == true)
            {
                System.out.println("["+"\n"+"{startIndex:"+start+","+"endIndex:"+end+"}"+" "+"\n"+"]");

            }
            else{
                count++;
            }
        }
        if(count== words.length){
            System.out.println("[]");
        }
    }

    static boolean valid(String s,int start,int end){
        int count_vowel=0,count_repeat=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u'){
               count_vowel++;
            }
            if(c[i]==c[i+1] && c[i+1]==c[i+2]){
                count_repeat++;
            }
        }

        if(count_vowel==0 || count_repeat>0){
         return true;
        }
        else
            return false;

    }

}

class end{
    public static void main(String args[]){
       String s;
        System.out.println("enter the sentence");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();

        prb1.separate(s);

    }
}