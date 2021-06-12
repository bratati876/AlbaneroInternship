package Alberano;

import java.util.Scanner;

public class Q41 {

    static void frequency(int[] n,int l) {

//        for(int i=1;i<l;i++){
//            for(int j=i;j>0;j--){
//                if(n[j]<n[j-1]){
//                    int temp=n[j];
//                    n[j]=n[j-1];
//                    n[j-1]=temp;
//                }
//            }
//        }


        int[] cnt = new int[l];


//        for (int x : cnt) {
//            System.out.println(x + " ");
//        }

//        for(int i=0;i<l;i++) {
//
//                int count = 1;
//                for (int j = i + 1; j < l; j++) {
//                    if (n[i] == n[j]) {
//                        count++;
//                        for(int k=j+1;k<l;k++) {
//                            n[k - 1] = n[k];
//                            l--;
//                        }
//
//                    }
//                    else {
//                        break;
//                    }
//                }
//                System.out.println(n[i] + "->" + count);
//            }
//        }


        for (int i = 0; i < l; i++) {

            if (cnt[i] == 1)
                continue;

            int count = 1;
            for (int j = i + 1; j < l; j++) {
                if (n[i] == n[j]) {
                    cnt[j] = 1;
                    count++;
                }
            }
            System.out.println(n[i] + "->" + count);
        }
    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of elements in the array");
        int size=sc.nextInt();

        System.out.println("enter the array elements");
        int[] num=new int[size];

        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        frequency(num,size);
    }
}
