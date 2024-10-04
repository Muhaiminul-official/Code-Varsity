import java.util.*;
public class A_CelciusToFahrenheit {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the temperature in celsius: ");
      float celsius = sc.nextFloat();
      
      float fahrenheit = (celsius * 9 / 5) + 32;
      System.out.println("The temperature in fahenheit is: " + fahrenheit+"°F");
      
    }
  }
  
}
