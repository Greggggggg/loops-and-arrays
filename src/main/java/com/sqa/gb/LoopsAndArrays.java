/**
 *   File Name: LoopsAndArrays.java<br>
 *
 *   bouimer, greg<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 19, 2017
 *
 */

package com.sqa.gb;

/**
 * LoopsAndArrays //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author bouimer, greg
 * @version 1.0.0
 * @since 1.0
 *
 */
public class LoopsAndArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String appName = "Loops And Arrays";
		// String userName = AppBasics.greetUserAndGetName(appName);
		countNumbers1to100();
		countNumbers200to100();
		countNumbers10To1000();
		// printAscendingCountByFor();
		countNumbers1to100EvenOnly();

		// AppBasics.farewellUser(userName, appName);

	}

	private static void countNumbers10To1000() {
		for (int i = 10; i <= 1000; i = i + 10) {
			System.out.print(i);
			if (i < 1000) {
				System.out.print(", ");
			}
		}
		System.out.print("\n");

	}

	/**
	 *
	 */
	private static void countNumbers1to100() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			if (i < 100) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	private static void countNumbers1to100EvenOnly() {
		// intializing i and setting to i
		int i = 1;
		// Doing a loop untill condition is no longer true
		while (i <= 100) {
			// check that there is no remainder when dividing by 2 (divisible)
			if (i % 2 == 0) {
				// Print out the number for i for current iteration
				System.out.print(i);
				// check if the number if its not last number counting to
				if (i < 100) {
					// print the number if its not the last number number
					System.out.print(",");
				}

			}
			// increment i by 1 at the end of every interation
			i++;
		}
		System.out.print("\n");
	}
	//
	//
	//
	// }
	// // Print a new line so that next method doesnt start on the same line
	//
	// System.out.print("\n")

	private static void countNumbers200to100() {
		for (int i = 200; i >= 100; i--) {
			System.out.print(i);
			if (i > 100) {
				System.out.print(",");
			}

		}
		System.out.println();
	}

}