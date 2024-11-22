import java.util.Scanner;
// Series : 1+(1+2)+(1+2+3)+(1+2+3+4)+..........
public class SeriesNum {
  public static int NumSeriesSum(int limit) {
    int sum = 0;
    for (int i = 1; i <= limit; i++) {
      for (int j = 1; j <= i; j++) {

        System.out.print(j + "+");
        sum += j;
      }
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the max number: ");
    int maxNum = sc.nextInt();
    int result = NumSeriesSum(maxNum);
    System.out.println();
    System.out.println("The sum of series: " + result);
  }
}
