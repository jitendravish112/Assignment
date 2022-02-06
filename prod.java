package com.company;
import java.util.Scanner;
public class prod {public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the integer value");
    int a=s.nextInt();
    System.out.println("Enter the decimal value");
    float b=s.nextFloat();
    double prodd;
    prodd=a*b;
    System.out.println("Here is the Product of integer and Decimal  "+prodd);

}
}
