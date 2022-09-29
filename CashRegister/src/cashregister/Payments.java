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
public class Payments {

    private String paymentType; // string for payment type

    private double totalPaid; // using double for amount user pays

    /**
     *
     * @param paymentType like cash, credit, or debit etc.,
     * @param totalPaid total amount paid by user
     */
    public Payments(String paymentType, double totalPaid) {
        this.paymentType = paymentType;
        this.totalPaid = totalPaid;
    }

    /**
     *
     * @return payment type
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     *
     * @param paymentType like cash, credit or etc.,
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     *
     * @return getting the total amount paid by user
     */
    public double getTotalPaid() {
        return totalPaid;
    }

    /**
     *
     * @param totalPaid setting it..like entering it ex: 10.13 for total 15
     */
    public void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    /**
     *
     * @return payment type: like ex: Credit: 24
     */
    @Override
    public String toString() {
        return paymentType + ": \t " + totalPaid;
    }

}
