package org.vivek.java.basicprograms;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a String:");
Scanner in=new Scanner(System.in);
str=in.next();

int length=str.length();
System.out.println("Length="+ length);
boolean palin=true;
for(int i=0;i<length/2;i++){
	if(str.charAt(i)!=str.charAt(length-i-1)){
		palin=false;
		break;
	}
}

if(palin){
	System.out.println(str + " is Palindrome");
}
else{
	System.out.println(str + " is not a Palindrome");
}


/*0m
 * 1a
 * 2d
 * 3a
 * 4m
 * 5\0*/
	}

}
