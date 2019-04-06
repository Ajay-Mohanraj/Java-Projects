package unit10.labs.StateCapitalQuizObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StateCapitalList {

    private ArrayList<StateCapital> stateCapitalList = new ArrayList<>();

    public StateCapitalList(String filename) throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader(filename));

        while (in.hasNextLine()) {

            String line = in.nextLine();
            String[] combo = line.split(":");
            // StateCapital add = new StateCapital(combo[0], combo[1]);
            stateCapitalList.add(new StateCapital(combo[0], combo[1]));

        }
    }

    public StateCapital getRandomState() {

        Random rand = new Random();
        return (stateCapitalList.get(rand.nextInt(stateCapitalList.size())));

    }

    public int statesRemaining() {

        return stateCapitalList.size();

    }

    public void remove(StateCapital sc){

        stateCapitalList.remove(sc);

    }

}
