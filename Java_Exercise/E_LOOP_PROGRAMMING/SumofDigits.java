import java.util.Scanner;

public class SumofDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    System.out.println("Sum of Digits: ");
    int sum=0;
    while (n > 0) {
      int rem = n % 10;
      sum += rem;
      n /= 10;
    }
    System.out.println(sum);
    sc.close();
  }
}
