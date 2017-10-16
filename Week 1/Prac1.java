import java.util.Scanner;

class Prac1 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a: ");
    int a = input.nextInt();
    System.out.println("Enter n: ");
    int n = input.nextInt();
    int answer =1;
    for (int i = 0; i < n; i ++) {
      answer *= a;
    }

    System.out.printf("The answer is equal to: %d \n", answer);
  }

}
