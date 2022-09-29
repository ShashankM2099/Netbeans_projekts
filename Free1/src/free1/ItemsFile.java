/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package free1;

/**
 *
 * @author sudha
 */
public class ItemsFile {

    private String itemName;
    private int itemPrice;
    private String itemColor;
    private int itemNum;
    private double itemDis = 0.15;
    private double lgDis = 0.17;
    private double oneDis = 0.30;
    
    public double getLgDis() {
        return lgDis;
    }

    public void setLgDis(double lgDis) {
        this.lgDis = lgDis;
    }

    public double getOneDis() {
        return oneDis;
    }

    public void setOneDis(double oneDis) {
        this.oneDis = oneDis;
    }

    public ItemsFile() {
    }

    public void discountPrice() {
        double finalCost=0.0;
        System.out.println("## itemName "+itemName);
        if (itemName.equals("OnePlus")) {
            finalCost = (getItemPrice() - (getItemPrice() * oneDis));
            System.out.println("Your Receipt: ");
            System.out.println("Your amount paid is: "+ finalCost +" $$.");
            System.out.println(" We gave your a sweet discount of: "+ (oneDis*100)+" %");
        }
        if (itemName.equals("iPhone")) {
            
            finalCost = (getItemPrice() - (getItemPrice() * itemDis));
            System.out.println("Your Receipt: ");
            System.out.println("Your amount paid is: "+ finalCost +" $$.");
            System.out.println(" We gave your a sweet discount of: "+ (itemDis*100)+" %");
        }
        if (itemName.equals("Samsung")) {
            System.out.println("Samsung Price" +getItemPrice());
            finalCost = (getItemPrice() - (getItemPrice() * lgDis));
            System.out.println("Your Receipt: ");
            System.out.println("Your amount paid is: "+ finalCost +" $$.");
            System.out.println(" We gave your a sweet discount of: "+ (lgDis*100)+" %");
        }
        
        System.out.println(" Your item Name: "+ getItemName());
        System.out.println(" Item Colour: "+ getItemColor());
        System.out.println(" Item Price: " + getItemPrice()+" $"+ " . \nItem number: " + getItemNum());
        

    }

    public double getItemDis() {
        return itemDis;
    }

    public void setItemDis(double itemDis) {
        this.itemDis = itemDis;
    }

    public String getItemName() {

        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public int getItemNum() {
        return itemNum;
    }

    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }

}
