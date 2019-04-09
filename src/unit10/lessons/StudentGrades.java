package unit10.lessons;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    public static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (sum / list.size());
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileReader("grades.txt"));
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] lineArray = line.split(":");
            String name = lineArray[0];
            int grade = Integer.parseInt(lineArray[1]);
            if (!map.containsKey(name)) {
                map.put(name, new ArrayList<>());
            }
            ArrayList<Integer> gradeList = map.get(name);
            gradeList.add(grade);
        }

        for (String s : map.keySet()) {
            System.out.println(s + ": " + average(map.get(s)));

        }

    }
}
