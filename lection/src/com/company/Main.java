package com.company;

import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {

    public static void main(String[] args) {


        /////////////3-rd Lection///////////////////

//        int tiv1=8;
//        int tiv2=10;
//        int max =(tiv1>tiv2)? tiv1:tiv2;
//
//        System.out.print(max);
//    }
//}


///////while cikl////

//int i=0;
//while (i<7){
//
//    System.out.print(i);
//    i++;
//}


        ///do cikl///
//        int i=0;
//        do {
//            System.out.print(i);
//            i++;
//        }(i<7);


//        for(;;); //- anverj cikli greladzev


        /////////////Classs Work///////////3-rd Lection

        //151///
//        Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      int sum=0;
//        for (int i=1; i<200; i++){
//            if(n%i==0) {
//                sum+=i;
//
//
//            }
//
//        }
//        System.out.print(sum);

        ///152///
//        Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      int sum=1;
//        for (int i=1; i<200; i++){
//            if(n%i==0) {
//                sum*=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///153//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i=1; i<200; i++){
//            if(n%i==2) {
//                sum+=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///154///
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int sum=1;
//        for (int i=1; i<100; i++){
//            if(n%i==3) {
//                sum*=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///155///
//        int sum=0;
//        for (int i=10; i<100; i++){
//            if(i%3==0) {
//                sum+=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///157///
//
//        int sum=0;
//        for (int i=100; i<1000; i++){
//            if(i%5!=0) {
//                sum+=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///159//
//        int sum=0;
//        for (int i=100; i<1000; i++){
//            if(i%3==1 && i%4==2) {
//                sum+=i;
//
//
//            }
//
//        }
//        System.out.print(sum);


        ///161///
//        int i;
//        for (i=1000; i<10000; i++){
//            if(Math.sqrt(i*26)%1==0){
//                break;
//            }
//
//        }
//        System.out.println(i);


        ///////////////--Homework---/////////////////////3-rd lection


        ///156///with error
//        int sum=1;
//        for (int i=10; i<100; i++){
//            if (i%3==0 && i%5==0){
//                sum*=i;
//
//            }
//
//        }
//        System.out.print(sum);


        ///158///with error
//        int sum=1;
//        for (int i=100; i<1000; i++){
//
//            if(i%2!=0 && i%3!=0){
//                sum*=i;
//
//            }
//        }
//        System.out.print(sum);

        ///160///

//        int i;
//        for (i=100; i<1000; i++){
//            if(Math.sqrt(i*16)%1==0){
//                break;
//
//            }
//
//        }
//        System.out.println(i);

        ///162//
//        int i;
//        for(i=9999; i>=1000; i--){
//            if (Math.sqrt(i*14)%10==0){
//                break;
//            }
//
//        }
//        System.out.println(i);

        ///163///
//        int i;
//        for(i=9999; i>=1000; i--){
//            if (Math.sqrt(i*18)%1==0){
//                break;
//            }
//
//
//
//
//        }
//        System.out.println(i);

        ///164///
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i;
//        for (i=100; i<1000; i++){
//            if (Math.sqrt(i)>n){
//                break;
//
//            }
//
//        }
//        System.out.println(i);

        ///165///


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(), i;
//        boolean t=false;////xia senc uzum
//
//        for (i=1; i<100; i++){
//            if (n==Math.pow(3,i)){
//
//                t=true;
//                break;//ichia vor breake-@ hanum em false-a berum
//
//
//            }else {
//                t=false;
//            }
//
//        }
//
//        System.out.println(t);

        ///166///

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(), i, y=0;
//
//        for (i=1; i<100; i++) {
//            if (n!=Math.pow(4,i)){
//
//                y=0;
//
//
//
//            }else {
//                y=1;
//                break;/// noric break-i imast@
//            }
//
//        }
//        System.out.println(y);

        ///167///

//        boolean y=false;//// xia senc uzum
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt(),n;
//
//
//        for (n=1;n<30;n++){
//
//            if (Math.sin(Math.pow(x,n))<0){
//                y=true;
//                break;
//
//
//            }else {
//                y=false;
//
//            }
//        }
//        System.out.println(y);

        //168/// - vonc stugel tiv@ parza te che
//        boolean p=false;
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        if (n<2){
//            p=false;
//        }else {
//            for (int i=2; i*i<=n;i++){
//                if (n%i!=0){
//                    p=true;
//                    break;
//
//                }
//            }
//        }
//
//        System.out.println(p);


        /// 169///// - eli nuin@ u sxala ashxatum


//        Scanner sc1=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        int x=sc1.nextInt();
//        int y=sc2.nextInt();
//        int z=0;
//            for (int i=2; i*i<=x+y;i++){
//                if (x+y>=2 && (x+y)%i!=0){
//                    z=5;
//                    break;
//
//                }else {
//                    z=6;
//
//                }
//
//            }
//
//        System.out.println(z);


        ///170//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(), i;
//        for (i=0; i<10000;i++){
//            if (n<Math.pow(2,i)){
//
//                break;
//
//            }
//        }
//        double j=Math.pow(2,i);
//
//        System.out.println((int)j);

        ///171///
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(), i, faktorial=1;///xia initilizatia uzum
//        for (i=1; i<=n; i++){
//            faktorial*=i;
//        }
//        System.out.println(faktorial);


        ///172///

//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(), i, dfactorial=1;///xia initilizatia uzum
//        if (n%2==0){
//
//            for (i=2;i<=n; i++){
//                if (i%2==0){
//                    dfactorial*=(n+2)-i;
//
//                }
//
//
//            }
//        }else
//            {for (i=1;i<=n;i++){
//                if (i%2!=0){
//                    dfactorial*=(n+1)-i;
//                }
//
//            }
//
//        }
//
//        System.out.println(dfactorial);

        ///180/// chem karum kazmakerpem tpel@
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),i;
//        if(n>0){
//
//            for (i=0; i<i+1; i++){
//                if (Math.pow(3,i)==n){
//                    System.out.println(true);
//                    break;
//
//
//                }else {
//                    System.out.println(false);
//                }
//
//
//            }
//        }


        //181//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),i;
//        for (i=0; i<=n; i++){
//            if (n==Math.pow(2,i)){
//                break;
//            }
//        }
//        System.out.println(i);


        //182//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),k;
//        for (k=n; k<=n; k--){
//            if (n>=Math.pow(k,2)){
//                break;
//            }
//        }
//        System.out.println(k);


        //183//
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),k;
//        if (n>1){
//
//            for (k=2; k<n; k++){
//                if (n<Math.pow(3,k)){
//                    break;
//                }
//            }
//            System.out.println(k);
//        }


        ///184///
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),k;
//
//        if (n>1){
//            for (k=n; k<=n; k--){
//                if (n>Math.pow(3,k)){
//                    break;
//                }
//            }
//            System.out.println(k);
//        }

