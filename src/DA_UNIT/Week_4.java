// package DA_UNIT;

public class Week_4 {

    /*
     * Objects are Entities that have behaviours, that hold information, and that
     * can interact with one another.
     * 
     * objects can be thought of as things that have certain feature like how tall
     * they are or how much they weigh and because they contain these distinct
     * features they can act or behave in a certain way, with regards to themselves
     * and other objects.
     * 
     * in java variables do not store or hold objects, but rather they store
     * references or pointers to where the objects are stored in memory.
     * 
     * When one object variable is assigned to another, only a reference is copied.
     * The object referred to is not copied.
     */

    // fields (or instance variable)
    String webName;
    int webAge;

    // constructor
    Week_4(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args[]) {
        // Creating objects
        Week_4 obj1 = new Week_4("beginnersbook", 5);
        Week_4 obj2 = new Week_4("google", 18);

        // Accessing object data through reference
        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }
}
