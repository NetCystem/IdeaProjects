package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //646

        //string version

//        Scanner sca=new Scanner(System.in);
//
//        String tox=sca.nextLine();
//        int count = 0;
//
//        for (int i=0; i<tox.length();i++){
//            if(tox.charAt(i) == 'a'){
//                count++;
//
//            }
//        }
//        System.out.println(count);

        //647
//        Scanner sca=new Scanner(System.in);
//        int n=sca.nextInt();
//        String tox1="";
//        String tox2="";
//
//        boolean t=false;
//
//
//
//        for (int i=0;i<n;i++){
//            tox1+=sca.next().charAt(0);//vercnuma amen nermucac stringi arajin simvol@
//
//
//        }
//
//
//        for (int i=0; i<n; i++){
//            tox2+=tox1.charAt(n-i-1);
//        }
//
//        for (int i=0; i<n; i++){
//            if(tox1.charAt(i)==tox2.charAt(i)){
//                t=true;
//            }
//            else {
//                t=false;
//            }
//        }
//
//        System.out.println(t);

        //648
//        Scanner sca=new Scanner(System.in);
//        String tox=sca.nextLine();
//        int index=0;
//        for (int i=0; i<tox.length();i++){
//            if(tox.charAt(i)=='x'){
//                index=i;
//            }
//        }
//        int count=0;
//
//        for (int i=index+1; i<tox.length(); i++){
//            if(tox.charAt(i)=='0'){
//                count++;
//            }
//        }
//
//        System.out.println(count);

        //649
//        Scanner sca=new Scanner(System.in);
//        String tox=sca.nextLine();
//
//        int index=0;
//
//        for (int i=0; i<tox.length();i++){
//            if(tox.charAt(i)=='z'){
//                index=i;
//                break;
//            }
//        }
//        int count=0;
//
//        for (int i=index+1; i<tox.length(); i++){
//            if(tox.charAt(i)!='z'){
//                count++;
//
//            }
//        }
//
//        System.out.println(count);



        //653
