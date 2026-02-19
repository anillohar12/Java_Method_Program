package com.in.method;

public class SimpleIntrest {
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        System.out.println(calculateSI(1000, 5, 2));
    }
}

