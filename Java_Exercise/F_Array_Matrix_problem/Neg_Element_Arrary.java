import java.util.*;

public class Neg_Element_Arrary {

  public static void inputArray(int[] arr, int idx, Scanner sc) {
    if (idx < arr.length) {
      arr[idx] = sc.nextInt();
      inputArray(arr, idx + 1, sc);
    }
  }

  public static void printArray(int[] arr, int idx) {
    if (idx < arr.length) {
      System.out.println(arr[idx]);
      printArray(arr, idx + 1);
    }
  }

  public static void negElemPrint(int[] arr, int idx) {
    if (idx < arr.length) {

      if (arr[idx] < 0) {
        System.out.println(arr[idx]);
      }

      negElemPrint(arr, idx + 1);
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element of the array: ");
    inputArray(arr, 0, sc);
    System.out.println("The array element are: ");
    printArray(arr, 0);
    System.out.println("The negative element of the array are : ");
    negElemPrint(arr, 0);

  }

}
