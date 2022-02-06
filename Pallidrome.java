package com.company;
import java.util.Scanner;
public class Pallidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String  =");
        String pal = sc.nextLine();
        String rev = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            rev = rev + pal.charAt(i);}

            if (pal.equals(rev)) { //compearing pal and rev
                System.out.print(pal+" "+"  is a pallidrome String");
            } else {
                System.out.println(pal+"  "+"is  not a pallidrome String");
            }

        }
    }


