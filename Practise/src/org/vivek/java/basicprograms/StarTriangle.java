package org.vivek.java.basicprograms;

import java.util.Scanner;

public class StarTriangle {

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
				System.out.print("*");
			}
			System.out.println("");
		}
	/*   i-1 j-1 k-4 
		 i-2 j-3 k-3
		 i-3 j-5 k-2
		 i-4 j-7 k-1
		 i-5 j-9 k-0
		 */
		
	}

}
