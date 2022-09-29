/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/17/2020]
 * @Description : Managing the shopping cart
 */
public class ShoppingCart {

    private String customerName;
    private String currentDate;
    private List<ItemToPurchase> cartItems = new ArrayList<>();

    public ShoppingCart() { // constrcutor shopping cart
        this.customerName = "none";
        this.currentDate = "January 1, 2016";
    }

    public ShoppingCart(String customerName, String currentDate) {
        this.customerName = customerName; // this variables to customerName and date.
        this.currentDate = currentDate;

    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) //HAVING TROUBLE PASSING OBJECT THROUGH A PARAMETER
    {
        cartItems.add(item);
    }

    public void removeItem(String itemName) {
        int index = -1;
        for (int i = 0; i < cartItems.size(); ++i) {
            ItemToPurchase item = cartItems.get(i);
            if (itemName.equals(item.getName())) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Item not found in cart.");
        } else {
            cartItems.remove(index);
        }

    }

    public void modifyItem(ItemToPurchase item, String itemName, String description, int price, int quantity) //might need to fix the if m 
    {
        boolean found = false;
        for (int i = 0; i < cartItems.size(); ++i) {
            item = cartItems.get(i);
            if (itemName.equals(item.getName())) {
                ItemToPurchase itemToPurchase = cartItems.get(i);
                found = true;
                if (!itemName.isEmpty()) {
                    cartItems.get(i).setDescription(description);
                } else if (price != -1) {
                    cartItems.get(i).setPrice(20);
                } else if (quantity != -1) {
                    cartItems.get(i).setQuantity(5);
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }

    public int getCostOfCart() { // getting cost of cart
        int costOfCart = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            costOfCart = costOfCart + (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());
        }
        return costOfCart;
    }

    public int getNumItemsInCart() { // getting # of items in cart
        int quantity = 0;
        for (int i = 0; i < cartItems.size(); ++i) {
            quantity += cartItems.get(i).getQuantity();
        }
        return quantity;
    }

    public void printTotal() { // might need to fix this.
        for (int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemCost();
        }
        System.out.println("Total: $" + getCostOfCart());
    }

    public void printDescription() {
        System.out.println("Items Descriptions: ");
        for (int i = 0; i < cartItems.size(); ++i) {
            cartItems.get(i).printItemDescription();
        }

    }

}
