
#Simple mortgage calculator


package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //mortgage = (p* r* (1+r) power n)/ ((1+r) power n -1)
    Scanner scanner = new Scanner(System.in);   //import scanner for scanning objects
    System.out.print("Principal: ");
    long principal=scanner.nextLong();
    System.out.print("Annual Interest rate: ");
    float per =scanner.nextFloat();
    System.out.print("Period (Years): ");
    int year= scanner.nextInt();
    double rate=per/100/12;              //rate is annual and in percent: so divide by 100 and 12  to covert to monthly
    long n=year*12;                      // n in the formula is number of months
    double r=Math.pow(1+rate,n);
    double p= (r*rate)/(r-1);
    double P=principal*p;
    String amount= NumberFormat.getCurrencyInstance().format(P); //to get the dollar sign in mortgage
    System.out.println("Mortgage= "+ amount);

    }
}
