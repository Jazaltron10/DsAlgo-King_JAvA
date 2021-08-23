// package CS;

import javax.swing.JOptionPane;

public class SuperMan {
    public static void main(String[] args) {
        String power = JOptionPane.showInputDialog("What is your super power?");
        power = power.toUpperCase();
        JOptionPane.showMessageDialog(null, power + " TO THE RESCUE!");

    }
}
