package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] [] array=new int[n][];

        array[0][0]=1;
        array [0][1]=1;
        array [1][1]=1;

        System.out.println(array[0][0]);
        System.out.println(array[0][1] + " " + array[1][1]);




//        int [] array=new int[scanner.nextInt()];
//        int n=8;
//
//
//        int index=1;
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=index;
//            index++;
//        }
//
//        String str1 = "  ", str2=" " ;
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//
//            for (int j = 1; j <=n ; j++) {
//                System.out.print(charArray1);
//                for (int i = 0; i < array.length; i++) {
//                    System.out.print(charArray2);
//                    System.out.print(array[i]);
//
//                }
//                System.out.println();
//            }





    }
}
