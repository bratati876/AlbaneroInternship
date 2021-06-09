package Alberano;

import java.util.Scanner;

public class Q9 {
    static int maxProfit(int price[], int start, int end)
    {

        if (end <= start)
            return 0;

        int profit = 0;

        for (int i = start; i < end; i++)
        {

            for (int j = i + 1; j <= end; j++)
            {

                if (price[j] > price[i])
                {

                    int curr_profit = price[j] - price[i]
                            + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);

                    profit = Math.max(profit, curr_profit);
                }
            }
        }
        return profit;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] price = new int[size];
        System.out.println("enter the array elements");

        for (int i = 0; i < size; i++) {
            price[i] = sc.nextInt();
        }
        System.out.print(maxProfit(price, 0, size - 1));
    }
}

