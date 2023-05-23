package jennifer.org.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Products {

    private String productName;
    private String productID;
    private Double productPrice;
    private Integer productQuantity;
    private String category;

    public Products(String productName, String productID, Double productPrice, Integer productQuantity, String category) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.category = category;
    }

    public Products() {

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Products> addProductToList(String filePath) {
        List<Products> products = new ArrayList<>();
        BufferedReader storeReader = null;
        try {
            storeReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = storeReader.readLine()) != null) {
                String[] value = line.split(",");

                String productName = value[0];
                String productID = value[1];
                double productPrice = Double.parseDouble(value[2]);
                int productQuantity = Integer.parseInt(value[3]);
                String Category = value[4];
                Products product = new Products(productName,  productID,  productPrice,  productQuantity,  Category);

               products.add(product);
            }
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (storeReader != null) {
                try {
                    storeReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return products;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productName='" + productName + '\'' +
                ", productID='" + productID + '\'' +
                ", productPrice=" + productPrice +
                ", productQuantity=" + productQuantity +
                ", category='" + category + '\'' +
                '}';
    }
}

