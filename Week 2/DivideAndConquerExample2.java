/*
* Close Pracs 2014 Week 2 Question 2
*/
import java.util.Scanner;
import java.util.ArrayList;

public class DivideAndConquerExample2 {
  
  public static void main(String[] args) {
    // initialise variables
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    int numberOfPlanks = in.nextInt();
    int biggest = 0;
    // create array of plank sizes
    for (int i = 0; i < numberOfPlanks; i++) {
      list.add(in.nextInt());
      if (list.get(i) > biggest) {
        biggest = list.get(i);
      }
    }
    // get wanted number of planks
    int wantedPlanks = in.nextInt();
    // start by dividing largest plank in two
    int size = biggest/2;
    // recursively find largest plank size to yield wantedPlanks 
    size = findMax(list, wantedPlanks, size);
    System.out.println(size);
  }

  /*
  * Recursive function to find max size of planks that satisfy total number
  * of planks needed
  */
  public static int findMax(ArrayList<Integer> list, int wantedPlanks, int currSize) {
    int total = 0;
    // calculate total number of possible planks at currSize
    for (int i = 0; i < list.size(); i++) {
      total += list.get(i)/currSize;
    }
    // return size of planks (base case)
    if (total == wantedPlanks) { 
        return currSize;
    }
    // decrease size of planks
    else if (total < wantedPlanks) { 
        return findMax(list, wantedPlanks, currSize + currSize/2);
    }
    // increase size of planks
    else { 
        return findMax(list, wantedPlanks, currSize-currSize/2);
    }
  }
}
