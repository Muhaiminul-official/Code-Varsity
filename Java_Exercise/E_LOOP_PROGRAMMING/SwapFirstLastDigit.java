import java.util.Scanner;

public class SwapFirstLastDigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int lastDigit = n % 10;
    int firstDigit = n;
    while (firstDigit > 10) {
      firstDigit = firstDigit / 10;
    }

    // System.out.println(firstDigit);
    // System.out.println(lastDigit);

    int t1 = n;
    int count=0;
    while (t1 != 0) {
      t1 = t1 /10;
          count++;
    }
    
    int div = (int) Math.pow(10, count - 1);
    int midPart = (n % div) / 10;
    int newNum = lastDigit * div + midPart * 10 + firstDigit;
    System.out.println("After Swaping : " + newNum);
    sc.close();
  }
}