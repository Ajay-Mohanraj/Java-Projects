package unit11.lessons;

import java.util.*;
import java.io.FileReader;

public class Day09_Split {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(new FileReader("names.txt"));

        while (in.hasNextLine()){
            String line = in.nextLine();

            String[] names = line.split("-");

            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
