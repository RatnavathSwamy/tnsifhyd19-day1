package com.day1;

public class project17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=3467;
		int count=0;
		int temp=num;
		while(temp!=0)
		{
			temp/=10;
			count++;
			
		}
		System.out.println("number of digits in"+num+"is:"+count);

	}

}
