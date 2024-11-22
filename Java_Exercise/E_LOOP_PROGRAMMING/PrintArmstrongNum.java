import java.util.Scanner;

public class PrintArmstrongNum {

  public static boolean printArmstrong(int num) {
    int sum = 0;
    int temp = num;
    while (num != 0) {
      int lastNum = num % 10;
      sum += (int) Math.pow(lastNum, 3);
      num /= 10;
    }
    return sum == temp;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the upper limit: ");
    int n = sc.nextInt();
    System.out.println("Armstrong number from 0 to " + n + " is: ");
    for (int i = 1; i <= n; i++) {
      if (printArmstrong(i)) {
        System.out.println(i);
      }
    }
  }
}
