

import java.util.*;
import java.lang.Math;
public class A_AreaRactangle {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the length of rectangle: ");
      int l = sc.nextInt();
      System.out.println("Enter the breadth of rectangle: ");
      int b = sc.nextInt();
      int area = (l * b);
      double sql = Math.pow(l, 5);
      System.out.print(sql);
      System.out.println("Area of the rectangle is: "+area);
    }
  }
}
