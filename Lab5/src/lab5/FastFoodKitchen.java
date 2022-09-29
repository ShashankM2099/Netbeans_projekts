/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

/**
 *
 * @author sudha
 */
public class FastFoodKitchen {

    public FastFoodKitchen() {
        orderList.add(new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum()));
        incrementNextOrderNum();
        orderList.add(new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum()));
        incrementNextOrderNum();
    }

    private ArrayList<BurgerOrder> orderList = new ArrayList<>();

    private static int nextOrderNum;

    /**
     * Get the value of nextOrderNum
     *
     * @return the value of nextOrderNum
     */
    public static int getNextOrderNum() {
        return nextOrderNum;
    }

    private static void incrementNextOrderNum() {
        nextOrderNum++;
    }

    public int addOrder(int ham, int cheese, int veggie, int soda, boolean TOGO) {
        BurgerOrder newOrder = new BurgerOrder(ham, cheese, veggie, soda, TOGO, getNextOrderNum());
        incrementNextOrderNum();
        orderList.add(newOrder);
        return newOrder.getOrderNum();
    }

    public boolean isOrderDone(int orderID) {
        for (int i = 0; i < orderList.size(); i++) {

            if (orderList.get(i).getOrderNum() == orderID) {
                return false;
            }

        }
        return true;
    }

    /* private void orderCallOut(BurgerOrder order) {
        int numCheeseburgers = 0;
        int numHamBurgers = 0;
        int numSodas = 0;
        int numVeggieburgers = 0;
        for (BurgerOrder burgerOrder : orderList) {
            numCheeseburgers = numCheeseburgers + order.getNumCheeseburgers();
            numHamBurgers = numHamBurgers + order.getNumHamBurgers();
            numSodas = numSodas + order.getNumSodas();
            numVeggieburgers = numVeggieburgers + order.getNumVeggieburgers();
        }
        System.out.println("-----Order Call Out -----");
        System.out.println("Cheese Burger @ " + numCheeseburgers);
        System.out.println("HamBurgers @ " + numHamBurgers);
        System.out.println("Sodas @ " + numSodas);
        System.out.println("Veggie Burger@ " + numVeggieburgers);
    } */
    private void orderCallOut(BurgerOrder order) {
        for (BurgerOrder burgerOrder : orderList) {
            if (order.getOrderNum() == burgerOrder.getOrderNum()) {
                System.out.println("-----Order Call Out -----");
                System.out.println("Cheese Burger @ " + order.getNumCheeseburgers());
                System.out.println("HamBurgers @ " + order.getNumHamBurgers());
                System.out.println("Sodas @ " + order.getNumSodas());
                System.out.println("Veggie Burger@ " + order.getNumVeggieburgers());
                return;
            }
        }

    }

    private void completeSpecificOrder(int orderID) {
        for (BurgerOrder order : orderList) {
            if (orderID == order.getOrderNum()) {
                System.out.println("Order is DONE");
                if (order.isOrderTogo()) {
                    orderCallOut(order);
                }
                orderList.remove(order);
            }
        }
    }

    private void completeNextOrder() {
        if (orderList.size() > 0) {
            BurgerOrder order = orderList.get(0);
            orderCallOut(order);
            orderList.remove(order);
        } else {
            System.out.println("No Orders");
        }
    }

    public int getNumOrdersPending() {
        return orderList.size();
    }

    public void simulateKitchenActivity() // we give you this code
    {
        // see if there is anything to do
        if (orderList.size() == 0) {
            return;
        }
        // simulate how orders are completed, usually
        // first-in, first-out, but not always
        int num = (int) (Math.random() * 100);
        if (num < 90) {
            // 90% chance the kitchen completes the order that is at
            // the front of the queue
            completeNextOrder();
        } else {
            // complete some random order
            int size = orderList.size();
            int id = (int) (Math.random() * size);
            completeSpecificOrder(id);
        }
    }

    public boolean cancelOrder(int orderID) {
        for (BurgerOrder order : orderList) {
            if (order.getOrderNum() == orderID) {
                orderList.remove(order);
                System.out.println("Your order has been successfully cancelled");
                return true;

            }

        }
        System.out.println(" Your order has been succesfuly canceled");
        return false;
    }

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }

}
