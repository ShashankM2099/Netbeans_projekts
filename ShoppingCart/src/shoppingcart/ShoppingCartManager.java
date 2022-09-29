package shoppingcart;

import java.util.Scanner;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/17/2020]
 * @Description :Shopping cart Manager java file
 */
public class ShoppingCartManager { // class name

    private static Scanner scnr; // scanner variable cart

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart(); // shopping cart is tray
        scnr = new Scanner(System.in);
        System.out.println("--- Welcome to Mal-Mart---");
        System.out.println(" Please Enter Customer's Name:"); // asking for users name
        shoppingCart.setCustomerName(scnr.nextLine());
        System.out.println(" Please enter today's date: "); // asking user for date
        shoppingCart.setDate(scnr.nextLine());
        System.out.println("");// just a gap filler
        System.out.println(" Customers name: " + shoppingCart.getCustomerName()); // printing usern Name
        // and date
        System.out.println(" Todays date: " + shoppingCart.getDate());

        // adding items to cart
        while (true) { // while loop set to true
            System.out.println("Enter 1 to ADD ITEMS:  \nEnter DONE to exit adding:");

            String choice = scnr.next();
            if (choice.equals("1")) { // if statement if=1 to add

                ItemToPurchase itemToPurchase = new ItemToPurchase();
                System.out.println("\nEnter item name  : ");
                String name = scnr.next().toLowerCase();
                itemToPurchase.setName(name);
                System.out.println("\nEnter the item description  : ");
                String description = scnr.next();
                itemToPurchase.setDescription(description);
                System.out.println("Enter item's price: ");
                Integer price = scnr.nextInt();
                itemToPurchase.setPrice(price);
                System.out.println("Enter item's quantity: ");
                Integer quantity = scnr.nextInt();
                itemToPurchase.setQuantity(quantity);
                shoppingCart.addItem(itemToPurchase);
            }
            if (choice.equals("DONE")) { //if choice equals done loop break
                System.out.println("YOURE DONE ADDING ;)");
                break;
            }
            continue; // continue tag
        }

        while (true) {
            // removing items from cart
            // use shopping cart
            System.out.println(" Removing items:");
            System.out.println(" Enter DONE once items removal is done:");
            System.out.println(" Enter item name");
            String selection = scnr.next();
            if (selection.equalsIgnoreCase("DONE")) {
                break;
            } else {
                shoppingCart.removeItem(selection);
            }

        }

        // changing item quanity
        ItemToPurchase itemToPurchase = new ItemToPurchase();
        System.out.println(" Modifying items");
        System.out.println(" What would you like to modify? : ");
        System.out.println(" 1. Description");
        System.out.println(" 2.Price");
        System.out.println(" 3. Quantity");
        int mod = scnr.nextInt();
        System.out.println(" Enter product name:"); // changing product description
        String itemName = scnr.next();
        if (mod == 1) {
            System.out.println(" Enter product description:"); // changing product description
            String description = scnr.next();
            shoppingCart.modifyItem(itemToPurchase, itemName, description, -1, -1);
        }
        if (mod == 2) {
            System.out.println(" Enter Price ");// changing price tag
            int priceTag = scnr.nextInt();
            shoppingCart.modifyItem(itemToPurchase, itemName, "", priceTag, -1);
            if (mod == 3) {
                System.out.println(" Enter Quantity ");// changing price tag
            }
            int quantity = scnr.nextInt();
            shoppingCart.modifyItem(itemToPurchase, itemName, "", -1, quantity);

        }
        shoppingCart.getCostOfCart();// getting cart cost

        // printing items description.
        shoppingCart.printDescription();

        // printing shopping cart
        shoppingCart.printTotal();

    }

    // lets try a menu for the shopping menu
    private static void printMenu() { // my shopping cart wheels, sounds catchy
        System.out.println("----Welcome to My-Mart");
        System.out.println("MENU\na - Add item to cart");
        System.out.println("b - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("d - Output items' descriptions");
        System.out.println("e - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("\nChoose an option: ");

    }
}
