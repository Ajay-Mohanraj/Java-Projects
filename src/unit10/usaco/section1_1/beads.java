package unit10.usaco.section1_1;/*
ID: YOUR_NAME
LANG: JAVA
TASK: beads
*/

import java.io.*;
import java.util.ArrayList;


public class beads {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new FileReader("beads.in"));
		int len = Integer.parseInt(in.readLine());

		// read the list of beads into an array of characters
		char[] beads = in.readLine().toCharArray();
		ArrayList<Character> beadsList = new ArrayList<>();
		for (char c : beads) {
			beadsList.add(c);
		}


		// longest length of beads so far
		int longest = 0;

		// wwwbbrwrbrbrrbrbrwrwwrbwrwrrb
		for (int i = 1; i < len; i++) {
			int temp = 0;
			char[] array =
		}

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));


		out.println(longest);
		out.close();
		in.close();
	}
}
