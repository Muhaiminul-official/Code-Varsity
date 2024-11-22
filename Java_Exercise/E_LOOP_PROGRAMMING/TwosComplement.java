import java.util.*;


public class TwosComplement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(("Enter the binary number: "));
    String binNum = sc.nextLine();
    char[] binArr = new char[binNum.length()];
    char[] OnsCom = new char[binNum.length()];
    char[] TwosCom = new char[binNum.length()];

    // OnesComplement Start Here
    for (int i = 0; i < binNum.length(); i++) {
      binArr[i] = binNum.charAt(i);
      OnsCom[i] = (binArr[i] == '0') ? '1' : '0';
    }
    String OnsComp = new String(OnsCom);
    System.out.println("Ones Complement : " + OnsComp);

    // TwosComplement Start Here 
    boolean carry = true;
    for (int i = binArr.length - 1; i >= 0; i--) {
      if (OnsCom[i] == '1' && carry) {
        TwosCom[i] = '0';
      } else if (OnsCom[i] == '0' && carry) {
        TwosCom[i] = '1';
        carry = false;
      } else {
        TwosCom[i] = OnsCom[i];
      }
    }
    String TwosComp = new String(TwosCom);
    System.out.println("Twos Complement : " + TwosComp);

    sc.close();
  }
}