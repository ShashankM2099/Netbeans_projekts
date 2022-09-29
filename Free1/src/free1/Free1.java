/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package free1;

/**
 *
 * @author SHashank Mondrati
 */
import java.util.*;

public class Free1 {

    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ask the user for color,price, and brand
        // if brand =iphone---discount 15%
        // if samsung =Discount 17&
        // if 1+, disctount Discount 30%
        // loop until user enters exit

        try {
            while (true) {
                ItemsFile items = new ItemsFile();
                System.out.println(" Enter the product number:");
                int prodNum = sc.nextInt();
                items.setItemNum(prodNum); // setting the productNum into settting method

                System.out.println(" Enter item Color: ");
                String prodCol = sc.next();
                items.setItemColor(prodCol); // settin ght item color in the setting col method.
                System.out.println(" Enter item's price: ");
                int prodPrice = sc.nextInt();
                items.setItemPrice(prodPrice); // setting the item$ in the setting $ method.
                System.out.println(" Enter item Name or Brand: ");
                String prodBrand = sc.next();
                items.setItemName(prodBrand); // settin the item name in the setting name method.
                items.discountPrice();

                System.out.println("Enter 1 to quit"); // if user enters 1 loop breaks.
                int quit = sc.nextInt();
                if (quit == 1) {
                    break;

                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid answer");

        }
    }

    public static void displayMenu() {
        System.out.println(" Enter the product number");
        String prodNum = sc.next();
        System.out.println(" Enter item Colors");
        String prodCol = sc.next();
        System.out.println(" Enter item's price: ");
        int prodPrice = sc.nextInt();
        System.out.println(" Enter item Name or Brand: ");
        String prodBrand = sc.next();

    }

}
