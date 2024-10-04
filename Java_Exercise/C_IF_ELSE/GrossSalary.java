import java.util.*;
public class GrossSalary {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.println("Enter the basic salary: ");
      double bs = sc.nextDouble();
      double HRA = 0;
      double DA = 0;
      double grossSalary = 0;
      if (bs >= 20000) {
        HRA = bs * 0.25;
        DA = bs * 0.90;
        grossSalary = bs + HRA + DA;
        System.out.println("Your Gross Salary is: " + grossSalary);
      }else if (bs >= 10000) {
        HRA = bs * 0.20;
        DA = bs * 0.80;
        grossSalary = bs + HRA + DA;
        System.out.println("Your Gross Salary is: " + grossSalary);
      } else {
        System.out.println("Minimum salary should be 10000");
      }
      

    }

  }
  
}
