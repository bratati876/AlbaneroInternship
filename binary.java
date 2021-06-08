package Alberano;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class binary {

    static LinkedList<Integer> convertion(LinkedList<Integer> b){
        int[] arr=new int[b.size()];
        int i=0;

    LinkedList<Integer> decimal=new LinkedList<Integer>();

        Iterator it=b.iterator();
        while(it.hasNext()){
            arr[i++]= (int) it.next();
        }
        double k=0;Integer sum=0;
        for(int x:arr){
            x= (int) (x*Math.pow(2,k++));
            sum+=x;
        }
String s=sum.toString();
        for(int j=0;j<s.length();j++){
            decimal.add(Integer.parseInt(String.valueOf(s.charAt(j))));
        }


    return decimal;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    LinkedList<Integer> b_num=new LinkedList<Integer>();

        System.out.println("enter the no of digits in the binary number");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int ele=sc.nextInt();
            b_num.add(ele);
        }
    LinkedList<Integer> decimal=binary.convertion(b_num);


decimal.forEach((ele)-> System.out.println(ele+" "));


    }
}
