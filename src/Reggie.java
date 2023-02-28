import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(sc, "Enter SSN", "\\d{3}-\\d{2}-\\d{4}");
        String mNum = SafeInput.getRegExString(sc, "Enter M#", "[mM]\\d{8}");
        String menu = SafeInput.getRegExString(sc, "Enter your menu option Open, Save, View, or Quit(O,S,V,Q)", "^[OoSsVvQq]");

        System.out.println("Your SSN is: " + SSN + "\nYour M# is: " + mNum + "\nYour menu option is: " + menu);

    }
}
