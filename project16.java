package com.day1;

public class project16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1104,originalnum=num,res=0,rem,n=0;
		while(originalnum!=0)
		{
			originalnum/=10;
			++n;
		}
		originalnum=num;
		while(originalnum!=0)
		{
			rem=originalnum%10;
			res+=Math.pow(rem,n );
			originalnum/=10;
		}
		if(res==num)
		{
			System.out.println(num+"is armstrong num");
		}
		else {
			System.out.println(num+"is not armstrong num");
			
		}
		

	}

}
