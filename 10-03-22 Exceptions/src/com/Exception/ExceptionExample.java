package com.Exception;

public class ExceptionExample {

	public static void main(String[] args) {
		 try{
			 String s1="abc";
			 String s2="13";
			 int i=Integer.parseInt(s1);
			 //parseInt -converts string to integer
			 
			 System.out.println("value of i: "+i);
		 }catch(Exception e) {
		 System.out.println("exception occured");
		 System.out.print(e);}

	}

}
