package services;

import jennifer.org.model.Cashier;
import jennifer.org.model.Manager;

public class ManagerServices {
    public void Hire(Manager manager, Cashier cashier){
        System.out.println(manager.getName() + " " + "has hired" + " " + cashier.getName());
    }
    public void Fire(Manager manager){
        System.out.println(manager.getName() + " " + "has fired the cashier");
    }

//   public void productStock(Manager manager) {
//        if (manager.getProductQuantity() < 10) {
//           return manager.setProductQuantity(1000.00);
//       } else {
//           System.out.println("Product in stock");
//       }
//   }
//}

       }