package CS;

import javax.swing.JOptionPane;

public class Quiz_2 {
    static int nQuestions = 0;
    static int nCorrect = 0;

    static String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("A")) {
                //JOptionPane.showMessageDialog(null, "Correct!");
                return answer;
            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                //JOptionPane.showMessageDialog(null, "InCorrect!");
                return answer;
                // continue;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer please enter A, B, C, D, or E");
                // return answer;
                // continue;
            }

        }

    }

    static void check(String question, String correctAnswer) {
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, correctAnswer + " is the Correct answer");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect The correct answer is " + correctAnswer);
        }
        nQuestions++;
    }

    public static void main(String[] args) {
        String question = "Who won the 2018 FIFA World Cup\n";
        question += "A. France\n";
        question += "B. Spain\n";
        question += "C. Germany\n";
        question += "D. Brazil\n";
        question += "E. Croatia\n";
        System.out.println("\n" + question);
        check(question, "A");

        String question_2 = "Who won the 2016 Euro Cup\n";
        question_2 += "A. Portugal\n";
        question_2 += "B. Spain\n";
        question_2 += "C. Germany\n";
        question_2 += "D. France\n";
        question_2 += "E. Italy\n";
        System.out.println("\n" + question_2);
        check(question_2, "A");

        String question_3 = "Who won the 2014 FIFA World Cup\n";
        question_3 += "A. Germany\n";
        question_3 += "B. Spain\n";
        question_3 += "C. Argentina\n";
        question_3 += "D. France\n";
        question_3 += "E. Italy\n";
        System.out.println("\n" + question_3);
        check(question_3, "A");

        String question_4 = "Who won the 2017 UEFA Champions League\n";
        question_4 += "A. Real Madrid\n";
        question_4 += "B. Arsenal\n";
        question_4 += "C. Norwich\n";
        question_4 += "D. Burundi\n";
        question_4 += "E. Chelsea\n";
        System.out.println("\n" + question_4);
        check(question_4, "A");

        String question_5 = "Who won the 2020 English Premier League\n";
        question_5 += "A. Arsenal\n";
        question_5 += "B. Liverpool\n";
        question_5 += "C. Leicester City\n";
        question_5 += "D. Manchester City\n";
        question_5 += "E. Chelsea\n";
        System.out.println("\n" + question_5);
        check(question_5, "B");

        JOptionPane.showMessageDialog(null, nCorrect + " questions Correct out of " + nQuestions + " Questions");

        // question = "Who won the 2015 UCL\n";
        // question += "A. Barcelona\n";
        // question += "B. Real Madrid\n";
        // question += "C. Juventus\n";
        // question += "D. Egypt\n";
        // question += "E. Canada\n";
        // check(question, "A");
    }
}
