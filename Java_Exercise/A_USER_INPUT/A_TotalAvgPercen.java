import java.util.*;
public class A_TotalAvgPercen {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      float total=0, avg, percen;
      System.out.println("Enter the number of each(Five) subjects: ");
      float[] marks = new float[5];
      for (int i = 0; i < 5; i++) {
        System.out.print("Subject " + (i + 1) + ": ");
        marks[i] = sc.nextInt();
        total += marks[i];
      }
      System.out.println("Five subjects marks are: " + Arrays.toString(marks));
      System.out.println(marks.length);
      System.out.println("Total marks:" + total);
      avg = total / 5;
      System.out.println("Average marks:" + avg);
      percen = (total / 500) * 100;
      System.out.println("Percentage:" + percen+"%");
    }
  }
  
}
