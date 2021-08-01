package DataStructures.Arrays;

public class Arrays {
    static void arrayRepublic_1() {

        String lines[]; // declaring the array
        lines = new String[] { "John", "James", "James", "Baldwin", "Johnson" };// Initializing the array
        
        boolean dupp = false; // Assume there are no duplicates
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].equals(lines[i + 1])) {
                dupp = true;
                System.out.println("This Array contains duplicates");
                break;
            } else {
                System.out.println("This Array contains no duplicates");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World\n");
        String lines[]; // declaring the array
        lines = new String[] { "J", "J", "J", "B", "J" };// Initializing the array
        boolean dupp = false; // Assume there are no duplicates
        for (int i = 0; i < lines.length - 1; i++) {
            if (lines[i].equals(lines[i + 1])) {
                dupp = true; // we have found a duplicate!
                System.out.println("This Array contains duplicates");
                break;
            }
        }
    }
}
