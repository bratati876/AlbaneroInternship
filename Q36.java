package Alberano;

import java.util.Scanner;

public class Q36 {

    static int ways(int stair){
        if(stair <=1)
            return stair;
        return ways(stair-1)+ways(stair-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of stair we have to reach");
        int s=sc.nextInt();

        System.out.println("The no of ways we can reach to the top:" + ways(s)+1);
    }
}
