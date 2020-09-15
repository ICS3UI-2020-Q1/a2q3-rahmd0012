import java.util.Scanner;

/**
 * a program to order integers in ascending order
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // find user's first integers
    System.out.println("Please enter an integer");
    int integer1 = input.nextInt();

    //find user's second integer
    System.out.println("Please enter a second integer");
    int integer2 = input.nextInt();

    //check to see which order the integers go in
    if (integer1 > integer2){
      System.out.println("Your numbers in ascending order are " + integer2 + ", " + integer1);
    } else {
      System.out.println("Your numbers in ascending order are " + integer1 + ", " + integer2);
    }
    
  }
}
