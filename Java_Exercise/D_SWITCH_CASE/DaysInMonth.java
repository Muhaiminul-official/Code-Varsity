import java.util.*;

public class DaysInMonth {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the year: ");
      int yr = sc.nextInt();
      System.out.println("Enter the month: ");
      int mn = sc.nextInt();
      int days;
      switch (mn) {
        // case 1, 3, 5, 7, 8, 10, 12:
        //   days = 31;
        // case 4, 6, 9, 11:
        //   days = 30;
        // case 2:
        //   if(yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0)
        //     days = 29;
        //   else
        //     days = 28;  

        case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
        case 4, 6, 9, 11 -> days = 30;
        case 2 -> {
          days = (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) ? 29 : 28;
        }

        default -> {
          System.out.println("Invalid month");
          return;
        }

      }
      System.out.println("Number of days in month "+mn+" is: " + days);
    }
  }
}
  
    

