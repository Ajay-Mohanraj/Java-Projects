package unit10.usaco.section1_1;/*
ID: YOUR_NAME
LANG: JAVA
TASK: beads
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
		for (int i = 0; i < len; i++) {
			int tempCount = 0;
			ArrayList<Character> temp1 = new ArrayList<>(beadsList.subList(0, i));
			ArrayList<Character> temp2 = new ArrayList<>(beadsList.subList(i, beadsList.size()));

		}

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));


		out.println(longest);
		out.close();
		in.close();
	}
}
