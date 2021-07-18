package CS.Week_5;
import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer){
        this.question = "TRUE or FALSE: " + question;
        this.correctAnswer = answer;
        this.correctAnswer = this.correctAnswer.toUpperCase();
    }
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("Y") || answer.equals("YES") || answer.equals("T") || answer.equals("TRUE")) {
                return "TRUE";
            }
            else if (answer.equals("N") || answer.equals("NO") || answer.equals("F") || answer.equals("FALSE")) {
                return "FALSE";
            } 

            else {
                JOptionPane.showMessageDialog(null, "Invalid answer please enter True or False");
            }

        }

    }
}