//        ///185///
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt(),k;

        ///71///
//        double i=2.4;
//        while (i<=7.6){
//
//            double y=Math.tan((2*i)+Math.pow(i,2));
//            System.out.println(y);
//            i+=0.2;
//        }

        ///72///
//        double i=-5.4;
//        while (i<=1.2){
//
//            double y=Math.pow(Math.tan(Math.pow(i,2)),2);
//            System.out.println(y);
//            i+=0.4;
//        }

        ///73///
//        double i=7.5;
//        while (i<=12.5){
//
//            double y=Math.pow((i+1),2);
//            System.out.println(y);
//            i+=0.2;
//        }

        ///74///
//        double i=-3.8;
//        while (i<=5.4){
//
//            double y=Math.pow(2,(i+4));
//            System.out.println(y);
//            i+=0.3;
//        }

        ///75/// - inch vor nana talis
//        double i=-3.14;
//        while (i<=3.14){
//
//            double y=Math.pow(Math.sin(i),2) + Math.cos(i);
//            System.out.println((int)y);
//            i+=i/8;
//        }

        ///76///

//        short i=-5;
//        while (i<=5){
//            if (i>0){
//                double y=Math.pow(i,2) + (Math.pow(i,8)*4);
//                System.out.println(y);
//
//            }else
//            {
//                System.out.println(0);
//            }
//
//
//            i+=2;
//        }

        ///77///
//        short i=-8;
//        while (i<=8){
//            if (i>3){
//                double y=Math.pow(i,2) + (Math.pow(i,8)*4);
//                System.out.println(y);
//
//            }else
//            {
//                System.out.println(0);
//            }
//
//
//            i+=3;
//        }



        //82//

//        double i=-2.7;
//        do {
//            double y=Math.pow(i+Math.pow(i,2),7);
//            System.out.println(y);
//            i+=0.5;
//        }while (i<=3.3);


        ///83//
//        double i=-4.8;
//        do {
//            double y=Math.pow(Math.atan(i+1),2);
//            System.out.println(y);
//            i+=0.2;
//        }while (i<=5.2);

        ///85///

//        double i=-3.3;
//        do {
//            double y=Math.abs(2*i + Math.pow(i,3));
//            System.out.println(y);
//            i+=0.3;
//        }while (i<=2.7);


        ///90///
//        int i=-30;
//        do {
//            if (i>5){
//                double y=Math.sin(i);
//                System.out.println(y);
//            }else {
//                double y=Math.cos(i);
//                System.out.println(y);
//            }
//
//            i+=3.5;
//        }while (i<=30);





        ///zangvacner//4-rd das

        //int [] array=new  int[5];// sarqec 5 hat elementow zangvac

        //int [] array={5,6,7,8,9};

        //int array[]={5,6,7,8,9};


//        int array[]={};
//        Scanner sc=new Scanner(System.in);
//
//
//        for (int i=0; i<array.length;i++){
//
//            array[i]=sc.nextInt();
//        }

        //211//

