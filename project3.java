package com.day1;

import java.util.Scanner;

public class project3 {
public static void main(String[] args) {
	int i,fact=1;
	System.out.println("enter any number:");
	Scanner k=new Scanner(System.in);
	int n=k.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println("the factorial of"+n+"is"+fact);
}
}
