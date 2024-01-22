
import java.util.*;

public class zMaps {

    static Map<Character, Integer> histogram(String word) {
        Map<Character, Integer> dictionary = new HashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            // System.out.println("\n"+ c);
            char c = word.charAt(i);
            Integer value = dictionary.get(c);
            if (dictionary.containsKey(c)) {
                value += 1;
                dictionary.put(c, value);
            } else {
                value = 1;
                dictionary.put(c, value);
            }
        }
        // System.out.println(dictionary);
        return dictionary;
    }

    static Map<Character, Integer> histo(String word) {
        Map<Character, Integer> dictionary = new HashMap<>();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            // System.out.println("\n"+ c);
            char c = word.charAt(i);
            Integer value = dictionary.get(c);
            if (!dictionary.containsKey(c))
                dictionary.put(c, 1);
            else
                dictionary.put(c, value + 1);
        }
        // System.out.println(dictionary);
        return dictionary;
    }

    static void RandomStringGenerator() {
        String[] alphabet = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
                "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        Random rand = new Random();
        String word = "";
        ArrayList<String> wordCollection = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int index = rand.nextInt(alphabet.length);
                word += alphabet[index];
            }
            wordCollection.add(word);
            word = "";
        }
        Map<String, Integer> classAstudentGrades = new HashMap<String, Integer>();
        Map<String, Integer> classBstudentGrades = new HashMap<String, Integer>();
        for (int i = 0; i < wordCollection.size(); i++) {
            classAstudentGrades.put(wordCollection.get(i), rand.nextInt(101));
            classBstudentGrades.put(wordCollection.get(i), rand.nextInt(101));
        }
        System.out.println(word);
        System.out.println(wordCollection);
        System.out.println(classAstudentGrades);
        for (Map.Entry<String, Integer> entry : classAstudentGrades.entrySet()) {
            System.out.println("\n Class A Student named " + entry.getKey() + ", got " + entry.getValue()
                    + " in their final exams");
        }
        for (Map.Entry<String, Integer> entry : classBstudentGrades.entrySet()) {
            System.out.println("\n\n Class B Student named " + entry.getKey() + ", got " + entry.getValue()
                    + " in their final exams");
        }

        // for(int i=0; i<studentGrades.size(); i++){
        // System.out.println(studentGrades.get(wordCollection.get(i)));
        // }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("\n");
        Map<Character, Integer> dictionary;
        String name = "the quick brown fox jumps over the lazy dog";
        dictionary = histogram(name);
        System.out.println(dictionary);

        System.out.println("\n");
        RandomStringGenerator();

        System.out.println("\n");
        Map<Character, Integer> dict;
        String fname = "the quick brown fox jumps over the lazy dog";
        dict = histo(fname);
        System.out.println(dict);
    }
}
// public class BinaryTrees {
// import java.io.*;
// import java.util.*;
// public class WoodChuck
// {
// public static void main(String args[]) throws Exception
// {
// HashMap<String,Integer> histogram = new HashMap<String,Integer>();
// BufferedReader infile = new BufferedReader( new FileReader( args[0] ) );
// while ( infile.ready() ) // .ready() true if there is another line in the
// file
// {
// String word = infile.readLine();
// if ( !histogram.containsKey(word) )
// histogram.put( word, 1 );
// else
// histogram.put( word, histogram.get(word) + 1 ); // replace freq with freq+1
// }
// ArrayList<String> words = new ArrayList<String>( histogram.keySet() );
// Collections.sort( words );
// for ( String word : words )
// System.out.println( word + "\t" + histogram.get(word) );
// } // END MAIN
// } // CLASS WOODCHUCK
// }
//