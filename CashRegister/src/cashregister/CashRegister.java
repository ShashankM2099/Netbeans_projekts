package cashregister; // package name

import java.util.*;

/**
 *
 * @author [Shashank Mondrati]
 * @version [10/22/2020]
 */
public class CashRegister { // class name

    static Scanner sc = new Scanner(System.in);

    private static double salesTaxPercentage = 0.07; // sales tax 7%

    private static List<Item> items; // array list called items

    private static List<Payments> payments;// array list called payments for payment

    private static final String CASH = "Cash";

    private static final String DEBIT_CARD = " Debit card"; // final string payment methods

    private static final String CREDIT_CARD = "Credit card";

    private static final String CHECK = "Check";

    /**
     * @param main method
     */
    public static void main(String[] args) { // main method
        // TODO code application logic here
        System.out.println(" Would you like to start a transaction?: ");
        char transactBill = sc.next().charAt(0);
        if (transactBill == 'Y') {
            items = new ArrayList<>();
            addItems();
            double subTotal = calculateTotal();
            double tax = getTax(subTotal);
            double total = subTotal + tax;
            printReceipt(total);
            checkout(subTotal, tax, total);
        } else if (transactBill == 'N') {
            System.out.println(" Thanks for shopping");
        } else {
            System.out.println("Incorrect input, please select Y or N");
        }

    }

    /**
     *
     * @param subTotal is the bill multiplied with the tax
     * @param tax is the sales percentage tax
     * @param total is the bill * tax and added to it
     * @param change is the left over money when user pays some partial amount
     */
    private static void printFinalReceipt(double subTotal, double tax, double total, double change) {
        for (Item item : items) {
            System.out.println(item.toString());
        }
        System.out.println("-----------------------------------");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);

        for (Payments payment : payments) {
            System.out.println(payment.toString());
        }
        System.out.println("Change: " + change);
    }

    /**
     *
     * @param subTotal is the bill multiplied with the tax
     * @param tax is the sales percentage tax
     * @param total is the bill * tax and added to it
     */
    private static void checkout(double subTotal, double tax, double total) { // checkout method
        double change = 0.0;
        payments = new ArrayList<>();
        double modifiedTotal = total;
        while (true) { // while loop
            int selectedPaymentType = paymentsSelection(); // payment method call back
            double amountPaid = payments(selectedPaymentType);
            switch (selectedPaymentType) { // switch case
                case 1: { // case 1 for cash payment
                    Payments payment = new Payments(CASH, amountPaid);
                    payments.add(payment);
                    break;
                }// cash 
                case 2: { // case 2
                    Payments payment = new Payments(CREDIT_CARD, amountPaid);
                    payments.add(payment);
                    break;
                }
                case 3: {
                    Payments payment = new Payments(DEBIT_CARD, amountPaid);
                    payments.add(payment);
                    break;
                }
                case 4: {
                    Payments payment = new Payments(CHECK, amountPaid);
                    payments.add(payment);
                    break;
                }

            }

            double paymentLeft = getTotalAfterPayment(modifiedTotal, amountPaid);
            modifiedTotal = paymentLeft;
            printTotalAfterPayment(modifiedTotal);
            if (modifiedTotal <= 0.0) {
                change = paymentLeft;
                break;
            }
        }

        printFinalReceipt(subTotal, tax, total, change);

    }

    /**
     *
     * @param paymentLeft is a method when user pays after some money left
     */
    private static void printTotalAfterPayment(double paymentLeft) {
        System.out.println("Total after payment: " + paymentLeft);
    }

    /**
     *
     * @param total total money user needs to pay
     * @param amountPaid when user enters differed by total bill
     * @return
     */
    private static double getTotalAfterPayment(double total, double amountPaid) {
        return total - amountPaid;
    }

    /**
     *
     * @param paymentType depends on userChoice cash, credit, debit or check
     * @return
     */
    private static double payments(int paymentType) {
        System.out.println("Enter the amount to pay with this type.");
        double payment = 0.0;
        payment = sc.nextDouble();
        return payment;

    }

    /**
     *
     * @return user choice of type
     */
    private static int paymentsSelection() {
        System.out.println(" Please Enter Payment Type:");
        System.out.println(" 1.Cash");
        System.out.println(" 2.Debit Card");
        System.out.println(" 3.Credit Card");
        System.out.println(" 4.Check");
        int choice = sc.nextInt();
        return choice;

    }

    /**
     *
     * @param total total bill
     */
    private static void printTotal(double total) {
        System.out.println("Total : " + total);
    }

    /**
     *
     * @param total total bill
     * @param tax 7% tax rate
     */
    private static void printSubTotal(double total, double tax) {
        System.out.println("Subtotal : " + total);
    }

    /**
     *
     * @return total bill in for loop
     */
    private static double calculateTotal() {
        double total = 0.0;
        for (Item item : items) {
            total = total + item.getCost();
        }
        return total;
    }

    /**
     *
     * @param total bill
     * @return subtotal
     */
    private static double getTax(double total) {
        return total * salesTaxPercentage;
    }

    /**
     * @param addItems adding items when user prompted to
     */
    private static void addItems() {
        while (true) {
            System.out.println(" Do you wish to add any items? (Y/N):");
            char addYesorNo = sc.next().charAt(0);
            if (addYesorNo == 'Y') {
                System.out.println(" Whats the items name? ");
                String itemName = sc.next();
                System.out.println(" Whats the item's price? ");
                double itemPrice = sc.nextDouble();
                Item item = new Item(itemName, itemPrice, items.size() + 1);
                items.add(item);
            }
            if (addYesorNo == 'N') {
                System.out.println("Stopping to add items");
                break;
            }

        }

        //items.add(e);
    }

    /**
     *
     * @param total bill
     */
    private static void printReceipt(double total) {
        for (Item item : items) {
            System.out.println("Item " + item.getItemNumber() + "\t " + item.getName() + " " + item.getCost());
        }
        printTotal(total);
    }

}
