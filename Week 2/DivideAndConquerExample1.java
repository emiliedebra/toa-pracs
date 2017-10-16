/*
* Close Pracs 2014 Week 2 Question 1
*/
import java.util.Scanner;

public class DivideAndConquerExample1 {
  public static void main(String[] args) {
    // initialise variables
    Scanner in = new Scanner(System.in);
    int max = in.nextInt();
    // recursively find max number of gems boughts
    int most = findMax(max, max/2);
    // print out answer
    System.out.println(most);
  }

  /*
  * Method to find total cost given a number of gems
  * applies algorithm stated in question
  */
  public static int findTotal(int number) {
    int num = 0;
    for (int i = 1; i < number; i++) {
      num += i*(number/i);
    }
    return num;
  }

  /*
  * Recursive function to find max number of gems that can be bought with given money
  * and cost algorithm
  */
  public static int findMax(int max, int number) {
    int num = findTotal(number);
    // base case if prev is less and curr is more
    if (num > max && findTotal(number-1) < max) {
      return number-1;
    }
    // base case if curr is less and prev is more
    else if (num < max && findTotal(number+1) > max) {
      return number;
    }
    // decrease number of gems
    else if (num > max) {
      return findMax(max, number-number/2);
    }
    // increase number of gems
    else {
      return findMax(max, number+number/2);
    }
  }
}
