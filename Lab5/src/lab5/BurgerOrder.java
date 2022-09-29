/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author sudha
 */
public class BurgerOrder {

    public BurgerOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderTogo, int orderNum) {
        this.numCheeseburgers = numCheeseburgers;
        this.numHamBurgers = numHamburgers;
        this.numSodas = numSodas;
        this.numVeggieburgers = numVeggieburgers;
        this.orderTogo = orderTogo;
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "orderNum=" + orderNum + ", orderTogo=" + orderTogo + ", numSodas=" + numSodas + ", numVeggieburgers=" + numVeggieburgers + ", numCheeseburgers=" + numCheeseburgers + ", numHamBurgers=" + numHamBurgers + '}';
    }

    private int orderNum = 2;

    /**
     * Get the value of orderNum
     *
     * @return the value of orderNum
     */
    public int getOrderNum() {
        return orderNum;
    }

    /**
     * Set the value of orderNum
     *
     * @param orderNum new value of orderNum
     */
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    private boolean orderTogo = false;

    /**
     * Get the value of orderTogo
     *
     * @return the value of orderTogo
     */
    public boolean isOrderTogo() {
        return orderTogo;
    }

    /**
     * Set the value of orderTogo
     *
     * @param orderTogo new value of orderTogo
     */
    public void setOrderTogo(boolean orderTogo) {
        this.orderTogo = orderTogo;
    }

    private int numSodas = 0;

    /**
     * Get the value of numSodas
     *
     * @return the value of numSodas
     */
    public int getNumSodas() {
        return numSodas;
    }

    /**
     * Set the value of numSodas
     *
     * @param numSodas new value of numSodas
     */
    public void setNumSodas(int numSodas) {
        this.numSodas = numSodas;
    }

    private int numVeggieburgers = 0;

    /**
     * Get the value of numVeggitburgers
     *
     * @return the value of numVeggitburgers
     */
    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    /**
     * Set the value of numVeggitburgers
     *
     * @param numVeggitburgers new value of numVeggitburgers
     */
    public void setNumVeggieburgers(int numVeggitburgers) {
        this.numVeggieburgers = numVeggieburgers;
    }

    private int numCheeseburgers = 0;

    /**
     * Get the value of numCheeseburgers
     *
     * @return the value of numCheeseburgers
     */
    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    /**
     * Set the value of numCheeseburgers
     *
     * @param numCheeseburgers new value of numCheeseburgers
     */
    public void setNumCheeseburgers(int numCheeseburgers) {

        this.numCheeseburgers = numCheeseburgers;
    }

    private int numHamBurgers = 0;

    /**
     * Get the value of numHamBurgers
     *
     * @return the value of numHamBurgers
     */
    public int getNumHamBurgers() {
        return numHamBurgers;
    }

    /**
     * Set the value of numHamBurgers
     *
     * @param numHamBurgers new value of numHamBurgers
     */
    public void setNumHamBurgers(int numHamBurgers) {
        this.numHamBurgers = numHamBurgers;
    }

}
