import java.util.Scanner;

public class GCD_LCM_TwoNum {
  public static int Find_GCD(int a, int b) {
    while (b != 0) {
      int rem = a % b;
      a = b;
      b = rem;
    }
    return a;
  }

  public static int Find_LCM(int a, int b) {
    return (a * b) / Find_GCD(a, b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int ft = sc.nextInt();
    System.out.println("Enter the Second number: ");
    int sec = sc.nextInt();
    System.out.println("GCD of two numbers: "+Find_GCD(ft, sec));
    System.out.println("LCM of two numbers: "+Find_LCM(ft, sec));
    sc.close();
  }
}
