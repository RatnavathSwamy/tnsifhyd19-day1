package com.day1;

import java.util.Scanner;

public class project13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any year:");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean leap=((year%4==0)&&(year%100!=0))||(year%400==0);
		if(leap)
		{
			System.out.println(year+"is a leap year");
		}
		else
		{
			System.out.println(year+"is not a leap year");
		}

		}
	}


