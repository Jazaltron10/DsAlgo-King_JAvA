package DA_UNIT.Week_7;

import java.util.ArrayList;

public class Week_7 {
    static String nline = "\n";

    static ArrayList<Double> Autoboxing() {
        // Declaring an Arraylist with the wrapper class of Double
        ArrayList<Double> numList = new ArrayList<Double>();
        // Looping through the Arraylist and adding values to it
        for (double i = 0.0; i < 10.0; i++) {
            numList.add(i * 10.0);
        }
        // Printing out the newly filled arraylist and then returning it
        System.out.println(nline + numList);
        return numList;
    }

    static void UnboxingVolumeOfSphere(ArrayList<Double> numList) {
        // Declaring a new ArrayList to hold the value of volumes for each radius
        ArrayList<Double> vList = new ArrayList<Double>();

        // Calculating the volume of a sphere, by looping through the radius of the
        // passed in Arraylist numList
        for (Double radius : numList) {
            vList.add(4 / 3 * (Math.PI * (Math.pow(radius, 3))));
        }

        // This is a for loop to print out all the radius of the sphere and its
        // corresponding volume
        int index = 0;
        for (double i = 0.0; i < vList.size(); i++) {
            System.out.println(nline + "The volume of the sphere of radius " + (i * 10) + " is " + vList.get(index++));
        }

        System.out.println(nline + vList);
    }

    public static void main(String[] args) {
        System.out.println(nline + "Is This Java For Real");
        // Declaring a list of type Double to store the returned list from the
        // subroutine Autoboxing
        ArrayList<Double> volumeList;
        volumeList = Autoboxing();
        // passing the returned list as an argument to a function that calculates the
        // volume of a sphere.
        UnboxingVolumeOfSphere(volumeList);
    }
}
