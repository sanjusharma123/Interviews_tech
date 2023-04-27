package com;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int rev=0;
		System.out.println("enter any reverse  number:-");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0) {
		rev=(rev*10)+num%10;
		num=num/10;
		}
		System.out.println("reverse number is :- "+rev);
		sc.close();
	}

}
