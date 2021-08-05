package Algorithms.Searching;

import java.util.*;

public class bSearchArrayList {
    final static String nline = "\n";

    static ArrayList<Integer> List() {
        ArrayList<Integer> numList;
        numList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            int elm = (int) (Math.pow((i + 1), 2));
            numList.add(elm);
        }
        System.out.println(numList.size() + " " + numList);
        return numList;
    }

    static int numSearch(ArrayList<Integer> list, Scanner tag) {
        System.out.println(list);
        int first = 0; // index of first element
        int last = list.size() - 1; // index of last element

        int target = tag.nextInt();
        while (first <= last) {
            int mid = (first + last) / 2; // index of mid element
            int midValue = list.get(mid);
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

    static int WordSearch(ArrayList<String> list, Scanner tag) {
        System.out.println(list);
        int first = 0; // index of first element
        int last = list.size() - 1; // index of last element
        int mid;

        boolean found = false;

        String target = tag.nextLine();
        // loop until found or end of list
        while (first <= last && !found) {
            mid = (first + last) / 2; // index of mid element
            String midValue = list.get(mid);

            if (midValue == (target)) {
                found = true;
                return mid;
            } else {
                if (midValue == (target)) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                }
                return mid;
            }

        } // end of while loop

        return -1;
    }

    static String LinearSearch(ArrayList<String> list, Scanner tag) {
        System.out.println((list));
        String word = tag.nextLine();
        // for (String targetWord : list) {
        for (int i = 0; i < list.size(); i++) {

            if (word.equals(list.get(i))) {
                System.out.printf("%s%s is the word you are searching for, and it can be found at index %d", nline,
                        list.get(i), i);
                return list.get(i);
            }
        }
        String notfound = "Your input does not match any word on the list";
        return notfound;
    }

    

    public static void main(String[] args) {
        ArrayList<Integer> list;
        list = List();
        System.out.println("Please input a non-zero square of numbers between 0 and 11");
        Scanner input = new Scanner(System.in);
        int Index = numSearch(list, input);
        System.out.printf("%sThe index of the number you are searching is %d", nline, Index);

        ArrayList<String> names = new ArrayList<String>();
        names.add("James");
        names.add("Conway");
        names.add("Billy");
        names.add("Gansa");
        names.add("Pliko");
        names.add("Carrie");
        names.add("Jaros");
        names.add("Silvia");

        System.out.println(nline);
        Scanner input_3 = new Scanner(System.in);
        String result = LinearSearch(names, input_3);
        System.out.printf("%s%s%s", nline, result, nline);

        Scanner input_2 = new Scanner(System.in);
        int index_2 = WordSearch(names, input_2);
        System.out.printf("%sThe index of the word is %d", nline, index_2);

        // String[] alist;
        // alist = new String[]{"A", "B", "C", "D", "E", "F"};
        // int ano =
        //bsch("B",alist);
        // System.out.printf("%s%d",nline,ano);
    }
}
