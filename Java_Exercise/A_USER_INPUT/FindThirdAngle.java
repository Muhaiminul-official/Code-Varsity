import java.util.Scanner;

public class FindThirdAngle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the first angle: ");
      float angle1 = sc.nextFloat();
      System.out.println("Enter the second angle: ");
      float angle2 = sc.nextFloat();
      float angle3 = 180 - (angle1 + angle2);
      System.out.printf("The third angle is: %.2f%n", angle3);
    }
  }
  
}
