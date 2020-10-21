package com.jeffersonnguyen.chapter5;
/**
 * Prompt and source code copied from zyBooks
 * Challenge Activity 5.2.2
 * Write three statements to print the first three elements of array runTimes. Follow each statement with a newline. Ex: If runTime = {800, 775, 790, 805, 808}, print:
 * 800
 * 775
 * 790
 *
 *
 * Note: These activities will test the code with different test values. This activity will perform two tests, both with a 5-element array. See "How to Use zyBooks".
 *
 * Also note: If the submitted code tries to access an invalid array element, such as runTimes[9] for a 5-element array, the test may generate strange results. Or the test may crash and report "Program end never reached", in which case the system doesn't print the test case that caused the reported message.
 */

import java.util.Scanner;

public class PrintRunTimes {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        int [] runTimes = new int[NUM_ELEMENTS];
        int i;

        for (i = 0; i < runTimes.length; ++i) {
            runTimes[i] = scnr.nextInt();
        }

        /* Your solution goes here  */
        System.out.println(runTimes[0]);
        System.out.println(runTimes[1]);
        System.out.println(runTimes[2]);
    }
}