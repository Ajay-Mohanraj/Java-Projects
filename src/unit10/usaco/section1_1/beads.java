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

//	public double beadHandler(ArrayList<Character> temp1) {
//
//	}

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

		//
		for (int i = 1; i < len; i++) {
			int tempCount = 0;
			ArrayList<Character> temp1 = new ArrayList<>(beadsList.subList(0, i));
			ArrayList<Character> temp2 = new ArrayList<>(beadsList.subList(i, beadsList.size()));

			ArrayList<Character> temp3 = new ArrayList<>();
			ArrayList<Character> temp4 = new ArrayList<>();

			if (temp1.get(temp1.size()-1) == 'w') {
				for (int k = temp1.size()-1; k >= 0; k--) {

					if (temp1.get(k) == 'b' || temp1.get(k) == 'r') {
						temp3 = new ArrayList<>(temp1.subList(0, k+1));
						break;
					}
					++tempCount;
				}
			}

			if (temp2.get(0) == 'w') {
				for (int c = 0; c < temp2.size(); c++) {

					if (temp2.get(c) == 'b' || temp2.get(c) == 'r') {
						temp4 = new ArrayList<>(temp2.subList(c, temp2.size()));
						break;
					}
					++tempCount;
				}
			}

			else if (temp1.get(temp1.size()-1) == 'b') {
				for (int a = temp1.size()-1; a >= 0; a--) {
					if (temp1.get(a) != 'r') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			else {
				for (int a = temp1.size()-1; a >= 0; a--) {
					if (temp1.get(a) != 'b') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			if (temp2.get(0) == 'b') {
				for (int b = 0; b < temp2.size(); b++) {
					if (temp2.get(b) != 'r') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			else {
				for (int d = 0; d < temp2.size(); d++) {
					if (temp2.get(d) != 'b') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			// for loop through temp3 and temp4 using last and first values as checking point for rest

			if (temp3.size() != 0 && temp4.size() != 0) {
				char referenceTemp3 = temp3.get(temp3.size()-1);
				for (int e = temp3.size()-1; e >= 0; e--) {
					if (temp3.get(e) == referenceTemp3 || temp3.get(e) == 'w') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			if (temp4.size() != 0) {
				char referenceTemp4 = temp4.get(0);
				for (int f = 0; f < temp4.size(); f++) {
					if (temp4.get(f) == referenceTemp4 || temp4.get(f) == 'w') {
						++tempCount;
					}
					else {
						break;
					}
				}
			}

			if (tempCount > longest) {
				longest = tempCount;
			}


		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));


		out.println();//close);
		out.close();
		in.close();
		}
		System.out.println(longest);
	}
}
