import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test the FizzBuzz function.
 */
public class FizzBuzzTest {

  /**
   * Runs the four tests for the FizzBuzz problem.
   * @throws Exception if problem occur.
   */
  @Test
  public void testFizzBuzzMapper() throws Exception {
  assertEquals("Test if buzz is read from 100", "Buzz", FizzBuzz.fizzBuzzMapper(100));
  assertEquals("Test if buzz is read from 99", "Fizz", FizzBuzz.fizzBuzzMapper(99));
  assertEquals("Test if buzz is read from 90", "FizzBuzz", FizzBuzz.fizzBuzzMapper(90));
  assertEquals("Test if buzz is read from 96", "Fizz", FizzBuzz.fizzBuzzMapper(96));
  }
}