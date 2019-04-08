package unit10.labs.StateCapitalQuizObjects;

import java.io.*;
import java.util.*;

public class StateCapitalList {

    public ArrayList<StateCapital> stateCapitalList = new ArrayList<>();

    public StateCapitalList(String filename) throws FileNotFoundException {

        Scanner in = new Scanner(new FileReader(filename));

        while (in.hasNextLine()) {

            String line = in.nextLine();
            String[] combo = line.split(":");
            StateCapital add = new StateCapital(combo[0], combo[1]);
            stateCapitalList.add(add);

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

        for (int i = 0; i < stateCapitalList.size(); i++) {

            if (stateCapitalList.get(i).getState().equals(sc.getState())) {

                stateCapitalList.remove(i);

            }
        }
    }
}