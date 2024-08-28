package JavaPrograms;

import java.util.Scanner;

public class Fullpyramidpattern {
	
	public static void printFullPyramid(int rows) {
        // Outer loop to handle rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop to handle spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Inner loop to handle stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
	}

	public static void main(String[] args) {
	
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.print("Enter the number of rows for the pyramid: "); int rows =
		 * scanner.nextInt();
		 */
		int rows = 3;
        // Print the pyramid
        printFullPyramid(rows);

	}

}
