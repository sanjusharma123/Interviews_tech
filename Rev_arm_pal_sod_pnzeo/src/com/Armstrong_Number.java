package com;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, rem,arm=0,temp;
		System.out.println("enter any number");
Scanner sc=new Scanner(System.in);
temp=num;
while(num>0) {
	rem=num%10;
	arm=(rem*rem*rem)+arm;
	num=num/10;
	
}
if(temp==arm) {
	System.out.println(temp + " number is armstrong");
}
else {
	System.out.println(temp+ " number is not armstrong");
sc.close();
}

	}

}
