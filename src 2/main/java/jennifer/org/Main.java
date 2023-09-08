package jennifer.org;

import jennifer.org.Enums.Gender;
import jennifer.org.model.*;
import services.ManagerServices;
import services.CashierServices;
import services.CustomerServices;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
   
    public static void main(String[] args) {
        Store store = new Store();
        Products productInstance = new Products();


        String filePath = "/Users/decagon/IdeaProjects/week_one_task_sq015-Jennifer-I/src/main/resources/productsList.csv";
        List<Products> productsList  = productInstance.addProductToList(filePath);
        for (Products product : productsList) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Price: " + product.getProductPrice());
            System.out.println("Product Quantity: " + product.getProductQuantity());
            System.out.println("Category: " + product.getCategory());
          System.out.println(product);
        }
          System.out.println(productsList);


      Cashier cashier = new Cashier("lawrence","01124545","male", );
      Manager manager = new Manager("Black", "23456","09044939099", "Blackbond@gmail.com", 10.0);
      Customers customer = new Customers("Daniel", 2000, , 400.25);
      CashierServices cashierServices= new CashierServices();
      CustomerServices CustomerServices = new CustomerServices();
      ManagerServices managerServices = new ManagerServices();

//...........................................................................................................................


       managerServices.Fire(manager);
       managerServices.productStock(manager);
       CustomerServices.buyProduct(productsList);
       cashierServices.sellProducts(customer);



        Products product = new Products("Rice","123",123.0,4,"Gadget");
        Customers customer = new Customers("happy",098, Gender.Female,"123",987.0);

        Store store = new Store(ArrayList<product>,ArrayList <customer>);


    }
}
