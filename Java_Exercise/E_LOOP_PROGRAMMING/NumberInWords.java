import java.util.Scanner;

public class NumberInWords {

    public static void printWord(int num) {
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        if (num == 0) {
            System.out.println("Zero");
            return;
        }
        if (num < 0) {
            System.out.println("Negetive");
            num = -num;
        }
        String result = " ";
        while (num > 0) {
            int lastD = num % 10;
            result = words[lastD] + " " + result;
            num /= 10;
        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(n + " in words : ");
        printWord(n);
        sc.close();
        
    }
}

