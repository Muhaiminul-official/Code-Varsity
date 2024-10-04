import java.util.*;
public class B_MaxMinNum {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the three  number: ");
      int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
      int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
      // if a is greater than b
      //   if a is greater than c
      //     max is a
      //   else
      //     max is c
      // else
      //   if b is greater than c
      //     max is b
      //   else
      //     max is c
      int min = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
      // if a is less than b
      //   if a is less than c
      //     min is a
      //   else
      //     min is c
      // else
      //   if b is less than c
      //     min is b
      //   else
      //     min is c
      


      System.out.println("Maximum number is: " + max);
      System.out.println("Minimum number is: " + min);
    }
  }
  
}


