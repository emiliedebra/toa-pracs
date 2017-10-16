import java.util.Scanner;

class Prac4 {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the text: ");
    String text = input.nextLine();
    System.out.println("Enter the string to match: ");
    String string = input.nextLine();
    for (int i = 0; i < text.length(); i++) {
      for (int j = 0; j < string.length(); j++) {
        if (string.charAt(j)==text.charAt(i+j)) {
          if (j == string.length()-1) {
            System.out.println("The string matches at position " + i);
            System.exit(0);
          }
        } else {
          break;
        }
      }
    }
    System.out.println("There is no matching text.");
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
