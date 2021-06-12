package Alberano;

import java.util.Scanner;

public class Q44 {


    static int[] mul(int[] n, int s) {

        int[] res=new int[s];
        for (int i = 0; i < s; i++) {
            if (i == 0) {
                res[i] = n[i] * n[i + 1];
            } else if (i == s - 1) {
                res[i] = n[i] * n[i - 1];
            } else {
//                System.out.println("\n"+[i]);
                System.out.println(n[i + 1] * n[i - 1]);
                res[i] = n[i + 1] * n[i - 1];
            }
        }

        return res;
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements in the array");
        int size = sc.nextInt();

        System.out.println("enter the array elements");
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("before conversion :");
        for (int x : num) {
            System.out.print(x + " ");
        }
        int[] result = mul(num, size);

        System.out.println("The converted array would be");

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
