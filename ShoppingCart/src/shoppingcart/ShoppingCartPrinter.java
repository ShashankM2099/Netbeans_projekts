package shoppingcart;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/14/2020]
 */
import java.util.Scanner;

public class ShoppingCartPrinter { // class name

    public static void main(String[] args) { // main method
        // TODO code application logic here
        Scanner input = new Scanner(System.in); // scanner input variable
        String item1 = "";
        String item2 = "";
        int price1 = 0; // setting the prices to starting value to 0
        int price2 = 0;
        int quantity1 = 0; // setting the quantity to initial value to 0
        int quantity2 = 0;
        ItemToPurchase itemList1 = new ItemToPurchase(); // class callback
        ItemToPurchase itemList2 = new ItemToPurchase();

        System.out.println(" Item#1");
        System.out.println(" ENter the Item Name:"); // user prompt to enter name, quantity and price for item1
        itemList1.setName(input.nextLine());
        System.out.println("Enter the item price:");
        itemList1.setPrice(input.nextInt());
        System.out.println("Enter the item quantity:");
        itemList1.setQuantity(input.nextInt());
        System.out.println();

        //Item#2
        System.out.println("Item 2");
        itemList2.setName(input.nextLine());
        System.out.println("Enter the item name:");// user prompt to enter name, quantity and price for item2
        itemList2.setName(input.nextLine());
        System.out.println("Enter the item price:");
        itemList2.setPrice(input.nextInt());
        System.out.println("Enter the item quantity:");
        itemList2.setQuantity(input.nextInt());
        System.out.println();

        int quantity = itemList1.getPrice() * itemList1.getQuantity(); // price times quantity
        int secQuantity = itemList2.getPrice() * itemList2.getQuantity(); // price times quantity for item2
        int finalQuantity = quantity + secQuantity;
        System.out.println("<----TOTAL COST---->"); // final cost

        System.out.println(itemList1.getName() + " " + itemList1.getQuantity() + " @ $" + itemList1.getPrice() + " = $" + quantity);

        System.out.println(itemList2.getName() + " " + itemList2.getQuantity() + " @ $" + itemList2.getPrice() + " = $" + secQuantity);

        System.out.println();
        System.out.println("<----Total---->: $ " + finalQuantity);

    }

}
