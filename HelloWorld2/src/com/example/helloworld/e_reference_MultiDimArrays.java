package com.example.helloworld;

import java.util.Arrays;

public class e_reference_MultiDimArrays {
    //main
    public static void main(String[] args) {
        // create multi dimensional array (matrix)
        int [] [] numbers = new int [2] [3];    // 2 rows, 3 columns
        // initialize
        numbers [0] [0] = 1;
        numbers [0] [1] = 2;
        numbers [0] [2] = 3;
        numbers [1] [0] = 4;
        numbers [1] [1] = 5;
        numbers [1] [2] = 6;
        System.out.println("numbers address = " + numbers);
        System.out.println("numbers items = " + Arrays.deepToString(numbers));

        // create, initialize - curley braces syntax
        int[][] numbers2 = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println("numbers2 address = " + numbers2);
        System.out.println("numbers2 items = " + Arrays.deepToString(numbers2));
    }
}
