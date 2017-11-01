import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Product {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Float> list = new ArrayList<Float>();
    
    // get string input and split to float array
    String in = input.nextLine();
    for (String i : in.split(" ")) {
      list.add(Float.parseFloat(i));
    }
    // compute the length of the subarray resulting in the max product
    System.out.println(findMax(list));
  }
  
  public static int findMax(ArrayList<Float> array) {
    int size = array.size();
    
    // used to update lengthArr at the end of each iteration
    int length = 1;
    
    // max products for respective subarrays
    float[] max = new float[size];
    // lengths of subarrays corresponding to max products
    int[] lengthArr = new int[size];
    
    // holds index of max element in the max array
    // NOTE: this corresponds to the length of the subarray in lengthArr
    int index = 0;

    // initialise max to first element
    max[0] = array.get(0);
    
    // loop through array
    for (int i = 1; i < size; i++) {
      
      // if you hit a zero, update index, reset length
      if (array.get(i) == 0) {
        
        if (max[i-1] > max[index]) {
          index = i-1;
        }
        max[i] = 0;
        length = 1;    
      }
      else {
        // set max to greater of current element and current product
        if (array.get(i) > array.get(i)*max[i-1]) {
          // update index of max and reset length
          if (max[i-1] > max[index]) {
            index = i-1;
          }
          length = 1;
          max[i] = array.get(i);
        }
        else {
          // continue product and increase length of subarray
          max[i] = array.get(i)*max[i-1];
          length++;
        }
      }
      
      // check for greater current max and update index of max
      if (max[i] > max[index]) {
        index = i;
      }
      
      // add length of current subarray to the lengthArr
      lengthArr[i] = length;
    }
    
    // return the length of the array at the max index
    return lengthArr[index];
  }
}
