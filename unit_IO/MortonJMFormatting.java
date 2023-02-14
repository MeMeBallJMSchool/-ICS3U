import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class MortonJMFormatting {
  public static void main(String[] args) {
    // Generates a random number and says weathor or not it is even.
    Random rand_gen = new Random();
    int rand = rand_gen.nextInt(100000000);
    System.out.printf("%d is even: %b.%n", rand, rand % 2 == 0);
    // Printing int in diffrent country
    System.out.printf(Locale.CANADA, "The number %,d in Canada%n", rand);
    System.out.printf(Locale.ITALY, "The number %,d in Italy%n", rand);

    // Prints out my name is caps, spaced out a bit.
    System.out.printf("My name is %20S%n", "Joshua");

    // Prints out the first letter of my first and last name.
    System.out.printf("My initials are %c%c%n", 'J', 'M');

    // Prints part of a decmial number.
    double decimal = 1.23456789f;
    System.out.printf("The number 1.23456789 cut off to 2 digits is %.2f%n", decimal);

    // Prints the current hour
    Date date = new Date();
    System.out.printf("The current time is %tH o' clock.%n", date);

    // Prints current month
    System.out.printf("The current month is %tB%n", date);

  }
}
