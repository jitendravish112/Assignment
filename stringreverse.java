package com.company;
import java.util.Scanner;
public class stringreverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the the name  =");
        String name=sc.nextLine();
        String res="";
        for(int i=name.length()-1;i>=0;i--)
            res =res+name.charAt(i);
        System.out.println(res);
    }

}
