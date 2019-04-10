package unit10.usaco.section1_1;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;


public class gift1 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
        int np = Integer.parseInt(in.readLine());	// "Number of People" -- first number in file.

        String[] names = new String[np];		// Array to track the names of each person.
        HashMap<String, Integer> nameMap = new HashMap<>();	// Dictionary that maps "name" to "dollars"

        //
        // TODO
        // Create a loop to fill names and nameMap; this requires reading "np" names from the file.
        // Add each name to the array.  Then add the name to the nameMap with 0 dollars.  (Use put.)
        //

        for (int i = 0; i <= np; i++) {
            nameMap.put();
        }
        String giver = in.readLine();  // Read the name of the first giver
        while (giver != null) {
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");
            int totalGift = Integer.parseInt(st.nextToken());		// Read total dollars
            int recipients = Integer.parseInt(st.nextToken());		// Read number of recipients

            //
            // TODO
            // Distribute the gifts from the giver to each recipient.
            // Use int dollars = nameMap.get(name) to lookup the dollars that a person currently has
            // Use nameMap.put(name, ###) to set a new # of dollars for the person.
            //

            giver = in.readLine();		// Read the name of the next giver.
        }

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

        //
        // TODO
        // Print out the name's of the people along with their ending dollars.
        // (Loop through the array, look up the dollars.)
        //

        out.close();
        in.close();
    }
}
