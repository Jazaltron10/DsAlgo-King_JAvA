
import java.util.Arrays;
import java.util.Random;
public class The_Array {
    static String nLine = "\n";
    static boolean dupp = false; // Assume there are no duplicates
    
    static void arrayRepublic_1(String... list) {
        //Had to use list.length-1 because the conditional check on the last element will cause an ArrayIndexOutOfBoundsException
        for (int i = 0; i < list.length - 1; i++) {
            // Checking to see if elements adjacent in an array are the same 
            if (list[i].equals(list[i + 1])) {
                dupp = true;
                System.out.println("This Array contains duplicates" + nLine);
                break;
            } else {
                System.out.println("This Array contains no duplicates");
                continue;
            }
        }
    }

    static void multiDimensionalArrays(int[][] list) {
        System.out.println(nLine + Arrays.deepToString(list));
    }

    static void arrayRepublic_2() {
        String[] playerList = new String[10]; // up to 10 players
        int playerCount = 0; // At the start there are no players
        /**
         * After some players have joined the game, playerCount will be greater than 0
         */
        // The procedure for adding a new player, newPlayer, to the game is simple.
        // String newPlayer;
        /*
         * for(int i = 0; i < 6; i++){ playerList[playerCount] = "Player";
         * playerCount++; }
         */
        playerList[playerCount] = "Player A";
        playerCount++;
        playerList[playerCount] = "Player B";
        playerCount++;
        playerList[playerCount] = "Player C";
        playerCount++;
        playerList[playerCount] = "Player D";
        playerCount++;
        playerList[playerCount] = "Player E";
        playerCount++;
        playerList[playerCount] = "Player F";
        playerCount++;

        System.out.println(nLine + Arrays.toString(playerList) + nLine + "The total Amount of current players are: "
                + playerCount);

        // To delete an element from the player list and keep track of the total amount
        // of players still in the list
        playerList[2] = playerList[playerCount - 1];
        playerCount--;

        System.out.println(nLine + Arrays.toString(playerList) + nLine + "The total Amount of current players are: "
                + playerCount);

        // Alternatively
        int k = 0;
        for (int i = k + 1; i < playerCount; i++) {
            // basically saying that the index position above is equal to the index position
            // that follows
            // i.e array[0] = array[1];
            playerList[i - 1] = playerList[i];
        }
        playerCount--;
        System.out.println(nLine + Arrays.toString(playerList) + nLine + "The total Amount of current players are: "
                + playerCount);

        // Copying an Array
        // Arrays are objects, and all an array variable does is to hold a pointer to an
        // array.
        playerList[playerCount] = "Player G";
        playerCount++;
        playerList[playerCount] = "Player H";
        playerCount++;
        playerList[playerCount] = "Player I";
        playerCount++;
        playerList[playerCount] = "Player J";
        playerCount++;
        playerList[playerCount] = "Player K";
        playerCount++;
        playerList[playerCount] = "Player L";
        playerCount++;
        System.out.println(nLine + Arrays.toString(playerList) + nLine + "The total Amount of current players are: "
                + playerCount);
        if (playerCount == playerList.length) {
            System.out.println(nLine + "The current playerList has reached its capacity limit");
            // Here the number of players is already equal to the size of the array.
            // The array is full. Make a new array that has more space
            String[] temp; // A variable to point to the new array.
            temp = new String[2 * playerList.length];// twice as big as the old array length

            // Using a for loop to copy items from the old array to the newarray
            for (int i = 0; i < playerList.length; i++) {
                temp[i] = playerList[i];
            }
            // changing the array in which the variable playerList points to
            playerList = temp;

        }
        // At this point, there is now room in the array for a newplayer
        playerList[playerCount] = "Player M";
        playerCount++;
        playerList[playerCount] = "Player N";
        playerCount++;
        System.out.println(nLine + Arrays.toString(playerList) + nLine + "The total Amount of current players are: "
                + playerCount);

    }

