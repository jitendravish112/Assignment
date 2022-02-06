package com.company;

import java.util.Scanner;

public class Tempraturetocls {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    System.out.println("Enter fahrenheit temperature");
    int f = s.nextInt();
    float c;
    c=((f-32)*5)/9f;
    System.out.println("celsiou temperature "+c);
}
}
