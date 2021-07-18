package CS.Week_5;
import javax.swing.JOptionPane;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;
    String question;
    String correctAnswer;
    abstract String ask();
    
    void check() {
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null, correctAnswer + " is the Correct answer");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect The correct answer is " + correctAnswer);
        }
        nQuestions++;
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " questions Correct out of " + nQuestions + " Questions");
    }
}
