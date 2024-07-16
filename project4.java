package com.day1;

import java.util.Scanner;

public class project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2)
		{
			System.out.println("its a prime number");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
		}
		if(count==2)
		{
			System.out.println("its a prime number");
		}
		else
		{
			System.out.println("its not a prime number");
		}

	}

}
