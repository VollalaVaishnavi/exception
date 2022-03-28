package com.Exception;

public class ArrayException {

	public static void main(String[] args) {
		  try {
			  int arr[]=new int[5];
			  arr[8]=3;
			  System.out.println(arr);
		  }catch(Exception e)
		  {
			  System.out.println("exception has occured");
			  System.out.print(e);
		  }
	}

}
