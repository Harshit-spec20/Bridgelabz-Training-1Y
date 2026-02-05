package com.gla.arrays.array;
public class GreatestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 89, 5};

        int max = arr[0]; // Assume first element is greatest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Greatest element is: " + max);
    }
}
