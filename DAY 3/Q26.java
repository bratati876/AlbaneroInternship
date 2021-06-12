package Alberano;

import java.util.Scanner;

public class Q26 {
    static boolean repdigit(int n)
    {
        int nodig = 0;  int x = 0;

        if (n == 0) {
            return true;
        }

            int[] dig = new int[10];
            int i = 0;

            int temp = n, rem;
            while (temp != 0) {
                rem = n % 10;
                temp = temp / 10;
                nodig++;
                dig[i++] = rem;
            }
            while (x < dig.length) {
                if (dig[x] == dig[x + 1]) {
                    x++;
                } else {
                    return false;
                }

            }

//            if(x==dig.length)
                return true;


    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();

        System.out.println(repdigit(n));
    }
}
