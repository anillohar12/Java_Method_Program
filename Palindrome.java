package com.in.method;

public class Palindrome {
	static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); 
        System.out.println(isPalindrome(123)); 
    }

}
