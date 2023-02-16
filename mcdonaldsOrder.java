import java.util.Scanner;
public class mcdonaldsOrder {
    public static void main(String[] args) {

        // variables to hold price of McDonald's item
        double McChicken = 2;
        double fries = 1;
        double Coke = 2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to McDonald's");
        System.out.println("How many McChicken would you like?");

        int quantityMc = keyboard.nextInt();
        System.out.println("How many fries would you like?");

        int quantityFries = keyboard.nextInt();
        System.out.println("How many drinks (sodas) would you like?");

        int quantityCoke = keyboard.nextInt();
        double totalPrice = (McChicken * quantityMc) + (fries * quantityFries) + (Coke * quantityCoke);
        System.out.println("Thank you for the order. " + "Your total is $" + totalPrice);
        keyboard.close();
    }
}
