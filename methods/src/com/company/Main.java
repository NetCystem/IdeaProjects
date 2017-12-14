package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //616// mijin(innput());
        //617//newvec(input());
        //618//max(input());
        //620//mij(inputarray());
        //minmax(input());//621, 637
        //newarray(input()); //619, 622, 627, 628, 629, 633, 634, 639, 642, 643, 645
        //counts(input());//630, 636
        //max(input());//631, 640
        //min(input());//638
        //sqr(input());//632



    }

    //616
//    static int [] innput (){
//        Scanner sc=new Scanner(System.in);
//        int [] array = new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//
//        }
//        return array;
//    }
//
//    static  void mijin(int array[]){
//        int count=0, equal=0;
//            for (int i=0;i<array.length;i++) {
//                if (array[i]>0){
//                    count++;
//                    equal+=array[i];
//                }
//
//        }
//        System.out.println((double) equal/count );
//    }

    //617

//    static int[] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] vec=new int[sc.nextInt()];
//        for (int i = 0; i <vec.length ; i++) {
//            vec[i]=sc.nextInt();
//
//        }
//        return vec;
//    }
//
//    static void newvec(int vec[]){
//        int count=0;
//        for (int i = 0; i <vec.length ; i++) {
//            if (vec[i]<0){
//                count++;
//            }
//        }
//
//        int [] vec2=new int[count];
//        int index=0;
//
//                for (int i = 0; i <vec.length ; i++){
//                if (vec[i]<0){
//                    vec2[index]=vec[i];
//                    index++;
//                }
//        }
//         System.out.println(Arrays.toString(vec2));
//
//    }

    //618

//    static int [] input(){
//        Scanner scanner=new Scanner(System.in);
//        int [] array= new int[scanner.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=scanner.nextInt();
//        }
//        return array;
//    }
//
//    static void max(int array[]){
//        int maximum=array[0];
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] > maximum) {
//                maximum=array[i];
//
//            }
//        }
//        System.out.println(maximum);
//    }

    //619

//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void newarray(int array[]){
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        int count=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]%k!=0){
//                count++;
//            }
//        }
//
//        int [] array2=new int[count];
//        int index=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]%k!=0){
//                array2[index]=array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }


    //620

//    static int [] inputarray(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//
//        }
//        return array;
//    }
//
//    static void mij(int array[]){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int count=0;
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]>=a && array[i]<=b){
//                count+=array[i];
//            }
//        }
//        System.out.println(count);
// }


    //621

//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] vec=new int[sc.nextInt()];
//
//        for (int i = 0; i <vec.length ; i++) {
//            vec[i]=sc.nextInt();
//        }
//
//        return vec;
//    }
//
//    static  void minmax(int vec[]){
//
//        int mm=vec[0];
//
//
//        for (int i = 0; i <vec.length ; i++) {
//            if (vec[i]>mm){
//                mm=vec[i];
//            }
//
//        }
//        int max=mm;
//
//
//
//        for (int i = 0; i <vec.length ; i++) {
//            if (vec[i]<mm){
//                mm=vec[i];
//            }
//        }
//        int min=mm;
//        System.out.println("Min" + " " + "=" +" " + min);
//        System.out.println("Max" + " " + "=" +" " + max);
//    }


    //622

//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void newarray(int array[]){
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        int count=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]%k==0){
//                count++;
//            }
//        }
//
//        int [] array2=new int[count];
//        int index=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]%k==0){
//                array2[index]=array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //627
//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void newarray(int array[]){
//        int count=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]<0){
//                count++;
//            }
//        }
//
//        int [] array2=new int[count];
//        int index=0;
//
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i]<0){
//                array2[index]=i;
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //628

//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void newarray(int array[]) {
//        int count = 0;
//
//        for (int i = 1; i < array.length - 1; i++) {
//            if (array[i] > array[i - 1] + array[i + 1]) {
//                count++;
//            }
//        }
//
//        int[] array2 = new int[count];
//        int index = 0;
//
//        for (int i = 1; i < array.length - 1; i++) {
//            if (array[i] > array[i - 1] + array[i + 1]) {
//                array2[index] = array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //629
//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        int [] array=new int[sc.nextInt()];
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void newarray(int array[]) {
//        int count = 0, a=5, b=114;
//
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%3==0 && array[i]>=5 && array[i]<=114) {
//                count++;
//            }
//        }
//
//        int[] array2 = new int[count];
//        int index = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%3==0 && array[i]>=5 && array[i]<=114) {
//                array2[index] = array[i];
//                index++;
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //630

//    static int [] input(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter array's weight");
//        int [] array=new int[sc.nextInt()];
//
//        System.out.println("Enter array's values");
//        for (int i = 0; i <array.length ; i++) {
//            array[i]=sc.nextInt();
//        }
//        return array;
//    }
//
//    static void counts(int array[]) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter the K");
//        int k=sc.nextInt();
//        int count=0;
//
//        System.out.println("output count");
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]<0 && Math.abs(array[i])>k) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    //631

