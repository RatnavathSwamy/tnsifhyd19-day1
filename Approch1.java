package com.day1;

public class Approch1 {
	
		
		int a =10; //instance variable
		static int b=20; //static variable
		
		
		
		public static void main(String[] args) {
			
			int c=30; //local variable
			
			
			//Accessing instance Variable by creating objects
			Approch1 a1 = new Approch1();
			System.out.println(a1.a);
			
			// Accessing static variable through class
			
			System.out.println(Approch1.b);
			
			//or Accessing same static variable by specific variable itself
			
			System.out.println(b);
			
			//Accessing local variable
			System.out.println(c);
			
		}

	}

