package com.exception.ex;

public class ExceptionF1 {
	public static void main(String[] args) {
 
	 try {
		 String[] names=new String[5];
		 names[4]="john";
		 //System.out.println(names[0].equals(0));
		 }
		 catch(NullPointerException|ArrayIndexOutOfBoundsException e) {
		 System.out.println(e);
		 }
		 finally {
		 System.out.println("Finally executes...");
		 }
		} 
}
	

