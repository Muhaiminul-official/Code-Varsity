import java.util.Scanner;

public class DaysInMonth {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter month number (1-12): ");
    int month = scanner.nextInt();

    System.out.print("Enter the year: ");
    int year = scanner.nextInt();

    int days = 0;

    if(month == 1|| month == 3 || month == 5 || month == 7 || month == 8 || month== 10 || month == 12) {

    days = 31;
    } else if(month == 4 || month == 6 || month == 9 || month == 11) {
    days = 30;
    } else if(month == 2) {
    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
    days = 29;
    } else {
    days = 28;
    }
    }

    // switch(month){
    // case 1, 3, 5, 7, 8, 10, 12: days = 31;
    // case 4, 6, 9, 11: days = 30;
    // case 2: if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
    // days = 29;
    // } else {
    // days = 28;
    // }
    // }
    
    
    
    // switch (month) {
    //   case 1, 3, 5, 7, 8, 10, 12 -> days = 31;

    //   case 4, 6, 9, 11 -> days = 30;
    //   case 2 -> {
    //     days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
    //   }
    // }

    System.out.println("Number of days in month " + month + " is: " + days);

    scanner.close();
  }
}
