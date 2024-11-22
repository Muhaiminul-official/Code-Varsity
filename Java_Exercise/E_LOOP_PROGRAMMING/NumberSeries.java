public class NumberSeries {
  // 7+20+33+46...........
  public static void main(String[] args) {

    int firstTerm = 7;
    int commonDifference = 13;
    int n = 100;
    int sum = 0;
    int Term = firstTerm;
    for (int i = 0; i < n; i++) {
      
      sum += Term;
      Term += commonDifference;
     
    }
    System.out.println();
    System.out.println("The sum of the series up to " + n + " terms is: " + sum);
  }
}
