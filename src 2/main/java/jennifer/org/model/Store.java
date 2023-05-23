package jennifer.org.model;

import java.util.ArrayList;

public class Store {
    private ArrayList<Products> product;
    private ArrayList<Customers> customer;



    public Store(ArrayList<Products> product, ArrayList<Customers> customer) {
        this.product = product;
        this.customer = customer;
    }

    public Store() {

    }

    public ArrayList<Products> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Products> product) {
        this.product = product;
    }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customers> customer) {
        this.customer = customer;
    }
}
