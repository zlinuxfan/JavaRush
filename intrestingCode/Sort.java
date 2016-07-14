package com.javarush.intrestingCode;

import java.util.Arrays;

/**
 * Created by kde on 14.07.16.
 */


public class Sort {
    public static void main(String[] args) {
        int[] arr = {23, 45, 23, 54, 12, 96, 25, 25, 16, 96, 34, 23, 07};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int j = arr.length; j >= 0; j --) {
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        return arr;
    }
}
