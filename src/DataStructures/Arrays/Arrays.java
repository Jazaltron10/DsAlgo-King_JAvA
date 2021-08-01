package DataStructures.Arrays;

public class Arrays {
    static String nLine = "\n";
    static void arrayRepublic_1() {

        String lines[]; // declaring the array
        lines = new String[] { "John", "James", "James", "Baldwin", "Johnson" };// Initializing the array
        
        boolean dupp = false; // Assume there are no duplicates
        for (int i = 0; i < lines.length - 1 ; i++ ) {
            if (lines[i].equals(lines[i + 1])) {
                dupp = true;
                System.out.println("This Array contains duplicates"+ nLine);
                break;
            }
        }
    }
        // else {
        //     System.out.println("This Array contains no duplicates");
        //     break;
        // }
    
    public static void main(String[] args) {
        arrayRepublic_1();
        
        System.out.println("Hello World\n");
        
        
        String lines[]; // declaring the array
        lines = new String[] { "John", "James", "James", "B", "J" };// Initializing the array
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
