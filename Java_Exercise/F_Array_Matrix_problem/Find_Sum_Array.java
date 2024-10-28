import java.util.*;
public class Find_Sum_Array {
  public static int sumArr(int[] arr, int idx) {
    if (idx < arr.length) {

      return arr[idx] + sumArr(arr, idx + 1);
    }
    return 0;
  }

  public static void inputArray(int[] arr, int idx, Scanner sc) {
    if (idx < arr.length) {
      arr[idx] = sc.nextInt();
      inputArray(arr, idx + 1, sc);
    }
    
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size: ");
    int n = sc.nextInt();
    int[] arr = new int[n]; 
    System.out.println("Enter the element of the array: ");
    inputArray(arr, 0, sc);
    System.out.println("The sum of the array is : ");
    int result = sumArr(arr, 0);
    System.out.println(result);
  }
}
