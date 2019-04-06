package unit10.labs.StateCapitalQuizObjects;

public class StateCapital {

    private String state;
    private String capital;

    public StateCapital(String state, String capital){

        this.state = state;
        this.capital = capital;

    }

    public String getState() {

        return state;

    }

    public String getCapital() {

        return capital;

    }

    public boolean equals(Object o){

        StateCapital newO = (StateCapital)o;

        return this.state.equals(newO.state);

    }
}
