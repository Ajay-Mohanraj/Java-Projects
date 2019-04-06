package unit10.labs.StateCapitalQuizObjects;

import javax.swing.*;

public class StateCapitalQuiz {
    public static void main(String[] args) {
        String[] possibleValues = {"Friend", "Foe"};

        String response = (String) JOptionPane.showInputDialog(null, "Are you a friend or a foe?",
                "Input", JOptionPane.QUESTION_MESSAGE, null, possibleValues, possibleValues[0]);
    }
}
