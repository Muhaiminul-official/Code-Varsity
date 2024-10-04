import java.util.*;

public class CheckVowel {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a character: ");
      char ch = sc.next().charAt(0);
      switch (ch) {
        case 'a', 'e', 'i', 'o', 'u':
          System.out.println(ch + " is a vowel");
          break;
        case 'A', 'E', 'I', 'O', 'U':
          System.out.println(ch + " is a vowel");
          break;
        default:
          System.out.println(ch + " is a consonant");
          break;
      }
    }
  }
}