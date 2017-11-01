import java.util.Scanner;
import java.util.ArrayList;
public class ProductTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();
    String in = input.nextLine();
    for (String i : in.split(" ")) {
      list.add(Double.parseDouble(i));
    }
    System.out.println(findMax(list));
  }
  

  static double Max(double a, double b, double c)
    {
        double d = (a > b) ? a : b;
        return (d > c) ? d : c;
    }

  static double Min(double a, double b, double c)
    {
        double d = (a > b) ? b : a;
        return (d > c) ? c : d;
    }
  public static int findMax(ArrayList<Double> array) {
    int n = array.size();
    double[] max = new double[n];
    double[] min = new double[n];
    // double minEnd = 1;
    double start = 0;
    double end = 0;
    double maxProd = array.get(0);
    max[0] = array.get(0);
    min[0] = array.get(0);
    for (int i = 1; i < n; i++) {
      max[i] = Max(array.get(i), array.get(i)*max[i-1], array.get(i)*min[i-1]);
      min[i] = Min(array.get(i), array.get(i)*max[i-1], array.get(i)*min[i-1]);

      if (max[i] > maxProd) {
        maxProd = max[i];
        end = i;
      }
    }

    double m = maxProd;
    while((m - 0.0) < 0.00001) {
      start = end;
      m = m/(array.get((int)start));
    }
    return (int)(end-start);
  }
}
