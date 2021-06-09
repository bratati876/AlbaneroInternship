package Alberano;

import java.util.Scanner;

public class Q7 {


        static int longestSubSeg(int a[], int n,
                                 int k)
        {
            int cnt0 = 0;
            int l = 0;
            int max_len = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == 0)
                    cnt0++;
                while (cnt0 > k) {
                    if (a[l] == 0)
                        cnt0--;
                    l++;
                }

                max_len = Math.max(max_len, i - l + 1);
            }

            return max_len;
        }

        public static void main (String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int a[];
            System.out.println("enter the size of the array");
            int size=sc.nextInt();
            a = new int[size];

            for(int i=0;i<size;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("enter the value of k");
            int k=sc.nextInt();
            int n = a.length;
            System.out.println( longestSubSeg(a, n, k));

        }
    }

