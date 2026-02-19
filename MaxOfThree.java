package com.in.method;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number a:");
		int a=sc.nextInt();
		System.out.print("Enter Number b:");
		int b=sc.nextInt();
		System.out.print("Enter Number c:");
		int c=sc.nextInt();
		
		System.out.println(Math.max(a,Math.max(b, c)));
		
		sc.close();
	}

}
