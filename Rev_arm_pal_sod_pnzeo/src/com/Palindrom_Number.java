package com;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;

		int num;
		System.out.println("enter any reverse  number:-");
		Scanner sc=new Scanner(System.in);
		 num=sc.nextInt();
		 int temp=num;
		while(num>0) {
			rev=(rev*10)+num%10;
			num=num/10;
		}
System.out.println("reverse number is:- "+rev);
if(temp==rev) {
	System.out.println(temp + " is palindrom number");
}else {
	System.out.println(temp + " is not palindrom number");
	sc.close();
}
	}


}
