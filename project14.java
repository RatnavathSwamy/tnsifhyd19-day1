package com.day1;

public class project14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3456;
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("the reverse number is:"+rev);

	}

}
