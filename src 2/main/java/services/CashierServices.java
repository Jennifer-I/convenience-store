package services;


import jennifer.org.model.Customers;

public class CashierServices {
    public void sellProducts(Customers customer) {

        if (customer.getWalletBalance() <= 0) {
            System.out.println(customer.getName() + " " + "balance is low to make a purchase");
        } else {
            System.out.println("purchase made! print receipt.");
        }


        }

    }
