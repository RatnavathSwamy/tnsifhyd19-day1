package com.day1;
import java.util.*;
public class project19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {4,6,5,3,6};
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				int temp=0;
				if(array[j]<array[i])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
			//for(i=0;i<=array.length;i++)
			System.out.print("manimum and miximum of array is"+array[0]+"and"+array[array.length-1]);
		
	/*	Arrays.sort(array);
		System.out.println("minimum and maximum of array is:"+array[0]+"and"+array[array.length-1]);
		*/
	
	}
	}


