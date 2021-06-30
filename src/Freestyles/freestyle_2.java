package Freestyles;
import java.util.Arrays;
import java.util.Scanner;
public class freestyle_2 {
    static void Arrays() {
        /* Array Syntax -> int [] arr = new int [5]; */
        String[] myNames = { "a", "b", "c", "d", "e" };
        int[] myNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    
        for (int loop = 0; loop < myNames.length; loop++) {
            System.out.println(myNames[loop] + " \n ");
        }
    
        int total = 0;
        for (int loop : myNums) {
            System.out.println("myNums[" + (loop - 1) + "] = " + loop);
            total += loop;
            System.out.println("The Sum of the Array called myNums is: " + total + " at myNums[" + loop + "]");
        }
    
        System.out.println(" \n" + "Therefore the Sum of the Array called myNums is:-> " + total);
    
        // Multi-Dimensional Arrays
        int[][] sample = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int x = sample[1][0];
        System.out.println(x);// The First element in second array
        int[][] crabay = { { 1, 2, 3, 4 }, { 24 }, { 5, 6, 7, 8 } };
        crabay[0][2] = 42;
        int bex = crabay[1][0];
        System.out.println(bex + "   " + crabay[0][2]);// 24 42
    
        int array1[] = new int[3];
        for (int i = 0; i < 3; i++)
            array1[i] = i;
    
        int res = array1[1] + array1[2] * array1[2];
        System.out.println(res);// 5
    
        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println("\n" + result);// 17
    
        int resilience = 0;
        for (int loop : myNums) {
            resilience += loop;
        }
        System.out.println("\n" + resilience);
    }
    static void countdown(int n){
        if (n <= 0){
            System.out.println("BlastOff");
        }
        else{
            System.out.println(n);
            countdown(n-1);
        }
    }
    static void countup(int n){
        if (n > 0){
            System.out.println("BlastOff");
        }
        else{
            System.out.println(n);
            countup(n+1);
        }
    }
    static void VerifyInput(Scanner n){
        boolean runAgain = true;
        while(runAgain == true)
        {
            int user_input = n.nextInt();
            if (user_input > 0){
                System.out.println("I am counting Down from "+ user_input +" to trigger a BlastOff!");
                countdown(user_input);//calling the countdown() if user_input is greater than 0
            }
            else if (user_input < 0){
                System.out.println("I am counting up from "+ user_input +" to trigger a BlastOff!");
                countup(user_input);//calling the countup() if user_input is less than 0
            }
            else {
                System.out.println("BlastOff Baby!");
            }
            Scanner runInput = new Scanner(System.in);
            runAgain = AskRunAgain(runInput);
        }
    }
    static boolean AskRunAgain(Scanner askUser){
        String UserChoice;
        System.out.println("\nWould You Like To Countdown Again? [y/n]: ");
        UserChoice = askUser.nextLine();
        UserChoice = UserChoice.toLowerCase();
    
        if ((UserChoice.equals("y"))||(UserChoice.equals("yes"))){
            return true;
        }
        else if ((UserChoice.equals("n"))||(UserChoice.equals("no"))){
            return false;
        }
        else{
            System.out.println("Sorry it seems like an error occurred");
            return false;
        }
    }
    static int Factorial(int n){
        if (n == 0){
            return 1;
        }
        else{
            int ricki = Factorial(n - 1);
            int rezi = n * ricki;
            return rezi;
        }
    }
    public static void main(String[] args) {
        Arrays();
        int[] myNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        System.out.println(Arrays.toString(myNums));
        
        
        int result = Factorial(3);
        System.out.println(result);
        
        
        Scanner input = new Scanner(System.in);
        VerifyInput(input);
        input.close();
    }
}
