/**
 * Solves the FizzBuzz WOD Problem.
 */
public class FizzBuzz {

  /**
   * Computes the FizzBuzz function up to 100.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzzMapper(i));
    }
  }

  /**
   * Find the divisibility of every number by 3, 5, and 15.
   * @param i upper bound.
   * @return the answer.
   */
  public static String fizzBuzzMapper(int i) {
    if (((i % 3) == 0) && ((i % 5) == 0)) {
      return "FizzBuzz";
    }
    else if ((i % 5) == 0) {
      return "Buzz";
    }
    else if ((i % 3) == 0) {
      return "Fizz";
    }
    else {
      return Integer.toString(i);
    }
  }
}