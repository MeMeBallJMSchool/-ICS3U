/*
 * This program is meant to showcase the use of the Scanner class.
 * In the program we do three tasks. Calculate area,  covert cents to cents and dollars and calculate change.
 * @auther Joshua Morton
 * @version 1.0.0
 * @date Feb 17 2023
 */

import java.util.Scanner;

public class MortonJMScannerInput {
  public static void main(String[] args) {
    // Create a new Scanner to read from stdin
    Scanner input = new Scanner(System.in);

    // Exercise 1
    System.out.print("Input the radius: ");
    int radius = input.nextInt();
    // area of circle = πr^2
    double area = radius * radius * Math.PI;
    System.out.printf("The area of the circle is %f%n%n", area);

    // Exercise 2
    System.out.print("Input the cents: ");
    int cents = input.nextInt();
    int dollars = cents / 100;
    // Calulates how many cents will be left over when reamoving whole dollars.
    int change = cents % 100;
    System.out.printf("The is %d dollars and %d cents.%n%n", dollars, change);

    // Exercise 3
    // Cost and payment in cents
    System.out.print("How much does the item cost? ");
    int cost = input.nextInt();
    System.out.print("How much did the customer payed? ");
    int payment = input.nextInt();
    // To calulate the most optimal change of currency,
    // first we first try to fit the most value types.
    // After we fit each curreny we subtract how much is left.
    int moneyOwed = payment - cost;
    int changeDollar = moneyOwed / 100;
    moneyOwed -= changeDollar * 100;
    int changeQuater = moneyOwed / 25;
    moneyOwed -= changeQuater * 25;
    int changeDime = moneyOwed / 10;
    moneyOwed -= changeDime * 10;
    int changeNickel = moneyOwed / 5;
    moneyOwed -= changeNickel * 5;

    System.out.printf("The customer's change is: %d dollars, %d quarters, %d dime, %d nickels and %d cents.%n%n",
        changeDollar, changeQuater, changeDime, changeNickel, moneyOwed);

    input.close();
  }
}
