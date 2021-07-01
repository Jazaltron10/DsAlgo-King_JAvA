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
                JOptionPane.showMessageDialog(null, "Correct!");
                return answer;
            } else if (answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
                JOptionPane.showMessageDialog(null, "InCorrect! Please try again");
                // continue;
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer please enter A,B,C,D or E");
                // continue;
                return answer;
            }

        }

    }

    static void check(String question, String correctAnswer){
        String answer = ask(question);
        if (answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "This is the Correct answer");
            nCorrect++;
        }
        else {
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
        System.out.println("\n"+question);
        check(question, "A");
        
        String question_2 = "Who won the 2016 Euro Cup\n";
        question_2 += "A. Portugal\n";
        question_2 += "B. Spain\n";
        question_2 += "C. Germany\n";
        question_2 += "D. France\n";
        question_2 += "E. Italy\n";
        System.out.println("\n"+question_2);
        check(question_2, "A");
        
        String question_3 = "Who won the 2014 World Cup\n";
        question_3 += "A. Germany\n";
        question_3 += "B. Spain\n";
        question_3 += "C. Argentina\n";
        question_3 += "D. France\n";
        question_3 += "E. Italy\n";
        System.out.println("\n"+question_3);
        check(question_3, "A");
    
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
