// package Algorithms.Searching;

import java.util.*;

public class RecursiveBinarySearch {

    static int[] orderedList() {
        int[] list = new int[16];
        for (int i = 0; i <= 15; i++) {
            list[i] = i * 2;
        }
        System.out.println(Arrays.toString(list));
        return list;
    }

    static int binarySearch(int[] input, int target, int start, int end) {
        if (start >= end) {
            return -1;
        } else {
            int mid = start + (end - start) / 2;
            if (target < input[mid]) {
                return binarySearch(input, target, start, mid - 1);
            } else if (target > input[mid]) {
                return binarySearch(input, target, mid + 1, end);
            } else {
                return mid;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = orderedList();
        System.out.println(Arrays.toString(list));
        int index = binarySearch(list, 20, 0, list.length);
        System.out.println(index);
    }
}
