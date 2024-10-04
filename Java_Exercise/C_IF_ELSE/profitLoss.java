import java.util.*;
public class profitLoss {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the cost price: ");
            int cp = sc.nextInt();
            System.out.println("Enter the selling price: ");
            int sp = sc.nextInt();
            if (cp > sp) {
                System.out.println("Loss of " + (cp - sp) + " Tk");
            } else if (cp < sp) {
                System.out.println("Profit of " + (sp - cp) + " Tk");
            } else {
                System.out.println("No profit, No loss");
            }
        }
    }
}
