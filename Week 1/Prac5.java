import java.util.Scanner;

class Prac5 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = input.nextInt();
    int[] a = new int[n+1];
    System.out.println("Enter the values of a: ");
    for (int i = 0; i < n+1; i++) {
      a[i] = input.nextInt();
    }
    System.out.println("Enter x: ");
    int x = input.nextInt();
    int answer = poly(a, n, x);

    System.out.printf("The answer is equal to: %d \n", answer);
  }

  public static int poly(int[] a, int n, int x) {
    int ans = 0;
    for (int i = n; i > -1; i--) {
      ans += a[i]*Math.pow(x, i);
    }
    return ans;
  }

}
