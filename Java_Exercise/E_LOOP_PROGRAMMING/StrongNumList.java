import java.util.Scanner;

public class StrongNumList {
  public static int fact(int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return 1;
    return n * fact(n - 1);
  }

  public static boolean isStrong(int num) {
    int sum = 0;
    int temp = num;
    while (num != 0) {
      int rem = num % 10;
      sum += fact(rem);
      num /= 10;
    }
    return sum == temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the upper limit: ");
    int n = sc.nextInt();
    System.out.println("Perfect number from 0 to " + n + " is: ");
    for (int i = 1; i <= n; i++) {
      if (isStrong(i)) {
        System.out.println(i);
      }
    }
    sc.close();
  }
}