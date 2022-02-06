package com.company;
import java.util.Scanner;
public class inchTometr{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the vale of inch");
        int inch=s.nextInt();
        float n= 0.0254f;
        float meters;
        meters=inch*n;
        System.out.print("meters  "+meters);
    }
}
