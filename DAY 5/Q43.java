package Alberano;

import java.util.Scanner;

public class Q43 {

    static void represent(int[][] n,int r,int c){
        int non_zero=0;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               if(n[i][j]==1)
                   non_zero++;
            }
        }

        int [][]convert=new int[non_zero][3];

        int k = 0;
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (n[i][j] != 0)
                {
                    convert[k][0] = i;
                    convert[k][1] = j;
                    convert[k][2] = n[i][j];
                    k++;
                }
            }
        }
        System.out.println("the triplet representation is :");

        for (int i = 0; i < non_zero; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.printf("%d ", convert[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in) ;

        System.out.println("\t\tenter the spars matrix\n\n");

        System.out.println("enter the no of rows and cols");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] spars=new int[row][col];

        System.out.println("enter the matrix elements");

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                spars[i][j]=sc.nextInt();
            }
        }

        represent(spars,row,col);
    }
}
