import java.util.*;
public class FindMaxNum {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      
      System.out.println("Enter the first number: ");
      int num1 = sc.nextInt();
      System.out.println("Enter the second number: ");
      int num2 = sc.nextInt();
      // int result = Integer.compare(num1, num2);
      int result = num1 > num2 ? 1 : num1 < num2 ? -1 : 0;
      switch (result) {
        case 1 -> System.out.println(num1 + " is greater than " + num2);
        case -1 -> System.out.println(num2 + " is greater than " + num1);
        case 0 -> System.out.println(num1 + " is equal to " + num2);
        default -> System.out.println("Invalid input");
      }
    }
  }
}
