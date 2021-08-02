package DataStructures.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class The_ArrayList {
    static String nline = "\n";
    
    static void Lister (Random rand){
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
        for(String item : namelist){
            System.out.println(nline + item);
            if ("James".equals(item)){
                System.out.println(nline + "James has been spotted " + (count++) + " times");
            }
        }
        System.out.println(nline + namelist);
        System.out.println(nline + namelist.get(rand.nextInt(namelist.size())));
        
    }
    static void wrapperClasses(){
        String nihao = "12.323242";
        // Double.parseDouble is used to convert a string to a double
        System.out.println(nline + nihao + nline + Double.parseDouble(nihao));

        // Wrapper classes are used for representing primitive type values as objects.
    }    
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Hello World");
        Lister(rand);
        wrapperClasses();
    }
}

/*
* The ArrayList is a parameterized type. 
* What this Means is that, a parameterized type can take a type 
* parameter, so that from a single class ArrayList, we get a multitude of types including ArrayList<String>, ArrayList<Button>, and in fact ArrayList<T> for any type of object type T. 
* The type parameter T must be an object type such as a class name or an interface name. it cannot be a primitive type. This means that, unfortunately, you can not have an ArrayList of int or an ArrayList of char. 
* 
 * Consider the type ArrayList<String>.
 * As a type it can be used to declare variables, such as 
 * ArrayList<String> namelist;
 * 
 * it can also be used as the type of a formal parameter in a subroutine definition, or as
 * The return type of a subroutine. 
 * it can be used with the new operator to create objects: 
 * namelist = new ArrayList<String>();
 */