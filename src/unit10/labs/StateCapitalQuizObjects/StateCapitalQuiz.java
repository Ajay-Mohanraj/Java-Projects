package unit10.labs.StateCapitalQuizObjects;

import javax.swing.*;
import java.io.FileNotFoundException;

public class StateCapitalQuiz {

    public static void main(String[] args) throws FileNotFoundException {

        String[] possibleChoices = {"I accept the challenge.", "I decline the challenge."};
        String choice = (String) JOptionPane.showInputDialog(null, "Welcome to State Capital Quiz!",
                "Input", JOptionPane.QUESTION_MESSAGE, null, possibleChoices, possibleChoices[0]);

        if (choice.equals("I decline the challenge.")) {

            JOptionPane.showMessageDialog(null, "Not all soldiers are fit for this duty...");
        }

        else {

            JOptionPane.showMessageDialog(null, "So you think you are the one for the job...");
            String[] possibleFiles = {"states_small_test.txt", "states_east.txt", "states_south.txt", "states_west.txt", "states_central.txt", "states_all.txt"};

            String file = (String) JOptionPane.showInputDialog(null, "Which quiz file would you like to use?",
                    "Input", JOptionPane.QUESTION_MESSAGE, null, possibleFiles, possibleFiles[0]);

            if (file != null) {

                StateCapitalList stateCapitalList = new StateCapitalList(file);

                String input = "";
                int correct = 0;
                int guesses = 0;

                while (input != null && stateCapitalList.statesRemaining() > 0) {

                    StateCapital state = stateCapitalList.getRandomState();
                    input = JOptionPane.showInputDialog("What is the capital of " + (state.getState()) + "?");

                    if (state.getCapital().equals(input)) {

                        correct++;
                        guesses++;
                        stateCapitalList.remove(state);
                        JOptionPane.showMessageDialog(null, "Correct.");

                        if (stateCapitalList.statesRemaining() == 0) {

                            JOptionPane.showMessageDialog(null, "Congratulations. You named " + correct + " capitals in " + guesses + " guesses.");

                        }
                    }

                    else if (input == null) {

                        JOptionPane.showMessageDialog(null, "You named " + correct + " capitals in " + guesses + " guesses.");

                    }

                    else {

                        guesses++;
                        JOptionPane.showMessageDialog(null, "Incorrect. The capital is " + state.getCapital() + ".");

                    }
                }
            }

            else {

                JOptionPane.showMessageDialog(null, "Bye!");

            }
        }
    }
}