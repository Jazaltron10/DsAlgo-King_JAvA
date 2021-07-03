package Freestyles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Freestyle_3 {
    static void useArray(int[] a) {
        int j = 0;
        for (int i : a) {
            // a[i] = a[i] * 2;
            System.out.println(i * 2);
        }

        while (j < a.length) {
            System.out.println("\n\n" + (a[j] + 10));
            j++;
        }
        System.out.println(Arrays.toString(a));
    }

    static void quicksort(int[] values) {
        quicksort(values, 0, values.length - 1);
    }

    static void quicksort(int[] values, int left, int right) {
        if (left > right) {
            return;
        }
        int pivot = values[(left + right) / 2];
        int index = partition(values, left, right, pivot);
        quicksort(values, left, index - 1);
        quicksort(values, index, right);
    }

    static int partition(int[] values, int left, int right, int pivot) {
        while (left < right) {
            while (values[left] < pivot) {
                left++;
            }
            while (values[right] < pivot) {
                right--;
            }
            if (left <= right) {
                swap(values, left, right);
                left++;
                right--;
            }

        }
        return left;
    }

    public static void main(String[] args) {
        int[] myNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

        useArray(myNums);

        int[] testValues = { 32, 100, 1, 2, 29, 28, 88, 3, 50, 67, 37, 1, 57, 20, 54, 62, 93, 17, 31, 65, 23, 32, 98,
                20, 79, 69, 89, 26, 27, 22, 29, 100, 1, 2, 57, 28, 88, 3, 50, 67, 37, 1, 32, 20, 97 };
        quicksort(testValues);
    }
}
