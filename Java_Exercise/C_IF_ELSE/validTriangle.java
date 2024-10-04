import java.util.Scanner;
public class validTriangle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the side A of the triangle: ");
      int a = sc.nextInt();
      System.out.println("Enter the side B of the triangle: "); 
      int b = sc.nextInt();
      System.out.println("Enter the side C of the triangle: ");
      int c = sc.nextInt();
      if ((a + b > c) && (a + c > b) && (b + c > a)) {
        System.out.println("The triangle is valid.");
      } else {
        System.out.println("The triangle is not valid.");
      }
    }
  }
  
}
