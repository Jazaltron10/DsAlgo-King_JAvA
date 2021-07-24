package Freestyles;

import java.util.Scanner;
import java.util.Arrays;

public class Freestyle_1 {
    static void cat() {
        String name = "dasko";
        switch (name) {
            case "john":
                System.out.println("welcome john");
                break;
            case "mary":
                System.out.println("welcome mary");
                break;
            case "dasko":
                System.out.println("welcome dasko");
                break;
            default:
                System.out.println("Can't find who you are looking for ");

        }
    }

    static void PhoneBills() {
        Scanner scan = new Scanner(System.in);
        int phonebills[] = new int[12];
        // phonebills[12] = data.nextInt();
        float sum = 0, average;
        int i;
        scan.close();//shouldn't be closed 
        System.out.print("\n");
        for (i = 0; i < 12; i++) {
            System.out.print((i + 1) + "=>$");
            phonebills[i] = scan.nextInt();
        }
        // System.out.println(phonebills[i]);
        for (i = 0; i < 12; i++) {
            sum += phonebills[i];
        }

        average = sum / (float) 12;
        System.out.println("\nYour average phonebill for 12 months is $" + average);
    }

    static void SimpleAdd() {
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += i;
        }
        System.out.println("\n" + sum);
    }

    static void RecursiveAdd(int[] arrList) {
        for (int i = 0; i < arrList.length; i++) {
            arrList[i] = arrList[i] * 2;
            System.out.println((arrList[i] / 2) + " Multiplied by 2 is " + arrList[i]);
        }
        System.out.println("\n" + Arrays.toString(arrList));
    }

    static void countdown(int n) {
        if (n <= 0) {
            System.out.println("BlastOff");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    static void countup(int n) {
        if (n > 0) {
            System.out.println("BlastOff");
        } else {
            System.out.println(n);
            countup(n + 1);
        }
    }

    static void VerifyInput(Scanner n) {
        boolean runAgain = true;
        while (runAgain == true) {
            int user_input = n.nextInt();
            if (user_input > 0) {
                System.out.println("I am counting Down from " + user_input + " to trigger a BlastOff!");
                countdown(user_input);// calling the countdown() if user_input is greater than 0
            } else if (user_input < 0) {
                System.out.println("I am counting up from " + user_input + " to trigger a BlastOff!");
                countup(user_input);// calling the countup() if user_input is less than 0
            } else {
                System.out.println("BlastOff Baby!");
            }
            Scanner runInput = new Scanner(System.in);
            runAgain = AskRunAgain(runInput);
        }
    }

    static boolean AskRunAgain(Scanner askUser) {
        String UserChoice;
        System.out.println("\nWould You Like To Countdown Again? [y/n]: ");
        UserChoice = askUser.nextLine();
        UserChoice = UserChoice.toLowerCase();

        if ((UserChoice.equals("y")) || (UserChoice.equals("yes"))) {
            return true;
        } else if ((UserChoice.equals("n")) || (UserChoice.equals("no"))) {
            return false;
        } else {
            System.out.println("Sorry it seems like an error occurred");
            return false;
        }
    }

    static int callAgain(int n) {
        if (n == 0) {
            return n;
            // n += 20;
        } else if (n < 10) {
            callAgain(n - 1);
            System.out.println(n);
        }
        return n;
    }

    static int printString(String name, int Number) {

        if (Number <= 0) {
            System.out.println("\nStopping Now");
            return 0;
        }
        System.out.println(name);
        printString(name, Number - 1);
        return Number;
    }

    public static void main(String[] args) {
        System.out.println("The Freestyle is back baby\n ");
        // int []arrList = {1,2,3,4,5,6};
        // System.out.println("\n" + (1*2));
        // cat();
        // PhoneBills();
        // SimpleAdd();
        // RecursiveAdd(arrList);
        // countdown(10);
        // countup(-10);

        // int k = printString("james", 5);
        int j = callAgain(9);
        System.out.println(j);
        Scanner input = new Scanner(System.in);
        VerifyInput(input);
        input.close();

    }
}
