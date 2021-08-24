// package Algorithms.Searching;

import java.util.*;

public class binarySearch {
    final static String nline = "\n";

    static int[] List() {
        int[] numList = new int[11];
        for (int i = 0; i <= 10; i++) {
            int elm = (int) (Math.pow((i + 1), 2));
            numList[i] = elm;
        }
        System.out.println(numList.length + " " + Arrays.toString(numList));
        return numList;
    }

    static int Search(int[] list, Scanner input) {

        int first = 0; // index of first element
        int last = list.length - 1; // index of last element
        int target = input.nextInt();

        while (first <= last) {
            int mid = (first + last) / 2; // index of mid element
            int midValue = list[mid];
            if (midValue == target) {
                System.out.printf("The value of the number you are searching for is %d and it can be found at index %d",
                        midValue, mid);
                return mid;
            } else if (target > midValue) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list;
        list = List();
        System.out.println("Please input a non-zero square of numbers between 0 and 11");
        Scanner input = new Scanner(System.in);
        int index;
        index = Search(list, input);
        System.out.println("\n" + index);
    }
}
