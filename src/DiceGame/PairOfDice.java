// package DiceGame;

public class PairOfDice {
    int die1; // Number showing on the first die
    int die2; // Number showing on the second die

    // First Constructor
    public PairOfDice() {
        // Constructor. Rolls the dice, so that they initially
        // show some random values.
        roll(); // Call the roll() method to roll the dice.
    }

    // Second Constructor
    public PairOfDice(int val1, int val2) {
        // constructor . Creates a pair of dice that are initially showing the values
        // val1 and val2.
        die1 = val1; // Assign specified values
        die2 = val2; // to the instance variables
    }

    public void roll() {
        /**
         * Roll the dice by setting each of the dice to be a random number between 1 and
         * 6.
         */
        die1 = (int) (Math.random() * 6 + 1);
        die2 = (int) (Math.random() * 6 + 1);
        // System.out.println("\nRandom roll :-> "+die1+" "+die2);
    }

    // public static void main(String[] args) {
    // PairOfDice dice = new PairOfDice(3, 4);
    // PairOfDice dice2 = new PairOfDice();
    // System.out.println("\n dice :-> "+dice.die1+" "+dice.die2);
    // System.out.println("\n dice2 :-> "+dice2.die1+" "+dice2.die2);
    // System.out.println(" ");
    // dice.roll();
    // dice2.roll();
    // }
}
