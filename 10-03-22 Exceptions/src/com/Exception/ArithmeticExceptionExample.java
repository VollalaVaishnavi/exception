package com.Exception;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
	  
		try {

			int a=10,b=0,c;
			c=a/b;
			System.out.println("value of c is: "+c);
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
			System.out.println(e);
		}
		
		
	}
	}


