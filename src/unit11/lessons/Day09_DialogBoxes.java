package unit11.lessons;

import javax.swing.*;

public class Day09_DialogBoxes {
    public static void main(String[] args) {
        String[] possibleValues = {"Friend", "Foe"};

        String response = (String)JOptionPane.showInputDialog(null, "Are you a friend or a foe?",
                "Input", JOptionPane.QUESTION_MESSAGE, null, possibleValues, possibleValues[0]);

        String name = (String) JOptionPane.showInputDialog("What is your name");

        System.out.println(response);
        System.out.println(name);

        if (name != null){
            JOptionPane.showMessageDialog(null, "Hello, " + name);
        }
        else {
            JOptionPane.showMessageDialog(null, "Hello anonymous");
        }
    }
}
