package org.vivek.java.basicprograms;

import java.util.Scanner;

public class LetterAanother {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of lines u want");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
for(int j=n-1;j>=i;j--){
	System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++){
	if(i==(n/2)+1){
	System.out.print("*");
	}
	else{
		if(k==1 || k==2*i-1){
			System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	}
	}
System.out.println("");
	}
/*Here its a Effective way 
 * We just need to see where we want stars to be printed for k loop 
 * i is for line change
 * j is for spaces
 * k is for printing *
 * */
		
}
}
