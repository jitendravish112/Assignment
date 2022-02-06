package com.company.firstfeb;
import java.util.Scanner;
public class callmainmathod {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value =   ");
       int n = sc.nextInt();
       evenodd(n);
    }
    public static void evenodd(int n){
        int even;
if(n%2==0){
    System.out.println(n+"  is a even number ");
}
else {
    System.out.println(n + "  is a odd number");
}
    }
    }

