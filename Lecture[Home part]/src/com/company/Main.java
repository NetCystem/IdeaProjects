package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        ///223///
//	int [] array=new int[5];
//	int y=0;
//        Scanner sc=new Scanner(System.in);
//        Scanner sc1=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        int a=sc1.nextInt();
//        int b=sc2.nextInt();
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0; i<array.length; i++){
//            if (array[i]>a && array[i]<b){
//                y+=1;
//            }
//        }
//
//        System.out.println(y);

        //224//
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        int k=sc2.nextInt();
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0; i<array.length; i++){
//            if (Math.abs(array[i])<k){
//                y+=Math.pow(array[i],3);
//            }
//        }
//
//        System.out.println(y);


        ///227///

//        int [] array=new int[5];
//        int y=0;
//        Scanner sc1=new Scanner(System.in);
//        int k=sc1.nextInt();
//        Scanner sc2=new Scanner(System.in);
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc2.nextInt();
//        }
//
//        for (int i=0; i<array.length; i++){
//            if (i%k==0){
//                y+=array[i];
//
//            }
//        }
//        System.out.println(y/2);

        ///229///
//        int [] array=new int[5];
//        int y=1;
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array.length; i++){
//            if (array[i] - i>0){
//                y*=array[i];
//
//            }
//        }
//        System.out.println(y);

        //230//
//        double [] array=new double[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        Scanner sc1=new Scanner(System.in);
//        int k=sc1.nextInt();
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextDouble();
//        }
//
//        for (int i=0; i<array.length; i++){
//            int res=(int)array[i];
//            if (res%k==0){
//                y+=Math.pow(array[i],2);
//
//            }
//        }
//        System.out.println(Math.sqrt(y));
//




        ///246///
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array.length; i++){
//            if (Math.sqrt(i)%1==0){
//                y+=array[i];
//
//            }
//        }
//        System.out.println(y/2);


        ///251///
//        double [] array=new double[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextDouble();
//        }
//
//        for (int i=0; i<array.length; i++){
//            if (i<array.length-1) {
//                y = Math.max(array[i], array[i + 1]);
//            }
//
//
//        }
//        System.out.println(y);

        //252//

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        int [] array=new int[n];
//        int max = array[0];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=1; i<array.length; i++){
//            if (max < array[i]){
//                max = array[i];
//            }
//
//            }
//
//        System.out.println("The Maximum value of an Array" + " " + "=" + " " + max);


        //253// - stexel voobshe 0-a talis inch grum em

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array's length");
        int n=s.nextInt();

        int [] array=new int[n];
        int min = array[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array's Values");

        for (int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }

        for (int i=1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }

        }

        System.out.println("The Minimum value of an Array" + " " + "=" + " " + min);

        //257// - chi talis voch i=0, vochel 1- zhamanak

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        int [] array=new int[n];
//        int max = array[0];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array.length; i++){
//            if (max < array[i]){
//                max = i;
//                break;
//            }
//
//        }
//
//        System.out.println(max);


        //261//

//
//        int y1=0, y2=0;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        int [] array1=new int[n];
//        int [] array2=new int[n];
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array1.length; i++){
//            array1[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array2.length; i++){
//            array2[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array1.length; i++){
//            y1+=array1[i];
//
//            }
//
//        for (int i=0; i<array2.length; i++){
//            y2+=array2[i];
//
//
//        }
//
//
//        System.out.println((y1/n) * (y2/n));


        //277//

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        char [] array=new char[n];
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=0; i<array.length; i++){
//
//
//
//        }
//
//
//        System.out.println();













    }
}
