package com.exception.ex;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		double c=a/b; 
		System.out.println("No exception is occured here");
	} 
		catch (ArithmeticException e) {
		System.out.println(e);
	} 
		System.out.println("Normal flow of program will continue....");

}
}