package DataStructures.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class The_ArrayList {
    static String nline = "\n";

    static void Lister(Random rand) {
        int count = 1;
        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("John");
        namelist.add("James");
        namelist.add("James");
        namelist.add("Mary");
        namelist.add("Martha");
        namelist.add("Steve");
        namelist.add("Jack");
        System.out.println(nline + namelist.size());
        for (String item : namelist) {
            System.out.println(nline + item);
            if ("James".equals(item)) {
                System.out.println(nline + "James has been spotted " + (count++) + " times");
            }
        }
        System.out.println(nline + namelist);
        System.out.println(nline + namelist.get(rand.nextInt(namelist.size())));

    }

    static void wrapperClasses() {
        String nihao = "12.323242";
        // Double.parseDouble is used to convert a string to a double
        System.out.println(nline + nihao + nline + Double.parseDouble(nihao));

        // Wrapper classes are used for representing primitive type values as objects.

        Double d = Double.valueOf(6.02221415e23); // this is the preferable way of initializing a Double object
        Double d1 = new Double(6.02221415e23);// this method has apparently been deprecated since java version 9
        /*
         * They both do the same thing i.e they return an object of type Double That
         * wraps around the value of d and d1 which are of the primitive type double.
         * There is an automatic conversion that exists between a primitive type and a
         * corresponding wrapper class For example, if a value with a primitive type of
         * int is used in a context that requires an object of type Integer, the int
         * will automatically be wrapped in an Integer object.
         * 
         */

        System.out.println(d);
        System.out.println(d.doubleValue());
        System.out.println(d1);

        // Autoboxing
        Integer answer = 42;
        // This actually silently gets converted
        // Integer answer = Integer.valueOf(42);
        /*
         * This is what is known as autoboxing. This simply  is the automatic conversion of
         * the value of a primitive type to an object belonging to its equivalent
         * wrapper class, during the point of initialization or value setting.
         * Autoboxing occurs during write operations
         */

        ArrayList<Integer> numList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < 10; i++){
            numList.add((count++)*10);
        }
        System.out.println(nline + numList );




        // Unboxing
        Double d2 = Double.valueOf(3.142598);
        System.out.println(nline + (d2 * 10));
        /*
         * The variable d2 refers to an object that belongs to the wrapper class of
         * double On the next line d2 is being multiplied by 10 and the way this works
         * is that because d2 is an object in order for numerical expressions to be
         * evaluated with it, the primitive double value it wraps, is automatically
         * unboxed and multiplied by 10.
         */
    }

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Hello World");
        Lister(rand);
        wrapperClasses();
    }
}

/*
 * The ArrayList is a parameterized type. What this Means is that, a
 * parameterized type can take a type parameter, so that from a single class
 * ArrayList, we get a multitude of types including ArrayList<String>,
 * ArrayList<Button>, and in fact ArrayList<T> for any type of object type T.
 * The type parameter T must be an object type such as a class name or an
 * interface name. it cannot be a primitive type. This means that,
 * unfortunately, you can not have an ArrayList of int or an ArrayList of char.
 * 
 * Consider the type ArrayList<String>. As a type it can be used to declare
 * variables, such as ArrayList<String> namelist;
 * 
 * it can also be used as the type of a formal parameter in a subroutine
 * definition, or as The return type of a subroutine. it can be used with the
 * new operator to create objects: namelist = new ArrayList<String>();
 */