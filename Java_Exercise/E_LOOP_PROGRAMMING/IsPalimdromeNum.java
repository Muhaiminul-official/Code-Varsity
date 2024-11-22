import java.util.Scanner;

public class IsPalimdromeNum {
  public static boolean isPalimdrome(int num) {
    int rev = 0;
    int temp = num;
    while (num > 0) {
      int rem = num % 10;
      rev = rev * 10 + rem;
      num /= 10;
    }
    return temp == rev;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    if (isPalimdrome(n)) {
      System.out.println(n + " is a Palimdrome Number. ");
    } else {
      System.out.println(n + " is not a Palimdrome Number. ");
    }
    sc.close();
  }
}