//        Scanner sca=new Scanner(System.in);
//
//        String str1=sca.nextLine();
//        String str2="";
//
//        for (int i=0; i<str1.length(); i++){
//            str2+=str1.charAt(i);
//            if (str1.charAt(i)=='a'){
//                str2+='c';
//            }
//            //erkar tarberak
////            if (str1.charAt(i)=='a'){
////                str2+=str1.charAt(i);
////                str2+='c';
////            }else {
////                str2+=str1.charAt(i);
////            }
//        }
//
//        System.out.println(str2);

        //char [] charArray1= str1.toCharArray();///str1 string@ veracum chareri zanfvaci
        //String str2=new String(charArray2);//charArray2 chareri zangvac@ veracuma noric stringi


        //654
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        int n=str1.length();
//
//        for (int i=0; i<n; i++){
//            if(str1.charAt(i)!='a'){
//                str2+=str1.charAt(i);
//            }
//        }
//
//        System.out.println(str2);

        //655
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        int n=str1.length();
//
//        for (int i=0; i<n; i++){
//            str2+=str1.charAt(n-i-1);
//        }
//
//        System.out.println(str2);

        //656
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        int n=str1.length();
//
//        for (int i=0; i<n; i++){
//
//            if (str1.charAt(i)!='x') {
//                str2+=str1.charAt(i);
//
//            }else {
//                str2+='y';
//                str2+='y';
//            }
//
//        }
//
//        System.out.println(str2);


        //657
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        if(str1.length()%2==0){
//            for (int i=0; i<str1.length(); i+=2){
//                if (str1.charAt(i)> str1.charAt(i+1)){
//                    str2+=str1.charAt(i);
//
//                }else {
//                    str2+=str1.charAt(i+1);
//                }
//            }
//        }else {
//
//            for (int i = 0; i < str1.length() - 1; i += 2) {
//                if (str1.charAt(i) > str1.charAt(i + 1)) {
//                    str2 += str1.charAt(i);
//
//                } else {
//                    str2 += str1.charAt(i + 1);
//                }
//            }
//            str2+=str1.charAt(str1.length()-1);
//        }
//
//
//
//        System.out.println(str2);

        //658
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//
//        if (str1.length()%2==0){
//            for (int i=0; i<str1.length(); i+=2){
//                str2+=str1.charAt(i+1);
//                str2+=str1.charAt(i);
//            }
//
//        }else {
//            for (int i=0; i<str1.length()-1; i+=2){
//                str2+=str1.charAt(i+1);
//                str2+=str1.charAt(i);
//
//
//            }
//            str2+=str1.charAt(str1.length()-1);
//
//        }
//
//
//        System.out.println(str2);



        //659
//        Scanner sca=new Scanner(System.in);
//        String str=sca.nextLine();
//        boolean t=false;
//
//        int count1=0;
//        int count2=0;
//        int y=0;
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='c'){
//                count1++;
//            }
//        }
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='d'){
//                count2++;
//            }
//        }
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='x'){
//                y=count1;
//                t=true;
//                break;
//
//            }else {
//
//                y=count2;
//                t=false;
//            }
//
//        }
//
//        if (t){
//            System.out.println("The count of c" + " " + "=" +" " + y);
//        }else {
//            System.out.println("The count of d" + " " + "=" +" " + y);
//        }

        //660-kisat
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        for (int i=0; i<str1.length();i++){
//
//        }




        //671
//        Scanner sca=new Scanner(System.in);
//
//        System.out.println("enter arrays count");
//
//        int m=sca.nextInt();
//        char [] charArrays=new char[m];
//
//        System.out.println("enter arrays length");
//        int n=sca.nextInt();
//        char [] array=new char[n];
//
//        int count=0;
//        for (int j=0; j<m; j++) {
//            for (int i = 0; i < n; i++) {
//                array[i] = sca.next().charAt(0);
//
//
//            }
//            count++;
//        }
//
//
//
//
//
//        System.out.println(count);
//        Scanner sca=new Scanner(System.in);
//
//
//
//
//        int m=sca.nextInt();
//        int n=sca.nextInt();
//        char[] starray=new char[m];
//
//
//                for (int i=0; i<=m;i++){
//                    String str=sca.nextLine();
//
//                }
//
//        if (str.length()==n && str.contains("295454"))
//
//            System.out.println(str.substring(0,n-6));


        //661
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//
//        for (int i=0; i<str1.length(); i++){
//
//            if (str1.charAt(i)!='v'){
//                str2+=str1.charAt(i);
//            }else {
//                break;
//            }
//        }
//
//
//        System.out.println(str2);


        //663
//        Scanner sca=new Scanner(System.in);
//        String str=sca.nextLine();
//        int y=0, count=0;
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='c'){
//                y+=i;
//                count++;
//            }
//        }
//
//
//        System.out.println(y/count);

//        //667
//        Scanner sca=new Scanner(System.in);
//        String str=sca.nextLine();
//        int count1=0;
//        int count2=1;
//
//        for (int i=0; i<str.length(); i++){
//            if (str.charAt(i)=='z'){
//                count1+=i;
//                count2*=i;
//            }
//        }
//
//
//        System.out.println(count1);
//        System.out.println(count2);

        //668
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//
//        for (int i=0; i<str1.length(); i++){
//            if (i%3!=0){
//                str2+=str1.charAt(i);
//
//            }
//        }
//
//
//        System.out.println(str2);

        //670
//        Scanner sca=new Scanner(System.in);
//        String str=sca.nextLine();
//        int count=0;
//
//        for (int i=1; i<str.length()-1; i++){
//            if (str.charAt(i)>str.charAt(i-1) && str.charAt(i)>str.charAt(i+1)){
//                count++;
//            }
//        }
//
//
//        System.out.println(count);


        //673
//        Scanner sca=new Scanner(System.in);
//        String str=sca.nextLine();
//        boolean t=false;
//
//
//            if(str.endsWith("yan")){
//                t=true;
//
//            }else {
//                t=false;
//            }
//
//        System.out.println(t);

//        //674
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//                    str2+=str1.replace("a","b");
//
//
//        System.out.println(str2);



        //675
//        Scanner sca=new Scanner(System.in);
//        String str1=sca.nextLine();
//        String str2="";
//
//        str2+=str1.replace("ab","");
//
//
//        System.out.println(str2);

















    }


    }

