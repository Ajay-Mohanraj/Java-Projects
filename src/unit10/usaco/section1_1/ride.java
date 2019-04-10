/*
ID: ajamoh21
LANG: JAVA
TASK: ride
*/

package unit10.usaco.section1_1;
import java.io.*;

class ride {

  public static void main (String[] args) throws IOException {

    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

    char[] l1 = f.readLine().toCharArray();  // l1 is an array representing the first line in the file
    char[] l2 = f.readLine().toCharArray();  // l2 is an array representing the first line in the file

    // Your code goes here.
    // It should print "GO" or "STAY" depending on some math....

    int cometProduct = 1;
    int groupProduct = 1;

    for (int i = 0; i < l1.length; i++) {
      cometProduct *= l1[i] - 'A' + 1;
      }

    for (int i = 0; i < l2.length; i++){
      groupProduct *= l2[i] - 'A' + 1;
    }

    if (cometProduct % 47 == groupProduct % 47) {
      out.println("GO");
    }
    else {
      out.println("STAY");
    }
    out.close();
  }


}
