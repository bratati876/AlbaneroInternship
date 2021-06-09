package Alberano;

import java.util.Scanner;

public class Q17 {
    static Scanner sc=new Scanner(System.in);
    static int[][] num=new int[10][10];

    static int even_sum() {
        int sum = 0;
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

        for (int arr[] : num) {
            for (int x : arr) {
                if (x % 2 == 0) {
                    sum += x;
                }
            }
        }
        return sum;
    }
    public static  void main(String args[]){
        System.out.println("the sum of even elements will be "+even_sum());
    }
}
