package shoppingcart;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/17/2020] Added itemDescription
 *
 */
public class ItemToPurchase { // class name

    private String itemName;
    private int itemPrice; // private fields
    private String itemDescription;
    private int itemQuantity;

    public ItemToPurchase() { // items to purchase fields
        this.itemName = "none"; 
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) { // constructor
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription; // new variable
        this.itemQuantity = itemQuantity;
    }

    public void setName(String itemName) { // setName
        this.itemName = itemName;
    }

    public String getName() { //getName
        return itemName;
    }

    public void setPrice(int itemPrice) { // setPrice
        this.itemPrice = itemPrice;
    }

    public int getPrice() { // getPrice
        return itemPrice;
    }

    public void setQuantity(int itemQuantity) { // setting Quantity
        this.itemQuantity = itemQuantity;
    }

    public String getDescription() { // getting item description
        return itemDescription;
    }

    public void setDescription(String itemDescription) { // setting item description
        this.itemDescription = itemDescription;
    }

    public void printItemCost() { // printing item cost
        int quantityCost = (getPrice() * getQuantity());

        System.out.println(getName() + " " + getQuantity() + " @ $" + getPrice() + " = $" + quantityCost);
    }

    public void printItemDescription() { // printing item description.
        System.out.println(getName() + ": " + getDescription());
    }

    public int getQuantity() { // getting quantity
        return itemQuantity;
    }
}
