import java.util.Scanner;
public class Prac1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int max = in.nextInt();
    int most = findMax(max, max/2);
    System.out.println(most);
  }
  public static int findTotal(int number) {
    int num = 0;
    for (int i = 1; i < number; i++) {
      num += i*(number/i);
    }
    return num;
  }
  public static int findMax(int max, int number) {
    int num = findTotal(number);
    if (num > max && findTotal(number-1) < max) {
      return number-1;
    }
    else if (num < max && findTotal(number+1) > max) {
      return number;
    }
    else if (num > max) {
      return findMax(max, number-number/2);
    }
    else {
      return findMax(max, number+number/2);
    }
  }
}
