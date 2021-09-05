// package Freestyles;
import java.util.*;
public class FreeStyle_6_Names {
    static void Workingstrings() {

        String firstName = "John";

        System.out.println("\n\nfirstName is " + firstName);

        String lastName = " Smith";

        System.out.println("lastName is " + lastName);

        System.out.print("Concat using concat() function, full name is:");

        System.out.println(firstName.concat(lastName));

        System.out.print("Concat using + operator, full name is:");

        System.out.println(firstName + lastName);
    }

    static void lengthOfStrings() {
        // The length() method returns the length of string.

        String firstName = "John";

        System.out.println("\n\n" + firstName + " is " + firstName.length() + " characters long");

        firstName = "Linda";

        System.out.println(firstName + " is " + firstName.length() + " characters long");

    }

    static void ObtainCharFromString() {
        // The charAt() method returns a character at specified index:

        String firstName = "John";

        System.out.println("\n\nThe first character of " + firstName + " is " + firstName.charAt(0));

        System.out.println("The fourth character of " + firstName + " is " + firstName.charAt(3));
    }

    static void PositionOfCharInString() {
        /*
         * This indexOf() method returns the index position within this string of the
         * first occurrence of the specified character or -1, if the character does not
         * occur.
         */

        String firstName = "John";

        System.out.println("\n\nFirst occurrence of the letter 'J' is at "

                + firstName.indexOf('J'));

        System.out.println("First occurrence of the letter 'a' is at "

                + firstName.indexOf('a'));
    }

    static void ReplaceCharInString() {
        /*
         * The replace() method replaces all occurrence of first sequence of character
         * with second sequence of character.
         */

        String fullName = "John Smith";
        System.out.println("\n\nfullName is " + fullName);
        String replacedName = fullName.replace("John", "Linda");
        System.out.println("Name after replacing is " + replacedName);
    }

    static void GetPartOfString() {
        /*
         * The substring() method returns new string that is a sub-string of the
         * original string. The substring() method begins with the character at the
         * specified index and extends to the end of this string or up to endIndex – 1,
         * if the second argument is provided.
         */

        String fullName = "John Smith";
        // This will fetch the sub string from the character at index 0 till 4
        // (4 is exclusive)
        String firstName = fullName.substring(0, 4);
        System.out.println("\n\nfirstName is " + firstName);// Print firstName
        // This will fetch the sub string from the character at index 5 till the
        // end
        String lastName = fullName.substring(5);
        System.out.println("lastName is " + lastName);// Print lastName

    }

    static void NumStringConversion() {
        // Converting a number to string
        // To convert a number to a string,
        // use the toString() method of the Integer class

        // Converting a string to number
        // The parseInt() function of the
        // Integer class converts the String object to int

        int number = 128;
        // Convert variable 'number' to a string
        String numberAsString = Integer.toString(number);
        System.out.println("\n\nValue of number as string is " + numberAsString);

        // Convert string numberAsString back to a number
        number = Integer.parseInt(numberAsString);
        System.out.println("Value of number is " + number);
    
    /* NOte this 
    Integer boxedValue = Integer.valueOf(238);
    String characterNumeric = boxedValue.toString();

    String characterNumeric = "238";
    Integer convertedValue = Integer.parseInt(characterNumeric);
     */
    }

    public static void main(String[] args) {
        for (int i = 0; i > 10; i++){
            System.out.println("Hello");
        }

        Integer[] a = new Integer[10];
        System.out.println(Arrays.toString(a));
        Workingstrings();
        lengthOfStrings();
        ObtainCharFromString();
        PositionOfCharInString();
        ReplaceCharInString();
        GetPartOfString();
        NumStringConversion();
    
    }
}
