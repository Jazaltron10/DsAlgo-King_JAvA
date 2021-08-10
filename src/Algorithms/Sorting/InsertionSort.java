package Algorithms.Sorting;
import java.util.*;
public class InsertionSort {
    /*
* Precondition: itemsInArray is the number of items that are
* stored in A. These items must be in increasing order
* (A[0] <= A[1] <= ... <= A[itemsInArray-1]).
* The array size is at least one greater than itemsInArray.
* Postcondition: The number of items has increased by one,
* newItem has been added to the array, and all the items
* in the array are still in increasing order.
* Note: To complete the process of inserting an item in the
* array, the variable that counts the number of items
* in the array must be incremented, after calling this
* subroutine.
*/
static void insert(int[] A, int itemsInArray, int newItem) {
    int loc = itemsInArray - 1; // Start at the end of the array.
    /* Move items bigger than newItem up one space;
    Stop when a smaller item is encountered or when the
    beginning of the array (loc == 0) is reached. */
    while (loc >= 0 && A[loc] > newItem) {
    A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
    loc = loc - 1; // Go on to next location.
    }
    A[loc + 1] = newItem; // Put newItem in last vacated space.
    }
    static void insertionSort(int[] A) {
    // Sort the array A into increasing order.
    int itemsSorted; // Number of items that have been sorted so far.
    for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++) {
    // Assume that items A[0], A[1], ... A[itemsSorted-1]
    // have already been sorted. Insert A[itemsSorted]
    // into the sorted part of the list.
    int temp = A[itemsSorted]; // The item to be inserted.
    int loc = itemsSorted - 1; // Start at end of list.
    while (loc >= 0 && A[loc] > temp) {
    A[loc + 1] = A[loc]; // Bump item from A[loc] up to loc+1.
    loc = loc - 1; // Go on to next location.
    }
    A[loc + 1] = temp; // Put temp in last vacated space.
    }
    System.out.println(Arrays.toString(A));
    }
    public static void main(String[] args) {
        int[] b = new int[] {1,4,3,2,4,6,3,2,3};
        insertionSort(b);
    }
}
