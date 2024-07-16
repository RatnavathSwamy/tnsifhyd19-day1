package com.day1;
import java.io.*;
import java.util.Scanner;

public class project2 {
public static void main(String args[]) {
	System.out.print("enter the input :");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	if(a%2==0)
	{
		System.out.println(a+"is a even number");
	}
	else
	{
		System.out.println(a+"is odd number");
	}
}

}
