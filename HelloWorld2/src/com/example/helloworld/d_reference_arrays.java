package com.example.helloworld;

import java.util.Arrays;

public class d_reference_arrays {
    // main
    public static void main(String[] args) {
        // create array
        int [] numbers = new int[5];    // 5 items
        // initialize array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        System.out.println("numbers address = " + numbers);                        // output: address of objects in memory
        System.out.println("numbers items = " + Arrays.toString(numbers));       // output: items in array

        // faster way to create and initialize an array if you know the items
        int [] numbers2 = { 7, 6, 8, 10, 9 };
        System.out.println("numbers2 address = " + numbers2);                        // output: address of objects in memory
        System.out.println("numbers2 items = " + Arrays.toString(numbers2));       // output: items in array

        // len
        System.out.println("len numbers2 = " + numbers2.length);

        // sort
        Arrays.sort(numbers2);
        System.out.println("numbers2 sorted = " + Arrays.toString(numbers2));

    }
}
