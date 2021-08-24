// package Algorithms.Sorting;

import java.util.*;

public class SelectionSort {
    static int[] selectionSort(int[] A) {
        // Sort A into increasing order, using selection sort
        for (int lastPlace = A.length - 1; lastPlace > 0; lastPlace--) {
            // Find the largest item among A[0], A[1], ...,
            // A[lastPlace], and move it into position lastPlace
            // by swapping it with the number that is currently
            // in position lastPlace.
            int maxLoc = 0; // Location of largest item seen so far.
            for (int j = 1; j <= lastPlace; j++) {
                if (A[j] > A[maxLoc]) {
                    // Since A[j] is bigger than the maximum we’ve seen
                    // so far, j is the new location of the maximum value
                    // we’ve seen so far.
                    maxLoc = j;
                }
            }
            int temp = A[maxLoc]; // Swap largest item with A[lastPlace].
            A[maxLoc] = A[lastPlace];
            A[lastPlace] = temp;
        } // end of for loop
        return A;
    }

    public static void main(String[] args) {
        int[] a = { 2, 3, 4, 68, 2, 1, 8, 6, 4, 2, 43, 42, 6, 23 };
        System.out.println(Arrays.toString((selectionSort(a))));
    }
}
