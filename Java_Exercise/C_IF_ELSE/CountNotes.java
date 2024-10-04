
import java.util.*; 
public class CountNotes {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.println("Enter the amount: ");
      int amount = sc.nextInt();
      int[] notes = { 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
      System.out.println("Number of notes are: ");

    
      if (amount >= notes[0]) {
        System.out.println(amount / notes[0] + " notes of 1000");
        amount = amount % notes[0];
      }

      if (amount >= notes[1]) {
        System.out.println(amount / notes[1] + " notes of 500");
        amount = amount % notes[1];
      } 
      if (amount >= notes[2]) {  
        System.out.println(amount / notes[2] + " notes of 200");      
        amount = amount % notes[2];
      }
      if (amount >= notes[3]) {
        System.out.println(amount / notes[3] + " notes of 100");
        amount = amount % notes[3];
      }
      if (amount >= notes[4]) {
        System.out.println(amount / notes[4] + " notes of 50");
        amount = amount % notes[4];
      }
      if (amount >= notes[5]) {
        System.out.println(amount / notes[5] + " notes of 20");
        amount = amount % notes[5];
      }
      if (amount >= notes[6]) {
        System.out.println(amount / notes[6] + " notes of 10");
        amount = amount % notes[6];
      }
      if (amount >= notes[7]) {
        System.out.println(amount / notes[7] + " notes of 5");
        amount = amount % notes[7];
      }
      if (amount >= notes[8]) {
        System.out.println(amount / notes[8] + " notes of 2");
        amount = amount % notes[8];
      }
      if (amount >= notes[9]) {
        System.out.println(amount / notes[9] + " notes of 1");
        amount = amount % notes[9];  
      } 
      





      // for (int i = 0; i < notes.length; i++) {
      //   if (amount >= notes[i]) {
      //     System.out.println(notes[i] + ": " + amount / notes[i]);
      //     amount = amount % notes[i];
      //   }
      // }

    }
  }
}
