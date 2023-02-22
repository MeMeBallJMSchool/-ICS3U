/*
 * This program is meant to display my understanding of the Math class(at least a bit of it)
 * This program showcases the usage of Math.random, Math.sqrt, Math.Pi and Math.sin/cos aswell as other math related operations
 * 
 * @auther Joshua Morton
 * @version 1.0.0
 * @date Feb 21 2023
 */

public class MortonJMMathOperators {
  public static void main(String[] args) {

    // Question 3
    {
      int num1 = 7;
      int num2 = 8;
      int num3 = 4;
      int num4 = 5;

      System.out.println("If ints num1 = 7, num2 = 8, num3 = 4 and num4 = 5 then");
      System.out.printf("num1 * num2 = %d%n", num1 * num2);
      System.out.printf("num1 * num2 + num3 = %d%n", num1 * num2 + num3);
      System.out.printf("num1 * (num2 + num3) = %d%n", num1 * (num2 + num3));
      System.out.printf("(num1 * num2) + num3 = %d%n", (num1 * num2) + num3);
      System.out.printf("num2 / num3 = %d%n", num2 / num3);
      System.out.printf("num1 / num3 = %d%n", num1 / num3);
      System.out.printf("num4 - num3 / num2 = %d%n", num4 - num3 / num2);
      System.out.printf("num4 * num2 / num3 = %d%n", num4 * num2 / num3);
      // Double % is used to print single %
      System.out.printf("num1 %% num4 = %d%n", num1 % num4);
      System.out.printf("num2 %% num3 = %d%n%n", num2 % num3);
    }

    // Question 4
    {
      double num1 = 7.5f;
      double num2 = 8.0f;
      double num3 = 4.0f;
      double num4 = 5.5f;
      System.out.println("If floats num1 = 7.5, num2 = 8, num3 = 4 and num4 = 5.5 then");
      System.out.printf("num3 / num2 = %f%n", num3 / num2);
      System.out.printf("num2 / num3 = %f%n", num2 / num3);
      System.out.printf("num1 / num4 = %f%n", num1 / num4);
      System.out.printf("num2 * num4 = %f%n%n", num2 * num4);
    }

    // Question 5
    {
      int i = 7;
      int j = -9;
      double x = 72.3f;
      double y = 0.34f;

      System.out.println("If ints i = 7 and j = -9 and floats x = 72.3 and y = 0.34 then");

      // A
      System.out.printf("x rounded up = %.0f and x rounded down = %.0f%n", Math.ceil(x), Math.floor(x));
      System.out.printf("y rounded up = %.0f and y rounded down = %.0f%n%n", Math.ceil(y), Math.floor(y));

      // B
      System.out.printf("Out of the two numbers %f and %f, %f is the larger number%n", x, y, Math.max(x, y));
      System.out.printf("Out of the two numbers %d and %d, %d is the larger number%n", i, j, Math.max(i, j));
      System.out.printf("Out of the two numbers %d and %f, %f is the smaller number%n", i, x, Math.min(i, x));
      System.out.printf("Out of the two numbers %d and %f, %f is the smaller number%n%n", j, y, Math.min(j, y));

      // C
      System.out.printf("Pi, the circle constant is approximately = %f%n%n", Math.PI);

      // D
      int degree = 45;
      // I had to convert the 45 degrees to radians because the cos and sin function
      // radians = degrees * π / 180
      double radians = degree * Math.PI / 180;
      System.out.printf("sin(%d) = %f and cos(%d) = %f%n%n", degree, Math.sin(radians), degree, Math.cos(radians));

      // E
      System.out.printf("2^5 = %.0f and 5^2 = %.0f%n%n", Math.pow(2.0f, 5.0f), Math.pow(5.0f, 2.0f));

      // F
      System.out.printf("√10 ≈ %f%n%n", Math.sqrt(10));

      // G
      // Math.random produces a random number from 0..1. Mutiplying it by a constant
      // can stretch this range.
      System.out.printf("A random number between 0 and 10 is %f%n", Math.random() * 10);
      System.out.printf("A random number between 0 and 100 is %f%n", Math.random() * 100);
      System.out.printf("A random number between 0 and -1000 is %f%n", Math.random() * -1000);
      // Here we genarate a random number from 0..1000
      // and then shift it down 500 to get -500..500
      System.out.printf("A random number between -500 and 500 is %f%n%n", Math.random() * 1000 - 500);
    }
  }
}