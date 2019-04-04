package unit10.lessons.ClubObject;

import java.util.ArrayList;

public class Club {
    public static final int MORNING = 0;
    public static final int AFTERNOON = 1;
    public static final String[] TYPES = {"Morning", "Afternoon"};

    private String name;
    private String advisor;
    private int type;
    private ArrayList<Student> studentList = new ArrayList<>();

    public Club(String name, String advisor, int type) {
        this.name = name;
        this.advisor = advisor;
        this.type = type;
    }

    public void addStudent (Student s) {
        studentList.add(s);
    }

    public void deleteStudent (String firstName, String lastName) {
        Student s = new Student(firstName, lastName);
        studentList.remove(s);
    }

    public String toString() {
        String s = name + " (" + TYPES[type] + "): " + advisor;

        for (int i=0; i<studentList.size(); i++) {
            s += "\n\t" + studentList.get(i);
        }

        return s;
    }
}