package services;


import jennifer.org.model.Products;

public class CustomerServices {
    public void buyProduct(Products products){
        if(products.getProductQuantity() <= 0){
            System.out.println("Product is unavailable at the moment");
        }else{
            System.out.println("Product is available");
        }

    }
}
