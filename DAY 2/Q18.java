package Alberano;

import java.util.ArrayList;
import java.util.Scanner;

public class Q18 {


        static void Divisors(int n)
        {
            ArrayList<Integer> array = new ArrayList<Integer>();
            for (int i=1;i<=n;i++)
                if (n%i==0)
                {
                      array.add(i);
                }

            System.out.println("the factors are ");
            System.out.println(array);
        }


        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
//            System.out.println("The divisors of 100 are: ");
            System.out.println("enter any number to find out the divisors");
            int n=sc.nextInt();
            Divisors(n);
        }
    }

