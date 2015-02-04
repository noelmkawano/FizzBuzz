import java.util.Scanner;

/**
 * Created by NOEL on 2/4/2015.
 */
public class FizzBuzz {
  public static void main(String[] args) {
    System.out.print("Enter number");
    Scanner in= new Scanner(System.in);
    if (in.hasNextInt()){
      int value=in.nextInt();
      if(value%15==0){
        System.out.print("FizzBuzz");
        return;
      }
      if(value%3==0){
        System.out.print("Fizz");
        return;
      }
      if(value%5==0) {
        System.out.print("Buzz");
        return;
      }
    }
  }
}
