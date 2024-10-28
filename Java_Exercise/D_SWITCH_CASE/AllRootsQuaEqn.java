import java.util.*;
public class AllRootsQuaEqn {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the value of a: ");
      double a = sc.nextDouble();
      System.out.println("Enter the value of b: ");
      double b = sc.nextDouble();
      System.out.println("Enter the value of c: ");
      double c = sc.nextDouble();
      double d = b * b - 4 * a * c;
      double sqOfd = Math.sqrt(Math.abs(d));
      switch ((int)d) {
        case 0:
          System.out.println("The roots are real and equal");
          double root = -b / (2 * a);
          System.out.println("Root is: " + root);
          break;
        case 1:
          System.out.println("The roots are real and distinct");
          double root1 = (-b + sqOfd) / (2 * a);
          double root2 = (-b - sqOfd) / (2 * a);
          System.out.println("Root 1 is: " + root1);
          System.out.println("Root 2 is: " + root2);
          break;
        default:
          System.out.println("The roots are imaginary");
          double realPart = -b / (2 * a);
          double imgPart = sqOfd / (2 * a);
          System.out.println("Root 1 is: " + realPart + "+" + imgPart + "i");
          System.out.println("Root 2 is: " + realPart + "-" + imgPart + "i");
          break;
        }
    }
  }
  
}
