import java.util.Scanner;

class Prac2 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = input.nextInt();
    int answer = factorial(n);

    System.out.printf("The answer is equal to: %d \n", answer);
  }

  public static int factorial(int n) {
    if (n==0) {
      return 0;
    }
    else if(n==1) {
      return 1;
    } else {
      return n*factorial(n-1);
    }
  }

}
