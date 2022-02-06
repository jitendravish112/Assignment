package com.company.firstfeb;
import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value  =  ");

        int count=0;
        int n=sc.nextInt();
        int n1=n;
        while(n>0) {
            n /= 10;
            count++;}
            System.out.println("Total number of digits of   " + n1 + " = " + count);
        }
}