//        int [] array=new int[3];
//        int y=0;
//
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//
//        for (int i=0;i<array.length;i++){
//            y+=array[i];
//
//
//        }
//        System.out.println(y/array.length);

        ///212///
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]>0){
//                y+=Math.pow(array[i],2);
//            }
//
//        }
//        System.out.println(Math.sqrt(y));

        //213//
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length; i++) {
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++) {
//            if(array[i]<0){
//
//               y+=Math.pow(array[i],2);
//            }
//
//        }
//        System.out.println((int) Math.sqrt(y));

        /////nuin@ foreach-ov, baic inch vor ban  sxal em anum chi talis
        //        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i:array) {
//            i=sc.nextInt();
//
//        }
//        for (int i:array) {
//            if(i<0){
//
//               y+=Math.pow(array[i],2);
//
//
//            }
//
//
//        }
//
//        System.out.println(y);

        ///214///
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]<0){
//                y+=array[i];
//            }
//
//        }
//        System.out.println(y/2);

        ///215///
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (i!=0 && i%2==0){
//                y+=array[i];
//            }
//
//        }
//        System.out.println(y);

        ///216///
//        int [] array=new int[5];
//        double y=1;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (i!=0 && i%2==0){
//                y*=array[i];
//            }
//
//        }
//        System.out.println(y);

        ///217///

//        int [] array=new int[5];
//        double y=1;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (i!=0 && i%2!=0){
//                y*=Math.pow(array[i],2);
//            }
//
//        }
//        System.out.println(y);

        ///218///
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (i!=0 && i%2!=0){
//                y+=Math.abs(array[i]);
//            }
//
//        }
//        System.out.println(y);

        ///219///

//        int [] array=new int[5];
//        double y=0;
//        Scanner sc1=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        int k=sc2.nextInt();
//        for (int i=0; i<array.length;i++){
//            array[i]=sc1.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (i%k==0){
//                y+=1;
//            }
//
//        }
//        System.out.println((int)y);

        //220///
//        int [] array=new int[5];
//        double y1=0, y2=0;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0; i<array.length;i++){
//            array[i]=sc.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]>0){
//                y1+=1;
//            }else {
//                y2+=1;
//            }
//
//        }
//        System.out.println("drakan tarrer" + " " + (int)y1);
//        System.out.println("bacasakan tarrer" + " " + (int)y2);

        //221//
//
//        int [] array=new int[5];
//        double y=0;
//        Scanner sc1=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        Scanner sc3=new Scanner(System.in);
//        int a=sc2.nextInt();
//        int b=sc2.nextInt();
//
//        for (int i=0; i<array.length;i++){
//            array[i]=sc1.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]>=a && array[i]<=b) {
//                y+=array[i];
//            }
//
//        }
//        System.out.println((int)y);

        //222//

//        int [] array=new int[5];
//        double y=1;
//        Scanner sc1=new Scanner(System.in);
//        Scanner sc2=new Scanner(System.in);
//        Scanner sc3=new Scanner(System.in);
//        int c=sc2.nextInt();
//        int d=sc2.nextInt();
//
//        for (int i=0; i<array.length;i++){
//            array[i]=sc1.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            if (array[i]>=c && array[i]<=d) {
//                y*=array[i];
//            }
//
//        }
//        System.out.println((int)y);






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

//                //252//
//
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        int [] array=new int[n];
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=s.nextInt();
//        }
//
//        int max = array[0];
//
//        for (int i=1; i<array.length; i++){
//            if (max < array[i]){
//                max = array[i];
//            }
//
//            }
//
//        System.out.println("The Maximum value of an Array" + " " + "=" + " " + max);


                //253//

//                Scanner s=new Scanner(System.in);
//                System.out.println("Enter Array's length");
//                int n=s.nextInt();
//                int [] array=new int[n];
//                System.out.println("Enter Array's Values");
//
//                for (int i=0; i<array.length; i++){
//                    array[i]=s.nextInt();
//                }
//        int min = array[0];
//
//
//        for (int i=0; i<array.length; i++){
//                    if (min > array[i]  ){
//                        min = array[i];
//                    }
//
//                }
//
//                System.out.println("The Minimum value of an Array" + " " + "=" + " " + min);

                //257//

//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        int [] array=new int[n];
//
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=s.nextInt();
//        }
//
//        int max = array[0];
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
//
//        int count=0;
//        Scanner s=new Scanner(System.in);
//        System.out.println("Enter Array's length");
//        int n=s.nextInt();
//
//        char [] array=new char[n];
//
//        System.out.println("Enter Array's Values");
//
//        for (int i=0; i<array.length; i++){
//            array[i]=s.next().charAt(0);
//        }
//
//
//        for (int i=0; i<array.length; i++){
//            if (array[i]=='d'){
//                count++;
//
//            }
//
//            char [] array2=new char[n-count];
//            int index=0;
//            for (i=0; i<array2.length; i++){
//                array2[i]=array[i];
//                index++;
//
//
//
//
//
//            }
//
//
//
//        }
//
//
//
//
//
//        System.out.println();













            }
        }




