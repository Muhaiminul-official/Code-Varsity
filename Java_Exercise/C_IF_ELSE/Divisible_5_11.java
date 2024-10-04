import java.util.*;
public class Divisible_5_11 {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        
        System.out.println("Enter the number");
        int n = sc.nextInt(); 
        if(n%5==0 && n%11==0){
      System.out.println("Divisible by 5 and 11");
    }
    else{
      System.out.println("Not Divisible by 5 and 11");
      }
  
    }   
  }

}