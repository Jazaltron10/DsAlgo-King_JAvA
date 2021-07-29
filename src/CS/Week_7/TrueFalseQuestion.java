package CS.Week_7;
import javax.swing.*;
public class TrueFalseQuestion extends Question {
    public TrueFalseQuestion(String question, String answer){
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons, "TRUE");
        addButton(buttons, "FALSE");
        this.question.add(buttons);
        initQuestionDialog();

        this.correctAnswer = answer;
        this.correctAnswer = this.correctAnswer.toUpperCase();
    }

    void addButton(JPanel buttons, String label){
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
    
}
