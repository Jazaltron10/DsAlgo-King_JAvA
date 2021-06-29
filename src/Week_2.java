public class Week_2 {
    public static void main(String[] args) {
        System.out.println("Discussion Assignment Unit 2");
        /*--PART 1---------------------------------------------------------------------------*/
        System.out.println("\n\n\nPart 1 -> THE DO WHILE LOOP");
        // The Do While Loop Example
        boolean pub = true;
        do {
            System.out.println("pub is false");
        } while (pub == false);

        // while loop alternative
        System.out.println("\n<--Alternative-while_loop-->");
        while (pub == false) {
            // Nothing gets printed because conditional is checked
            // Before loop gets executed
            System.out.println("pub is false");
        }

        // For loop alternative
        System.out.println("\n<--Alternative-for_loop-->");
        for (int i = 0; i < 1; i++) {
            if (pub == false) {
                System.out.println("The for Loop");
            }
            System.out.println("pub is probably false");
        }
        /*
         * Advantages: The do-while loop ensures that no matter what happens, the
         * contents within the body of the do statement get executed at least once, this
         * is achieved, through the conditional while statement only getting executed
         * after the body of the loop has been executed, hence the "do" statement. This
         * is useful when you want some code or function to run before the loop
         * conditional while statement kicks in.
         * 
         * Disadvantages: Conditional checks can be a good thing as they can sometimes
         * help in preventing runtime errors as well as semantic errors, with the do
         * while loop the program gets executed at least once before any credible
         * conditional checks are established or triggered, hence a runtime error or
         * semantic error could occur during that period.
         *
         */

        /*--PART 2---------------------------------------------------------------------------*/
        System.out.println("\n\n\nPart 2 -> THE WHILE LOOP");
        // The While Loop Example
        String traffic = "green";
        int countDown_w = 3;
        int countDown_d = 3;
        int countDown_f = 3;
        while (traffic == "green" && countDown_w != 0) {
            System.out.println("GO GO GO " + countDown_w);
            countDown_w--;
        }

        // Do while loop alternative
        System.out.println("\n<--Alternative-do_while_loop-->");
        do {
            traffic = "red"; // if the traffic turns red this still executes at least once
            System.out.println("GO GO GO " + countDown_d);
            countDown_d--;
        } while (traffic == "green" && countDown_d != 0);

        // For loop alternative
        System.out.println("\n<--Alternative-for_loop-->");
        for (int i = 0; i < countDown_f; i++) {
            System.out.println("GO GO GO " + countDown_f--);
        }
        /*
         * Advantages: As can be seen from the examples above with the while loop I am
         * able to test both the traffic and countDown in a conditional before I can
         * execute the loop and this is simply not possible with the other types of
         * loop, or if it is, it is not as straightforward and easy to comprehend like
         * the while loop e.g
         * 
         * The for loop is the least efficient way to replicate the results of the while
         * loop, it introduce a new variable I and never makes use of the traffic
         * variable, the only way to do this is if I introduces an if statement to check
         * for traffic and wrap the result in this statement, that is just an extra step
         * that would not be needed when using the while loop.
         * 
         * As for the do-while loop, this just executes without checking for the
         * traffic, again I could do this with a separate if-else statement, but that is
         * just extra work. so in this case, if traffic turned red, the do-while while
         * loop will still execute and this will cause an accident.
         * 
         * Disadvantages: Take the example in <--PART 1--> every other type of loop has
         * a way of printing something if a tested conditional controlling the loop
         * evaluates to false but as far as I can see unless an if statement is
         * implemented within a while loop directly there is no way to print out an
         * alternative message when the loop conditional evaluates to false.
         */

        /*--PART 3---------------------------------------------------------------------------*/
        System.out.println("\n\n\nPart 3 -> THE FOR LOOP");
        // The For loop example
        String[] SmokingSquad = { "Ironman", "Bus Conductor", "Cinderella", "Judas", "Electrician" };
        for (int i = 0; i < SmokingSquad.length; i++) {
            System.out.print("Welcome to Paradise " + SmokingSquad[i] + "\n");
        }

        // Do while loop alternative
        System.out.println("\n<--Alternative-do_while_loop-->");
        int limit = 0;
        do {
            System.out.print("Welcome to Paradise " + SmokingSquad[limit] + "\n");
            limit++;
        } while (limit < SmokingSquad.length);

        // while loop alternative
        System.out.println("\n<--Alternative-while_loop-->");
        int j = 0;
        while (j < SmokingSquad.length) {
            System.out.print("Welcome to Paradise " + SmokingSquad[j] + "\n");
            j++;
        }
        /*
         * Advantages: The Only advantage the for loop offers here is giving the
         * programmer the ability to write a more concise and shorter program to achieve
         * the same task it would take both a do-while loop and while loop multiple
         * lines to write. The for loop gives you a syntax that is short, concise and
         * straight to the point and very easy to understand.
         * 
         * Disadvantages: One of the major disadvantages I noticed when working with for
         * loops is that conditional statements or checks that involve the use of
         * boolean true and false are impossible to implement in the initial for loop
         * statement unlike the while loop and even do-while loop. in for loop if
         * boolean values are to be used they have to be nested within the for loop with
         * the help of the if statement. Alternatively, with the other loops, i can just
         * test the condition of my boolean in the initial statement of the loop. Check
         * <--PART 1-->
         * 
         */

        /*
         * Summary: As can be seen from the examples given above, all these different
         * loops have mostly the same functionality and can be used interchangeably.
         * However there are some key differences I spotted when running different
         * coding examples.
         * 
         * The do-while loop is best used if you must have a functionality run before
         * the conditional statement contained by the while section is implemented.
         * 
         * The while loop is best for situations where you must control the flow of the
         * loop with a boolean or complex conditional statement. Both the while loop and
         * do-while loop often fall into the problem of an infinite loop, this is
         * because the programmer has to define explicitly the upper bound of and
         * increment of the loop condition and this can be sometimes difficult
         * especially if you are using a boolean expression as your conditional.
         *
         * The for loop is one of the easiest to work with because it has a clearly
         * defined start, end, and increment section and this is often the best option
         * for iterating through a list of items and it is also the easiest to implement
         * and also understand. Note: conditionals can only be implemented within an if
         * statement nested in the for loop.
         * 
         */

    }

}
