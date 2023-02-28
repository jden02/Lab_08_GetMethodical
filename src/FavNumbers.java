import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0.0;
        favInt = SafeInput.getInt(sc, "Enter your favourite int");
        favDouble = SafeInput.getDouble(sc, "Enter your favourite double");

        System.out.println("Your fav int is: " + favInt + "\nYour fav double is: " + favDouble);
    }
}
