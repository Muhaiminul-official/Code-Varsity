import java.util.Scanner;
public class PerfectNumList {

  public static boolean printPerfectNum(int num) {
    int sum = 0;
    int temp = num;
    for (int i = 1; i <num; i++) {
      if (num % i == 0) {
        sum += i;
      }
    }
    return sum == temp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the upper limit: ");
    int n = sc.nextInt();
    System.out.println("Perfect number from 0 to " + n + " is: ");
    for (int i = 1; i <= n; i++) {
      if (printPerfectNum(i)) {
        System.out.println(i);
        
      }
    }
  }
}

