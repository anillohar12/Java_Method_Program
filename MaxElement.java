package com.in.method;

public class MaxElement {
	static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2, 9, 1, 7};
        System.out.println(findMax(arr)); 
    }

}
