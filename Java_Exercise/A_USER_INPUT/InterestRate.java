import java.util.*;

public class InterestRate {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the principal amount: ");
      float p = sc.nextFloat();
      System.out.println("Enter the rate of interest: ");
      float r = sc.nextFloat();
      System.out.println("Enter the time period: ");
      float t = sc.nextFloat();
      float si = (p * r * t) / 100;
      float com = (float) (p * (Math.pow(1 + r / 100, t) - 1));
      System.out.println("Simple Interest: " + si);
      System.out.println("Compound Interest: " + com);
    }
  }
}