import java.util.Scanner;

/**
 * Tells the user the amount of logs fit in truck depending on size.
 *
 * @author Jessah
 * @version 1.0 @2024-02-23
 */

public final class Logging {

  /** Private constructor to prevent instantiation of this utility class. */
  private Logging() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */
  public static void main(final String[] args) {

    // Declare constants for 0.25,0.5,1.
    final double LOG_ONE = 0.25;
    final double LOG_TWO = 0.5;
    final double LOG_THREE = 1;

    try {

      // Get user input.
      System.out.print("Enter log length (0.25, 0.5, 1): ");
      final Scanner input = new Scanner(System.in);
      final String userNumString = input.nextLine();

      // Convert string to double.
      final double userNum = Double.parseDouble(userNumString);

      // If user enters 0.25.
      if (userNum == 0.25) {
        final double loggingOneMul = LOG_ONE * 20;
        final double loggingOneDiv = 1100 / loggingOneMul;
        System.out.print("The amount of 0.25m logs that can fit into the");
        System.out.print(" truck are " + loggingOneDiv + " logs.");
        System.out.println();
      } else if (userNum == 0.5) {
        // If user enters 0.5.
        final double loggingTwoMul = LOG_TWO * 20;
        final double loggingTwoDiv = 1100 / loggingTwoMul;
        System.out.print("The amount of 0.5m logs that can fit into the");
        System.out.print(" truck are " + loggingTwoDiv + " logs.");
        System.out.println();

      } else if (userNum == 1) {
        // If user enters 1.
        final double loggingThreeMul = LOG_THREE * 20;
        final double loggingThreeDiv = 1100 / loggingThreeMul;
        System.out.print("The amount of 1m logs that can fit into the");
        System.out.print(" truck are " + loggingThreeDiv + " logs.");
        System.out.println();
      } else {
        // If user enters any other number.
        System.out.print(userNum + " is an invalid length.");
        System.out.println();
      }
      input.close();
    } catch (NumberFormatException error) {
      // For any string input.
      System.out.println("Error" + error.getMessage());
      System.out.println();
    }
  }
}
