import java.util.*;

public class QuestionSetTwo {

    static void permutation(String str) {
        permutation(str, "");
    }

    static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            }
        }
    }

    static int First_Non_Repeating_Character(String word) {
        /*
         * Write a function that takes in a string of lowercase English-alphabet letters
         * and returns the index of the string's first non-repeating character. The
         * first non-repeating character is the first character in a string that occurs
         * only once. if the input string doesn't have any non-repeating characters,your
         * function should return -1.
         */
        Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
        word = word.toLowerCase();
        // This is the histogram section
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Integer value = dictionary.get(c);
            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
                // return word.indexOf(c);
            } else {
                dictionary.put(c, value + 1);
            }
            // System.out.println(word.charAt(i) + " " + word.length());
        }
        // This section checks to see if a character in the dictionary occurs only once
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (dictionary.get(c) == 1) {
                return i;// returning the first character that occurs only once in the dictionary.
            }
        }
        System.out.println(dictionary);
        return -1;
    }

    // The Jazaltron Way
    static String Run_Length_Encoding(String word) {
        // where run length encoded string is rulenc
        Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
        // This is the histogram section
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            Integer value = dictionary.get(c);
            if (!dictionary.containsKey(c)) {
                dictionary.put(c, 1);
            } else {
                dictionary.put(c, value + 1);
            }
        }
        System.out.println("\n\n" + dictionary);
        String rulenc = "";
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            char c = entry.getKey();
            int value = entry.getValue();
            System.out.println("\n The Character " + c + ", Occured " + value + " times");
            if (value <= 9) {
                rulenc = rulenc + value + c + " ";
            } else if (value > 9 && value % 9 == 0) {
                int multi = value / 9;
                String prerulenc = "" + (value / multi) + c;
                rulenc = rulenc + prerulenc.repeat(multi) + " ";
                // rulenc = rulenc.repeat(multi);
            } else if (value > 9) {
                int muly = value / 9;
                int additional = value % 9;
                String prerulenca = "" + (9) + c;
                rulenc = rulenc + prerulenca.repeat(muly) + additional + c + " ";
            }
        }
        System.out.printf("%n %s", rulenc);
        // System.out.println("\n"+rulenc.getClass().getSimpleName());
        return rulenc;
    }

    static String Run_Length_Encoding_LossLess(String word) {
        return "TRUE";
    }

    public static void main(String[] args) {
        // Q1
        // permutation("den");
        // Q2
        int indexOfChar = First_Non_Repeating_Character("createcr");
        if (indexOfChar == -1) {
            System.out.println("No non repeating character");
        } else {
            System.out.println("The index of the first non repeating character is " + indexOfChar);
        }
        // Q3
        String Q3 = Run_Length_Encoding("AAAAAAAAAAAAABBCCCCDD");
        System.out.println("\n\n" + Q3);
        String Q3b = Run_Length_Encoding(
                "AAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCDDDDDDDDDDDDDDDFFFFFFFFFFFFFEEEEEEEEEE");
        System.out.println("\n\n" + Q3b);
        String Q3c = Run_Length_Encoding(
                ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        System.out.println("\n\n" + Q3c);
        String Q3d = Run_Length_Encoding(
                "AAAAAAAAAAAAAAAAAABBBBBBBBBBBBeeeeeeeeeeBBCFFFFFFFCCCCCCCCCCCCCCCCCDDDDDDDDDDDDDDDFFFFFFFFFFFFFEEEEEEEEEE");
        System.out.println("\n\n" + Q3d);

    }
}
