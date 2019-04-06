package unit10.labs.StateCapitalQuizObjects;

import javax.swing.*;
import java.io.FileNotFoundException;

public class StateCapitalQuiz {

    public static void main(String[] args) throws FileNotFoundException, NullPointerException{
        JOptionPane.showMessageDialog(null, "This is State Capital Quiz");
        String[] possibleFiles = {"states_small_test.txt", "states_east.txt", "states_south.txt", "states_west.txt", "states_central.txt", "states_all.txt"};

        String file = (String) JOptionPane.showInputDialog(null, "Which quiz file would you like to use?",
                "Input", JOptionPane.QUESTION_MESSAGE, null, possibleFiles, possibleFiles[0]);

        if (file != null) {
            StateCapitalList stateCapitalList = new StateCapitalList(file);

            String input = "";

            while (input != null && stateCapitalList.statesRemaining() > 0){

                StateCapital state = stateCapitalList.getRandomState();
                input = (String) JOptionPane.showInputDialog("What is the capital of " + (state.getState()));
                if (state.getCapital().equals(input)){
                    stateCapitalList.remove(state);
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Bye");
        }
        //while () {

        //}

    }
}
