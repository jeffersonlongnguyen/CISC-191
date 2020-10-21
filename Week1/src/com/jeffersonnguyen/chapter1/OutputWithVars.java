package com.jeffersonnguyen.chapter1;
/**
 *
 */

import java.util.Scanner;

public class OutputWithVars {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;

        System.out.println("Enter integer:");
        userNum = scnr.nextInt();

        /* Type your code here */
        System.out.println("You entered: " + userNum);

        int squared = userNum * userNum;
        System.out.println(userNum + " squared is " + squared);

        int cubed = userNum * userNum * userNum;
        System.out.println("And " + userNum + " cubed is " + cubed + "!!");

        int userNum2;
        System.out.println("Enter another integer:");
        userNum2 = scnr.nextInt();

        int addition = userNum + userNum2;
        int multiplication = userNum * userNum2;
        System.out.println(userNum + " + " + userNum2 + " is " + addition);
        System.out.println(userNum + " * " + userNum2 + " is " + multiplication);
    }
}
/**
* Expected Output Example:
* Enter integer:
* 4
* You entered: 4
* 4 squared is 16
* And 4 cubed is 64!!
* Enter another integer:
* 5
* 4 + 5 is 9
* 4 * 5 is 20
*/

