import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0;
        double price;
        boolean rep;
        do{
            price = SafeInput.getRangedDouble(sc, "Enter the price of your item", 0.50,10.00);
            totalPrice += price;
            rep = SafeInput.getYNConfirm(sc,"Do you have more items?");
        }while(rep);

        System.out.println("Your total today is: " + totalPrice);
    }
}
