/*
 * This program answers some questions about me by printing to stdout. 
 * @auther Joshua Morton
 * @version 1.0.0 
 * @date Feb 9 2023
 */

public class MortonJMFavorites {
  public static void main(String[] args) {
    // Here I am using the \t character to align the questions and answers
    // correctly.
    // \t is the tab character.
    System.out.print("What is your name?\t\t\t\t\tMy name is Joshua Morton.\n");
    System.out.print("What is your favorite colour?\t\t\t\tMy favorite colour is orange.\n");
    System.out.print("What is your favorite TV show?\t\t\t\tMy favorite TV show is Seinfeld.\n");
    System.out.print("What is your favorite movie?\t\t\t\tMy favorite movie is Whiplash.\n");
    System.out.print("What is your favorite computer game?\t\t\tMy favorite computer game is Minecraft.\n");

    // Instead of manually printing out a newline
    // I will begin using println instead.
    System.out.println("What is your favorite food?\t\t\t\tMy favorite food is enchiladas.");
    System.out.println("What is your favorite Disney character or movie?\tMy favorite Disney character is Goofy.");
    System.out.println("Who is your favorite singer/group/musician?\t\tI don't have favorite singer/group/musician.");
    System.out.println("What is your favorite sport?\t\t\t\tMy favorite sport is Soccer.");
    System.out.println("What is your favorite sports team?\t\t\tI do not watch sports.");

    // A backslash is needed to print a ".
    System.out.println("What is your favorite book?\t\t\t\tMy favorite book is \"How You Ruined My Life\" by Jeff Strand.");
    System.out.println("What is your favorite subject?\t\t\t\tMy favorite subject is maths.");
    System.out.println("What city would you like to visit?\t\t\tI would like to visit Halifax.");
    System.out.println("Do you have any siblings? How many?\t\t\tI have two brothers.");
    System.out.println("Why did you take computer programming?\t\t\tI took computer programming becuase I have an intrest in computers.");
  }
}
