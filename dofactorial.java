package com.company.firstfeb;
import java.util.Scanner;
public class dofactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value =  ");

        int m;
        int fact = 1;
        do {

        int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println("The factorial is "+fact);

        System.out.println("if you want to continue so please press > yes");
            //choice = sc.nextLine();
            m=sc.nextInt();
        }
        while(m==1);
        //(choice==("Yes") || choice==("yes")) ;

       // System.out.println(fact)
       /* int fact=1;
	int m;
    do {
			System.out.println("Enter a Number :");
			int n=sc.nextInt();
            for(int i=1;i<=n;i++) {
				fact=fact*i;
			}

			System.out.println("The factorial is "+fact);

			System.out.println("If you want run again press 1 otherwise 0");
		m=sc.nextInt();
		}while(m==1);*/

    }
}
