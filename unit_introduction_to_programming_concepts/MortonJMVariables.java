/*
 * This program is meant to perfrom several calculations. These calculations include:
 * Calculating area and perimeter, converting celsius to fahrenheit and averaging values
 * 
 * @auther Joshua Morton
 * @version 1.0.0
 * @date Feb 15 2023
 */

public class MortonJMVariables {
  public static void main(String[] args) {

    // Program #1
    // Units in meters
    int length = 70;
    int width = 440;
    // Perimeter of rectangle = 2 * length + 2 * width
    int rectPerimeter = 2 * length + 2 * width;
    // Area of rectangle = length * width
    int rectArea = length * width;

    System.out.printf(
        "The dimensions of the rectangle %d meters by %d meters%nThe perimeter of the rectangle is %d meters and the area is %d meters squared%n%n",
        length, width, rectPerimeter, rectArea);

    // Program #2
    // Units in meters
    int radius = 123;
    // Circumference of circle = 2πr
    double circumference = 2 * Math.PI * radius;
    // Area of circle = πr^2
    double circleArea = Math.PI * radius * radius;
    System.out.printf("The radius of the circle is %d meters%n", radius);
    System.out.printf("The circumference of the circle is %f meters and the area is %f meters squared%n%n",
        circumference, circleArea);

    // Program #3
    double celsius = 43.3;
    // degrees in fahrenheit = (degree in celsius) * 9/5 + 32
    double fahrenheit = celsius * 9 / 5 + 32;
    System.out.printf("%.2f degrees celsius is equal to %.2f degrees fahrenheit%n%n", celsius, fahrenheit);

    // Program #4
    // I used an int to store the marks becuase final marks are rounded.
    int mathMark = 97;
    int techMark = 96;
    int gymMark = 94;
    int scienceMark = 92;
    // We need to cast the types becuase the average may not be an int.
    double averageMark = (double) (mathMark + techMark + gymMark + scienceMark) / 4;

    System.out.printf(
        "In grade 10 math I received a %d, in grade 9 tech I received a %d, in grade 9 gym I received %d, and in grade 9 science I received %d%n",
        mathMark, techMark, gymMark, scienceMark);
    System.out.printf("The average of all these classes is %.2f%n", averageMark);
  }
}
