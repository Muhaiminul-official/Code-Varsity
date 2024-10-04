import java.util.*;
public class AllrootsQuaEqn {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the value of a: ");
      float a = sc.nextFloat();
      System.out.println("Enter the value of b: ");
      float b = sc.nextFloat();
      System.out.println("Enter the value of c: ");
      float c = sc.nextFloat();
      float d = b * b - 4 * a * c;
      float sqOFd = (float) Math.sqrt(Math.abs(d));
      System.out.println("Your Eqn is "+a+"x^2+"+b+"x+"+c);
      if (d == 0) {
        System.out.println("Roots are real and same: ");
        float r = (-b) / (2 * a);
        System.out.println( "Root is: "+r);
      } else if (d > 0) {
        System.out.println("Roots are real and different: ");
        float r1 = (-b + sqOFd)/(2*a);
        float r2 = (-b - sqOFd)/(2*a);
         System.out.println("Root 1: "+r1);
        System.out.println("Root 2: "+r2);
      } else {
        System.out.println("Roots are Complex: ");
        float realPart = (-b) / (2 * a);
        float imgPart = sqOFd / (2 * a);
        System.out.println("Root 1: ("+realPart+"+"+imgPart+"i)");
        System.out.println("Root 1: ("+realPart+"-"+imgPart+"i)");
      }
      }
    }
  }
