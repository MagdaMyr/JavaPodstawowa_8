package pl.sda.javawwa30.visits;

import javax.xml.crypto.Data;

public class Visit {

    private Customer customer;
    private Data data;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Data data) {
        this.customer = customer;
        this.data = data;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    double getTotalExpense() {
        DiscountRate.getServiceDiscountRate(customer.getMembership());
    }
}