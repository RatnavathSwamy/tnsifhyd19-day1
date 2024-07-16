package com.day1;

public class project8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kittu",o="";
		int len=str.length();
		for(int i=(len-1);i>=0;--i)
		{
			o=o+str.charAt(i);
		}
		if(str.toLowerCase().equals(o.toLowerCase())) {
			System.out.println(str+"is a polindrome");
		}
		else
		{
			System.out.println(str+"is not polindrome");	
		}

	}

}