//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void max(int array[][]){
//        int max=array[0][1];
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (i<j && array[i][j]>max){
//                    max=array[i][j];
//                }
//
//            }
//
//        }
//        System.out.println(max);
//    }

    //632

//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void sqr(int array[][]){
//        double y=0;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (i+j>array.length-1){
//                    y+=Math.pow(array[i][j],2);
//                }
//
//            }
//
//        }
//        System.out.println(Math.sqrt(y));
//    }


   // 633
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void newarray(int array[][]){
//        int count=0;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (i>j){
//                    count++;
//                }
//            }
//        }
//
//        int [] array2=new int[count];
//
//        int index=0;
//
//       for (int i = 0; i <array.length; i++) {
//           for (int j = 0; j < array.length; j++) {
//               if (i > j) {
//                   array2[index] = array[i][j];
//                   index++;
//               }
//
//           }
//       }
//        System.out.println(Arrays.toString(array2));
//    }


    //634
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void newarray(int array[][]){
//        Scanner scanner=new Scanner(System.in);
//
//        int count=0;
//        System.out.println("Enter a & b");
//        int a=scanner.nextInt(), b=scanner.nextInt();
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (array[i][j]<a || array[i][j]>b) {
//                    count++;
//                }
//            }
//        }
//
//        int [] array2=new int[count];
//
//        int index=0;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]<a || array[i][j]>b) {
//                    array2[index] = array[i][j];
//                    index++;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //636
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void counts(int array[][]){
//        int count=1;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]%3!=0 && array[i][j]%5!=0 ) {
//                    count*=array[i][j];
//                }
//
//            }
//        }
//        System.out.println(count);
//    }

    //637

//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void minmax(int array[][]){
//        int max=array[0][0];
//        int min=array[0][0];
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]>max) {
//                    max=array[i][j];
//                }
//
//            }
//        }
//         for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]<min) {
//                    min=array[i][j];
//                }
//
//            }
//        }
//
//
//
//        System.out.println("Max" + " " + "=" + " " + max);
//        System.out.println("Min" + " " + "=" + " " + min);
//    }


    //638

//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void min(int array[][]){
//        int min=array[0][array.length-1];
//
//         for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]<min && i+j>=array.length-1) {
//                    min=array[i][j];
//                }
//
//            }
//        }
//
//        System.out.println("Min" + " " + "=" + " " + min);
//    }


    //639
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void newarray(int array[][]){
//        Scanner scanner=new Scanner(System.in);
//
//        int count=0;
//
//        int a=3, b=88;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (array[i][j]>=a && array[i][j]<=b && array[i][j]%5==0) {
//                    count++;
//                }
//            }
//        }
//
//        int [] array2=new int[count];
//
//        int index=0;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]>=a && array[i][j]<=b && array[i][j]%5==0) {
//                    array2[index] = array[i][j];
//                    index++;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //640
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void max(int array[][]){
//        int max=array[0][0];
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j]>max && i>=j) {
//                    max=array[i][j];
//                }
//
//            }
//        }
//
//        System.out.println("Max" + " " + "=" + " " + max);
//    }

    //642
//        static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void newarray(int array[][]){
//        Scanner scanner=new Scanner(System.in);
//
//        int count=0;
//
//        System.out.println("Enter the k");
//        int k=scanner.nextInt();
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (i+j<array.length-1 && array[i][j]>k) {
//                    count++;
//                }
//            }
//        }
//
//        int [] array2=new int[count];
//
//        int index=0;
//
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i+j<array.length-1 && array[i][j]>k) {
//                    array2[index] = array[i][j];
//                    index++;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }

    //643
//    static int [][] input(){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter Arrays lenghth");
//        int n=scanner.nextInt();
//        int [][] array=new int[n][n];
//
//        System.out.println("Enter Arrays values");
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <n ; j++) {
//                array[i][j]=scanner.nextInt();
//
//            }
//
//        }
//        return array;
//    }
//
//    static  void newarray(int array[][]){
//        Scanner scanner=new Scanner(System.in);
//
//        int count=0;
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (i==j && array[i][j]>0) {
//                    count++;
//                }
//            }
//        }
//
//        int [] array2=new int[count];
//
//        int index=0;
//        for (int i = 0; i <array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i==j && array[i][j]>0) {
//                    array2[index] = array[i][j];
//                    index++;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(array2));
//    }





    }