    static void arrayRepublic_3() {
        int count = 0;
        int idNum = 0;
        String[] list = new String[10];
        //Here i am using a for loop to fill the players in the array, instead of doing it manually like before.
        for (int i = 0; i < list.length - 7; i++) {
            list[i] = "player".toUpperCase().concat(" " + idNum++);
            count++;
        }
        System.out.println(nLine + Arrays.toString(list) + nLine+"And the Count is : "+ count);
        // Copying an array using java.util.Arrays methods
        /*
        * Arrays.copyOf(nameOfOriginalList, newLengthOfCopy)
        * This is a function that returns a new array whose length is given by
        * newLengthOfCopy, containing items copied from nameOfOriginalList. If
        * newLengthOfCopy is greater than nameOfOriginalList.length, then extra spaces
        * in the new array will have their default value (zero for numeric arrays, null
        * for object arrays, and so on). If newLengthOfCopy is less than or equal to
        * nameOfOriginalList.length, then only as many items are copied from list as
        * will fit in the new array. So if A is any array, then 
        * B = Arrays.copyOf(A, A.length)
        * This Sets B to refer to an exact copy of A.
        */
        //Using Arrays.copyOf to decrease the size of a partially full array whilst deleting elements from the array.
        int k = 1;
        list[k] = list[count-1];
        count--;
        if (count < list.length/2){
            // if more than 3/4 of the spaces are empty then
            list = Arrays.copyOf(list, list.length/2);
        }else if(count == list.length){
            // if the list has reached its maximum capacity then
            list = Arrays.copyOf(list, list.length*2);
        }else{
            System.out.println(nLine + Arrays.toString(list) + nLine+"And the Count is : "+ count);
        }
        System.out.println("After Deleting, halving the size and Copying "+nLine + Arrays.toString(list) + nLine+"And the Count is : "+ count);

        // int[] B = A.clone();
        // can be used to get a copy of the int array A

    }
    static void randomStrings(){
        String star = "";
        for (int i = 0; i < 10;i++){
            star += "+-";    
            System.out.println(star);
            /*for (int j = 0; j < 10;j++) {
                star += "*";    
                System.out.println(star);
            }*/
        }
        
        int u = 0;
        String sign = "";
        while (u < 10) {
            sign += "o";
            System.out.println(sign);
            u+=1;
        }
        int l = 10;
        while(l > 0){
            //Using the string repeat method
            System.out.println("T".repeat(l));
            l-=1;
        }

        String[] fonts;
        fonts = new String[] {
        "TimesNewRoman, FontWeight.BOLD, 20",
        "Arial, FontWeight.BOLD, FontPosture.ITALIC, 28",
        "Verdana, 32",
        "40",
        "Times New Roman, FontWeight.BOLD, FontPosture.ITALIC, 60"
        };
        Random rand = new Random();
        //int upperBound = fonts.length;
        String randomFont;
        int fontIndex;
        //randnextInt(fonts.length) Generates random numbers in the range 0 to fonts.length-1
        fontIndex = rand.nextInt(fonts.length);
        randomFont = fonts[fontIndex];
        System.out.printf("%s %s%d", randomFont, nLine, fonts.length);
        
        //Alternative one Liner technique
        String randString = fonts[rand.nextInt(fonts.length)];
        System.out.printf("%s%s", nLine, randString);   
        
        // Section for Name of Months of the Year
        final String[]  monthName = { "January", "February", "March","April", "May", "June","July", "August", "September", "October", "November", "December" };
        // generates random integer values from 0 - 11
        String randomMonth = monthName[rand.nextInt(monthName.length)];
        System.out.printf("%s%s", nLine, randomMonth);   
        
    }

    public static void main(String[] args) {
        /*--------------------------------------------------------------------*/
        System.out.println("Hello World\n");

        /*--------------------------------------------------------------------*/
        String lines[]; // declaring the array
        lines = new String[] { "John", "James", "James", "Baldwin", "Johnson" };// Initializing the array
        String[] list_2 = new String[] { "Abraham", "Asher", "Christian" };
        arrayRepublic_1(lines); // contains adjacent duplicates
        arrayRepublic_1(list_2); // contains no duplicates

        /*--------------------------------------------------------------------*/
        // Experimenting with Arrays class methods
        int[] cubes = new int[] { 1, 8, 27, 64, 125, 216, 343 };
        System.out.println(nLine + Arrays.toString(cubes));
        int fourthElement = Arrays.binarySearch(cubes, 64);
        System.out.println(nLine + fourthElement);
        /*--------------------------------------------------------------------*/
        // This section is for the Multidimensional Array
        int[][] sample = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        multiDimensionalArrays(sample);

        /*--------------------------------------------------------------------*/
        // This Section is for the player Array example
        arrayRepublic_2();
        
        /*--------------------------------------------------------------------*/
        // This Section deals with the various array methods that are available in the Arrays class
        arrayRepublic_3();
        
        /*--------------------------------------------------------------------*/
        // This Section is for Exploring randomStrings with Arrays
        randomStrings();
        
        /*--------------------------------------------------------------------*/


    }
}
/*
 * Section 3.8 - Introduction to Arrays
 * Section 4.3.5 - Array Parameters
 * Section 4.3.6 - Command-line Arguments
 * Section 5.1.4 - Arrays and Objects
 * Section 7.1 - Array Details (all)
 * Section 7.2.1 - Some Processing Examples
 * Section 7.2.2 - Some Standard Array Methods
 * Section 7.3 - ArrayList (all but 7.3.4)
 * Section 7.4 - Searching and Sorting (introduction)
 * Section 7.4.1 - Searching
 * Section 7.4.2 - Association Lists
 * Section 7.5 - Two-dimensional Arrays (introduction)
 * Section 7.5.1 - The Truth about 2D Arrays
 */
