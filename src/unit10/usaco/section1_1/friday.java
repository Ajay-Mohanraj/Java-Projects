package unit10.usaco.section1_1;
/*
ID: ajamoh21
LANG: JAVA
TASK: friday
*/


import java.io.*;
import java.util.Arrays;

public class friday {
	static final int START_YEAR = 1900;


	public static boolean isLeapYear (int year) {
		if (year % 100 == 0) {
			return year % 400 == 0;
		}

		else {
			return year % 4 == 0;
		}
	}
	public static void main(String[] args) throws Exception {
		// Represents the frequency of the 13th by day of the week.
		// 1 = Sunday, 2 = Monday, ...
        int[] count = new int[7];

		BufferedReader input = new BufferedReader(new FileReader("friday.in"));
		int endYear = Integer.parseInt(input.readLine()) + START_YEAR;

		// 1 = Sunday, 2 = Monday, ...
		// January 1, 1900 was a Monday.
        int firstDayOfMonth = 2;

        // 1 = January, 2 = February, 3 = March, ...
		// -9999 is just a filler value.  We are not using the 0 position of the array.
        int[] days = {-9999, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Go progressively through every month from the start year through the end year.
        for (int year = START_YEAR; year < endYear; year++) {
			if (isLeapYear(year)) {
				days[2] = 29;
			}
			// change back to 28
            for (int month = 1; month <= 12; month++) {

            	// TODO
				// For each month, increment the appropriate position of the "count" array.
				// Then, determine the first day of the next month (based upon the length of the current month


				for (int i = 1; i <= days[month]; i++) {
					// use increments and use base monday to calculate what day it is - use modulus 7
					++firstDayOfMonth;
					if (i == 13) {
						++count[firstDayOfMonth % 7];
					}


				}
				// firstDayOfMonth = days[month]

			}
        }

		 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        //
		// TODO
		// Print out the count array in the required format.
		//
		out.println(Arrays.toString(count));


		 out.close();
		 input.close();
	}
}
