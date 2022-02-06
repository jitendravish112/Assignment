package com.company.secandthird;
import java.util.Scanner;
public class vovelcons {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String z;
        z=ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'?"Vowel":"Consonant";
        System.out.println(z);
    }
}
