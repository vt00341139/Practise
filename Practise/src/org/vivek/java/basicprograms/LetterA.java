package org.vivek.java.basicprograms;

import java.util.Scanner;

public class LetterA {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of lines u want");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(2*i)-1;j++){
				  for(int k=n-1;k>=i;k--){
					if(j==1){
					System.out.print(" ");
					}
				}
				if(i== (n/2)+1){
				System.out.print("*");
				}
				else if((i >=1 && i<=n)&&(i !=(n/2)+1)){
if(j==1 || j==2*i-1){
	System.out.print("*");
   }
else {
	  System.out.print(" "); 
   }				
 }			
				
				
    }
			System.out.println("");
		}
/*
i-1 j-1            k-4  
i-2 j-1,2,3        k-3
i-3 j-1,2,3,4,5    k-2
i-4 j-7 k-1
i-5 j-9 k-0
*/
		/*i is for line change
		 * j is for printing *
		 * k is for white spaces */
	}

}
