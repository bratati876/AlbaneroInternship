package Alberano;

import java.util.Scanner;

public class Q24 {
    static Scanner sc = new Scanner(System.in);
    static int[][] num = new int[10][10];

    static void reverse_image() {
        int count = 0;
        System.out.println("enter the no of rows ");
        int rows = sc.nextInt();
        System.out.println("enter the no of columns ");
        int col = sc.nextInt();
        System.out.println("Enter the matrix elemets");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("Before reversing:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if(num[i][j]==1)
                    num[i][j]=0;
                else{
                    num[i][j]=1;
                }
            }
        }

        System.out.println("After reversing the image:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        reverse_image();
    }
}
