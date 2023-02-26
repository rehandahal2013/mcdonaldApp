import java.util.Scanner;

public class McDonaldOrder {

    int getFoodQuantity() {
        Scanner keyboard = new Scanner(System.in);
        int foodQuantity = 0;

        while (true) {
            try {

                foodQuantity = Integer.parseInt(keyboard.nextLine());

            } catch (Exception e) {
                System.out.println("Enter a positive number.");
                break;
            }
        }

        keyboard.close();

        return foodQuantity;
    }

    public static void main(String[] args) {
        McDonaldOrder obj = new McDonaldOrder();

        // variables to hold price of McDonald's items
        double McChicken = 2;
        double fries = 1;
        double Coke = 2;

        System.out.println("Welcome to McDonald's.");

        System.out.println("How many McChicken(s) would you like?");
        int quantityMc = obj.getFoodQuantity();
        System.out.println(quantityMc);

        System.out.println("How many fries would you like?");
        int quantityFries = obj.getFoodQuantity();
        System.out.println(quantityFries);

        System.out.println("How many soda(s) would you like?");
        int quantityCoke = obj.getFoodQuantity();
        System.out.println(quantityCoke);

        double Cost = (McChicken * quantityMc) + (fries * quantityFries) + (Coke * quantityCoke);
        System.out.println("Your total is $" + Cost);
    }
}