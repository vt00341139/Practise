package org.vivek.java.basicprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str,rev="";
		System.out.println("Enter a string u want to reverse");
		Scanner in=new Scanner(System.in);
		str=in.next();
		int length=str.length();
		
		for(int i=length-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reversed String="+ rev);
		/*
		 0V
		 1i
		 2v
		 3e
		 4k
		 5'\0' */
		

	}

}
