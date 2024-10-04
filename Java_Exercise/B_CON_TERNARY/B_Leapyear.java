import java.util.*;

public class B_Leapyear {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter The Year: ");
      int yr = sc.nextInt();
      String result = (yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0) ? "Leap Year" : "Not Leap Year";
      System.out.println(result);
    }
  }

}
