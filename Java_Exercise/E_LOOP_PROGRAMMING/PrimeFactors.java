
import java.util.Scanner;

public class PrimeFactors {
  public static boolean isprime(int n, int i) {
    if (n <= 1)
      return false;
    if (n % 2 == 0 && n != 2)
      return false;
    if (i > Math.sqrt(n))
      return true;
    if (n % i == 0)
      return false;

    return isprime(n, i + 2);
  }

  public static void printPrimeFactors(int num) {
    System.out.println("The factors of " + num + " are:  ");
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    System.out.println("The prime factors of " + num + " are: ");
    for (int i = 1; i < num; i++) {
      if (num % i == 0) {
        if (isprime(i, 3)) {
          System.out.print(i + " ");
        }

      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number to find prime factors: ");
    int n = sc.nextInt();

    printPrimeFactors(n);
  }
}
