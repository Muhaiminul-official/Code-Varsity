import java.util.*;
public class A_NumPower {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number: ");
      float num = sc.nextFloat();
      System.out.println("Enter the power: ");
      float power = sc.nextFloat();
      float result = (float) Math.pow(num, power);
      System.out.println("Result: "+result);
    }
  }
  
}
