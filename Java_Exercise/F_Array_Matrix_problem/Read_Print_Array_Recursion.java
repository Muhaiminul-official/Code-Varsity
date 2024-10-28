import java.util.*;

public class Read_Print_Array_Recursion {

  public static void inputArray(int[] arr, int idx,Scanner sc) {
    if (idx < arr.length) {
      arr[idx] = sc.nextInt();
      inputArray(arr, idx + 1,sc);
    }
    
  }
  public static void printArray(int[] arr, int idx) {
    if (idx < arr.length) {
      System.out.println(arr[idx]);
      printArray(arr, idx + 1);
    }
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int sz = sc.nextInt();
    int[] arr = new int[sz];
    System.out.println("Enter the element of array: ");
    inputArray(arr, 0, sc);
    System.out.println("The element of the array: ");
    printArray(arr, 0);
  }


}