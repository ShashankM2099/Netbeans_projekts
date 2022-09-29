/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashregister;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/22/2020]
 */
public class Item { // class name

    private String name;

    private double cost; // private variables

    private int itemNumber;

    /**
     *
     * @param name item name
     * @param cost item cost USING THIS
     * @param itemNumber item orders in a series
     */
    public Item(String name, double cost, int itemNumber) {
        this.name = name;
        this.cost = cost;
        this.itemNumber = itemNumber;
    }

    /**
     *
     * @return name of the items
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return cost of items
     */
    public double getCost() {
        return cost;
    }

    /**
     *
     * @param name setting name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param cost..setting cost
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     *
     * @return item number
     */
    public int getItemNumber() {
        return itemNumber;
    }

    /**
     *
     * @param itemNumber setting in a for loop
     */
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    /**
     *
     * @return to string method order name plus cost ex: Item 1: Apple 0.75
     */
    @Override
    public String toString() {
        return getName() + ": \t " + getCost();
    }

}
