import java.util.Scanner;

public class PrintFibonacciSeries {

  public static void pirntFibo(int limit) {
    int first = 0, second = 1, fibo;
    if (limit >= 1) {
      System.out.print(first);
    }
    if (limit >= 2) {
      System.out.print(", " + second);
    }
    for (int i = 2; i <= limit; i++) {
      fibo = first + second;
      System.out.print(", " + fibo);
      first = second;
      second = fibo;
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of terms: ");
      int numTr = sc.nextInt();
      System.out.println("The fibonacci series is : ");
      pirntFibo(numTr);
      sc.close();
  }

}
