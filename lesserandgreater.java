package com.company.secandthird;
import java.util.Scanner;
public class lesserandgreater {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
 String sum=n<10?(n>5? ("number is less than 10 \n number is grater than 5 "):("number is less than 10\n number is less  5")):((n>10)?
         "number grater than 10\n  number grater than 5 ":("number is less than 10 and  5"));

        System.out.println(sum);
}}
