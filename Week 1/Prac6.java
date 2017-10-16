import java.util.Scanner;
import java.util.Arrays;

class Prac6 {
  private static int n;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of points: ");
    n = input.nextInt();
    // System.out.println("Enter points: ");
    int[][] array = new int[n][2];
    for (int i = 0; i < n; i++) {
    System.out.printf("Enter point number %d: ", i);
    System.out.println();
      for (int j = 0; j < 2; j++) {
        array[i][j] = input.nextInt();
      }
    }
    int[][] answer = closest(array);
    String answerString = "[";
    for (int i = 0; i < 2; i ++) {
      answerString += Arrays.toString(answer[i]);
      if (i != 1) {
        answerString += ",";
      }
    }
    answerString += "]";
    System.out.println("The answer is equal to: "+ answerString);
  }

  public static int[][] closest(int[][] array) {
    int[] answer1 = array[0];
    int[] answer2 = array[1];
    for (int i = 0; i < n; i++) {
      for (int j = i+1; j < n; j++) {
        double distance = Math.sqrt(Math.pow(array[i][0]-array[j][0], 2)+Math.pow(array[i][1]-array[j][1], 2));
        double distanceCurrent = Math.sqrt(Math.pow(answer1[0]-answer2[0], 2)+Math.pow(answer1[1]-answer2[1], 2));
        if (distance < distanceCurrent) {
          answer1 = array[i];
          answer2 = array[j];
        } 
      }
    }
    int[][] answer = new int[2][2];
    answer[0] = answer1;
    answer[1] = answer2;
    return answer;
  }

}
