package com.devix.www;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Arrays.sort(array);
        printArray("Sorted array", array);
        int index = Arrays.binarySearch(array, -9);
        System.out.println("Found 5 @ " + index);
    }

    private static void printArray(String s, int[] array) {
        System.out.println(s + ": [lenght: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.println(", ");
            }
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
