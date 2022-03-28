package com.Exception;

 class MyCustomException extends Exception 
 {
	 
 }
 public class TestCustomException
 {
	 

	public static void main(String[] args) {
		try {
		 throw new MyCustomException();
		}
		 catch(MyCustomException a)
		{
			 System.out.println("caught the exception");
			 System.out.println(a.getMessage());
		}
		System.out.println("rest of the code");

	}

}
