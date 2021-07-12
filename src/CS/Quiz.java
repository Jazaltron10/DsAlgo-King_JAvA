package CS;

import javax.swing.JOptionPane;

public class Quiz {
    public static void main(String[] args) {
        String question = "Who won the 2018 FIFA World Cup\n";
        // System.out.println(question);
        question += "A. France\n";
        question += "B. Spain\n";
        question += "C. Germany\n";
        question += "D. Brazil\n";
        question += "E. Italy\n";

        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                return;
            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "InCorrect! Please try again");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer please enter A,B,C,D or E");
            }
        }
        // System.out.println(question);
    }
}
