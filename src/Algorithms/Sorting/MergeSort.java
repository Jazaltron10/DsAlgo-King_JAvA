// package Algorithms.Sorting;

import java.util.*;

public class MergeSort {
    static ArrayList<Integer> createRandomList(Random rand) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 15; i++) {
            int rnum = rand.nextInt(20);
            list.add((rnum + i) * 2);
        }
        System.out.println(list);
        return list;
    }

    static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }
        int mindex = list.size() / 2;
        List<Integer> leftSortedList = mergeSort(list.subList(0, mindex));

        List<Integer> rightSortedList = mergeSort(list.subList(mindex, list.size()));

        List<Integer> sortedList = new ArrayList<Integer>();

        int lindex = 0;
        int rindex = 0;

        int leftLength = leftSortedList.size();
        int rightLength = rightSortedList.size();

        while (lindex < leftLength && rindex < rightLength) {
            if (leftSortedList.get(lindex) < rightSortedList.get(rindex)) {
                sortedList.add(leftSortedList.get(lindex));
                lindex++;
            } else {
                sortedList.add(rightSortedList.get(rindex));
                rindex++;
            }
        }
        sortedList.addAll(leftSortedList.subList(lindex, leftLength));
        sortedList.addAll(rightSortedList.subList(rindex, rightLength));
        return sortedList;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list;
        list = createRandomList(rand);

        List<Integer> sortedList;
        sortedList = mergeSort(list);
        System.out.println(sortedList);
    }
}
