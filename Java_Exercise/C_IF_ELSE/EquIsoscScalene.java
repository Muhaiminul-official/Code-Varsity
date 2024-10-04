import java.util.*;
public class EquIsoscScalene {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the side A of the triangle: ");
      int a = sc.nextInt();
      System.out.println("Enter the side B of the triangle: ");
      int b = sc.nextInt();
      System.out.println("Enter the side C of the triangle: ");
      int c = sc.nextInt();
      if ((a + b > c) && (a + c > b) && (b + c > a)) {
        if(a==b && b==c){
          System.out.println("The triangle is equilateral");
        } else if(a==b || b==c || a==c){
          System.out.println("The triangle is isosceles");
        } else {
          System.out.println("The triangle is scalene");
        }
      } else {
        System.out.println("The triangle is not valid");
      }
    }
  }
  
}
