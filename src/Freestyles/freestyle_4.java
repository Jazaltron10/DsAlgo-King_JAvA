package Freestyles;

import javax.swing.JOptionPane;

public class Freestyle_4 {
static int nQuestions = 0;  
static int nCorrect = 0;

public static void main(String[] args) {
    String question="Who is the founder of Facebook?\n";
    question += "A. Larry Ellison\n";
    question += "B. Bill Gates \n";
    question += "C. Mark Zuckerberg \n";
    question += "D. Jerry Yang \n";
    question += "E. Thomas J. \n";
    check(question, "C");
    
    String question2 = "Which of the following is fastest land animal?\n";
    question2 +="A. Cheetah\n";
    question2 +="B. Tiger\n";
    question2 +="C. Kangaroo\n";
    question2 +="D. Elephant\n";
    question2 +="E. Sloth";
    check(question2, "A");
    
    
    String question3 = "What do the five rings on the Olympic symbol represent?\n";
    question3 +="A. the five oceans\n";
    question3 +="B. the five Greek Gods\n";
    question3 +="C. the five planets\n";
    question3 +="D. the five countries\n";
    question3 +="E. the five continents";
    check(question3, "E");
    
    JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions.");
}    
    
static String ask(String question){
String answer;
while(true){
    answer = JOptionPane.showInputDialog(question);
    answer = answer.toUpperCase();
    if(!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"))) {
        JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
    } 
    else {
        return answer;
        }
    }
} 

static void check(String question, String correctAnswer){
    nQuestions= nQuestions+1;
    String answer = ask(question);
    if(answer.equals(correctAnswer)){
        nCorrect= nCorrect+1;
        JOptionPane.showMessageDialog(null,"Correct!");
        }
        else
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer + " . "); 
    }
}
