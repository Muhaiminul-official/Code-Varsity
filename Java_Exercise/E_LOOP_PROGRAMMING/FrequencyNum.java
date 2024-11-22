import java.util.Scanner;

public class FrequencyNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int[] Freq = new int[10];

    while (n != 0) {
      int rem =(int) n % 10;
      Freq[rem]++;
      n /= 10;
    }
    for (int i = 0; i < Freq.length; i++) {
      if (Freq[i] != 0) {
        System.out.println(i + " Occurs " + Freq[i] + " times");
      }
    }
    System.out.println();
  }
}
