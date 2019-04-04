package unit10.lessons.ClubObject;

public class ClubTester {

    public static void main(String[] args) {

        Club c = new Club("AI", "Wang", Club.AFTERNOON);
        Student s1 = new Student ("Mirza", "Kir", "ATCS", 2022);
        Student s2 = new Student ("Penelope", "Om");

        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(new Student("Emma", "Millet"));
        c.addStudent(new Student("Frank", "Casella"));
        c.addStudent(new Student("Jeffrey", "Smith"));

        c.deleteStudent("Jeffrey", "Smith");
        System.out.println(c);
    }
}