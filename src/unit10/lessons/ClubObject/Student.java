package unit10.lessons.ClubObject;

public class Student {
    private String firstName, lastName, academy;
    private int classYear;

    public Student(String firstName, String lastName, String academy, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.academy = academy;
        this.classYear = classYear;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean equals(Object o){
        Student s = (Student) o;
        boolean result = this.lastName.equals(s.lastName) && this.firstName.equals(s.firstName);

        System.out.println("Comparing [" + this + "] and [" + o + "] = " + result);
        return result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public String toString(){

        if (academy == null){
            return lastName + ", " + firstName;
        }

        return lastName + ", " + firstName + " - " + academy + " " + classYear;
    }
}
