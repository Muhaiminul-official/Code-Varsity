import java.util.Scanner;

public class NumSeries {
  public static int printSeriesNum(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
      int n = 6 * i - 1;
      if (i % 2 == 0) {
        System.out.print("-" + n);
        sum -= n;
      } else {
        System.out.print("+" + n);
        sum += n;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of trems: ");
    int tr = sc.nextInt();
    System.out.println("The series is : ");
    int result = printSeriesNum(tr);
    System.out.println();
    System.out.println("The reuslt is : "+result);
  }
}
