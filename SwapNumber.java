package com.in.method;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Value of a:");
		int a=sc.nextInt();
		System.out.print("Enter Value of b:");
		int b=sc.nextInt();
		System.out.println(a+" "+b);
		int temp =a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		sc.close();
	
	}
	
	

}
