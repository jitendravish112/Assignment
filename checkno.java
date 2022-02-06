package com.company.secandthird;
import java.util.Scanner;
public class checkno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kindly Enter the number  =  ");
        int no=sc.nextInt();
        String str="";
        str=(no==10||no==20||no==30||no==40||no==50)?no+" "+"Yes,number is present":no+" "+"number is  not present";
        System.out.println(str);
    }
}
