package com.in.method;

public class PrintNumber {
    static void print(int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(i + " ");
    }
    public static void main(String[] args) {
        print(10);
    }
}

