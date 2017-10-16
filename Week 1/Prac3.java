import java.util.Scanner;
import java.util.Arrays;

class Prac3 {
  private static int n = 1;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n: ");
    n = input.nextInt();
    System.out.println("Enter numbers for array one each followed by an enter: ");
    int[][] arr1 = new int[n][n];
    for (int c = 0 ; c < n ; c++ ) {
         for (int d = 0 ; d < n ; d++ ) {
            arr1[c][d] = input.nextInt();
         }
    }
    System.out.println("Enter numbers for array two each followed by an enter: ");
    int[][] arr2 = new int[n][n];
    for (int c = 0 ; c < n ; c++ ) {
         for (int d = 0 ; d < n ; d++ ) {
            arr2[c][d] = input.nextInt();
         }
    } 
    int[] answer = multiply(arr1, arr2);

    System.out.println("The answer is equal to: " + Arrays.toString(answer));
  }

  public static int[] multiply(int[][] one, int[][] two) {
    int[] answer = new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        answer[i] += one[i][j]*two[j][i];
      }
    }
    return answer;
  }

}
