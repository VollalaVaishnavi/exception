package com.Exception;

 

class InvalidDetailsException extends Exception
  {
	// calling the constructor of parent Exception  
	public InvalidDetailsException(int age,String str) 
	{
		super(str);
	}
  }
// class that uses custom exception InvalidDetailException
	public class MyDetails
	{
		// method to check the name and age
		 static void validate (int age,String name) throws InvalidDetailsException{
		if(name=="Yamini"&& age==20) 
		{
			System.out.println("My name is Yamini");
			System.out.println("My age is 20");
			  
		}
		else
		{
			System.out.println("error");
			// throw an object of user defined exception  
	        throw new InvalidDetailsException(0,"Name is wrongly typed"); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(20,"Yamini");
			
		}
		catch(InvalidDetailsException d)
		{
			System.out.println("Exception occured");
			System.out.println(d);
		}

	}

}
